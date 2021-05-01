package labor10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=null;

        scanner=new Scanner(System.in);

        System.out.print("Input line:");
        String line=scanner.nextLine();
        String[] items=line.split(" ");

        double sum=0;

        for(String item:items){
            try{
                sum+=Double.parseDouble(item.trim());
            }
            catch (NumberFormatException e1){
                System.out.println(item+" is not a number!");
            }
        }

        System.out.println("Sum:"+sum);
    }
}
