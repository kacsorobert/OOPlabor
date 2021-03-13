package labor4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        readFilePrintItsLineNumbered("labor4/lab4_1_input.txt");
        ArrayList<Person> persons=readFromCVSFile("labor4/lab4_1_input.csv");
        for(Person person:persons){
            System.out.println(person);
        }
    }
    public static void readFilePrintItsLineNumbered( String fileName ){
        Scanner scanner =null;
        try {
            scanner=new Scanner(new File(fileName));
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("The file doesn't exist!");
            System.exit(1);
        }
        int lineCounter=0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            lineCounter++;
            System.out.println(lineCounter+" "+line);
        }
    }
    public static ArrayList<Person> readFromCVSFile(String fileName){
        ArrayList<Person> persons=new ArrayList<>();
        Scanner scanner=null;
        try {
            scanner=new Scanner(new File (fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("The file doesn't exist!");
            System.exit(1);
            return persons;
        }
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String[] items = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt(items[2].trim());
            persons.add(new Person(firstName,lastName,birthYear));
        }
        return persons;
    }
}
