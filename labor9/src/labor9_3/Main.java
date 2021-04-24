package labor9_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number of products:1000");
        System.out.println("Number of updates:1000");
        long start=System.nanoTime();
        Storage s1=new Storage("labor9/data1000.txt");
        s1.update("labor9/update1000.txt");
        long finish=System.nanoTime();
        long time=(finish-start)/1000000;
        System.out.println("Execution time:"+time+" ms");
        System.out.println();

        System.out.println("Number of products:1000");
        System.out.println("Number of updates:1000000");
        start=System.nanoTime();
        Storage s2=new Storage("labor9/data1000.txt");
        s2.update("labor9/update1000000.txt");
        finish=System.nanoTime();
        time=(finish-start)/1000000;
        System.out.println("Execution time:"+time+" ms");
        System.out.println();

        System.out.println("Number of products:1000000");
        System.out.println("Number of updates:1000");
        start=System.nanoTime();
        Storage s3=new Storage("labor9/data1000000.txt");
        s3.update("labor9/update1000.txt");
        finish=System.nanoTime();
        time=(finish-start)/1000000;
        System.out.println("Execution time:"+time+" ms");
        System.out.println();

        System.out.println("Number of products:1000000");
        System.out.println("Number of updates:1000000");
        start=System.nanoTime();
        Storage s4=new Storage("labor9/data1000000.txt");
        s4.update("labor9/update1000000.txt");
        finish=System.nanoTime();
        time=(finish-start)/1000000;
        System.out.println("Execution time:"+time+" ms");
    }
}
