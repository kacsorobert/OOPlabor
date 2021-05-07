package labor11_1;

public class TakeSomeFromArray extends Thread{
    private String[] array;
    private String string;
    private int counter;

    public TakeSomeFromArray(String[] array, String string, int counter) {
        this.array = array;
        this.string = string;
        this.counter = counter;
    }

    @Override
    public void run() {
        int changes=0;
        while(Main.counter!=0 && changes!=counter){
            synchronized (this.array){
                for(int i=0;i<array.length;i++){
                    if(array[i].compareTo(string)==0){
                        array[i]=" ";
                        Main.counter--;
                        changes++;
                        print();

                        if(changes==counter){
                            System.out.println(Thread.currentThread().getName()+": "+"String "+"'"+string+"'"+
                                    " has been replaced "+ counter+" times, thread finishes its work");
                        }
                    }
                }
            }
        }
    }

    public void print(){
        System.out.print(Thread.currentThread().getName()+": ");
        System.out.println("String "+"'"+string+"'"+" has been replaced with ' '");
    }
}
