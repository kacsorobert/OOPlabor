package labor12_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number of products:1000000");
        System.out.println("Number of updates:1000000");
        long start=System.nanoTime();
        Storage storage=new Storage("labor12/data1000000.txt");
        storage.update("labor12/update1000000.txt");
        long finish=System.nanoTime();
        long time=(finish-start)/1000000;
        System.out.println("Execution time:"+time+" ms");
    }
}
