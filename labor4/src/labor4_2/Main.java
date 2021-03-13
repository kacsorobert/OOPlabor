package labor4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customers=readCustomers("labor4/lab4_2_input.txt");
        for(Customer customer:customers){
            System.out.println(customer);
        }
    }
    public static ArrayList<Customer> readCustomers(String fileName){
        ArrayList<Customer> customers=new ArrayList<>();
        Scanner scanner=null;
        try {
            scanner=new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("The file doesn't exist!");
            System.exit(1);
        }
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String[] items=line.split(",");

            if(items[0].equals("Customer")){
                customers.add(new Customer(items[1].trim(),items[2].trim()));
            }
            else if(items[0].equals("Account")){
                customers.get(customers.size()-1).addAccount(new BankAccount(items[1].trim()));
                customers.get(customers.size()-1).getAccount(items[1].trim()).deposit(Double.parseDouble(items[2].trim()));
            }
        }
        return customers;
    }
}
