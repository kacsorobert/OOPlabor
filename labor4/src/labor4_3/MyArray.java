package labor4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private double[] elements;
    private int length;

    public MyArray(int length) {
        this.length = length;
        elements=new double[this.length];
    }

    public MyArray(double[] elements) {
        this.length=elements.length;
        this.elements=new double[this.length];
        for(int i=0;i<this.length;i++){
            this.elements[i]=elements[i];
        }
    }

    public MyArray(MyArray array){
        this.length=array.length;
        this.elements=new double[this.length];
        for(int i=0;i<this.length;i++){
            this.elements[i]=array.elements[i];
        }
    }

    public  MyArray(String fileName){
        Scanner scanner=null;
        try {
            scanner=new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("The file doesn't exist!");
            System.exit(1);
        }
        String line=scanner.nextLine();
        this.length=Integer.parseInt(line.trim());

        line=scanner.nextLine();
        String[] items=line.split(" ");

        this.elements=new double[this.length];
        for(int i=0;i<length;i++){
            this.elements[i]=Double.parseDouble(items[i]);
        }
    }

    public void fillRandom(double a,double b){
        Random random=new Random();

        for(int i=0;i<length;i++){
            elements[i]= a+random.nextDouble()*(b-a);
        }
    }

    public double mean(){
        if(length==0){
            return Double.NaN;
        }

        double sum=0;
        for(int i=0;i<length;i++){
            sum+=elements[i];
        }
        return sum/length;
    }

    public double stddev(){
        if(length==0){
            return Double.NaN;
        }

        double average=mean();
        double sum=0;
        for(int i=0;i<length;i++){
            sum+=Math.pow((elements[i]-average),2);
        }
        sum/=length;

        return Math.sqrt(sum);
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void print(String name){
        System.out.print(name+": ");
        for(int i=0;i<length;i++){
            System.out.print(elements[i]+" ");
        }
        System.out.println();
    }
}
