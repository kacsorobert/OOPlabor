package labor10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream ps= null;
        try {
            ps = new PrintStream("labor10/warnings.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        PrintStream ps2=null;

        try {
            ps2=new PrintStream("labor10/students.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner=null;

        try {
            scanner=new Scanner(new File("labor10/student.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
            System.exit(1);
        }

        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] items=line.split(", ");

            if(items.length<7){
                System.out.println("Incomplete line:"+line);
                continue;
            }

            int credit;
            try{
                credit=Integer.parseInt(items[3].trim());
            }
            catch (NumberFormatException e1){
                System.out.println("Number format exception:"+line);
                continue;
            }

            int year,month,day;
            try {
                year=Integer.parseInt(items[4].trim());
                month=Integer.parseInt(items[5].trim());
                day=Integer.parseInt(items[6].trim());
            }
            catch (NumberFormatException e2){
                System.out.println("Number format exception:"+line);
                continue;
            }

            if(!DateUtil.isValidDate(year,month,day)){
                System.out.println("Invalid date:"+line);
            }

            if(credit<30){
                ps.println(line);
            }
            else{
                ps2.println(line);
            }
        }
        scanner.close();
        ps.close();
    }
}
