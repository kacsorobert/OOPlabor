package labor3_2;

import labor3_1.BankAccount;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Customer customer1=new Customer("John","BLACK");
        Customer customer2=new Customer("Mary","WHITE");

        for(int i=1;i<6;i++){
            customer1.addAccount(new BankAccount("OTP"+i));
        }

        for(int i=6;i<15;i++){
            customer2.addAccount(new BankAccount("OTP"+i));
        }

        System.out.println(customer1);
        System.out.println(customer2);

        Random rand=new Random();

        for(int i=1;i<6;i++){
            customer1.getAccount("OTP"+i).deposit(rand.nextInt(1000));
        }

        for(int i=6;i<15;i++){
            customer2.getAccount("OTP"+i).deposit(rand.nextInt(1000));
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP1");
        customer2.closeAccount("OTP14");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
