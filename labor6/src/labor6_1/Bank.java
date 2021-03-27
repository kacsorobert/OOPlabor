package labor6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private final String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        customers=new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        if(customer==null){
            System.out.println("This is not a valid customer!");
            return;
        }
        customers.add(customer);
    }

    public Customer getCustomer(int customerId) {
        if(customerId<1 || customerId>customers.size()){
            System.out.println("This customer does not exist!");
            return null;
        }
        return customers.get(customerId-1);
    }

    public int numCustomers(){
        return customers.size();
    }

    private void printCustomers(PrintStream ps){
        ps.println("ID, Firstname, Last name, Bank accounts");
        for(Customer customer:customers){
            ps.println(customer);
//            ps.println(customer.getId()+", " + customer.getFirstName() +", "+
//                    customer.getLastName());
//            for(int i=0;i<customer.getNumAccounts();i++){
//                ps.println("\t" + customer.get);
//            }
            }
    }

    public void printCustomersToStdout(){
        printCustomers(System.out);
    }

    public void printCustomersToFile(String filename){
        try {
            printCustomers(new PrintStream(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
