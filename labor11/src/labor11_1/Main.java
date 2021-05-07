package labor11_1;

public class Main {
    static int counter=300;

    public static void main(String[] args) {
        String[] sa_array=new String[10];
        for(int i=0;i<sa_array.length;i++){
            sa_array[i]=" ";
        }

//        Thread producer=new AddToArray(sa_array);
//        Thread consumer=new TakeSomeFromArray(sa_array,"bbb",5);
//        producer.start();
//        consumer.start();

        Thread producer1=new AddToArray(sa_array);
        Thread producer2=new AddToArray(sa_array);
        Thread producer3=new AddToArray(sa_array);
        Thread producer4=new AddToArray(sa_array);
        Thread consumer1=new TakeSomeFromArray(sa_array,"bbb",5);
        Thread consumer2=new TakeSomeFromArray(sa_array,"bbb",5);
        Thread consumer3=new TakeSomeFromArray(sa_array,"bbb",5);
        producer1.start();
        producer2.start();
        producer3.start();
        producer4.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
