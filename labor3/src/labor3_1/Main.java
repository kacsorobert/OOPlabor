package labor3_1;

public class Main {
    public static void main(String args[]){
        System.out.println("labor3_1");

        Customer customer1=new Customer("John","BLACK");
        System.out.println(customer1);

        customer1.setAccount(new BankAccount("OTP1"));
        System.out.println(customer1);

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);

        Customer customer2=new Customer("Mary","WHITE");
        customer2.setAccount(new BankAccount("OTP2"));
        customer2.getAccount().deposit(200);
        System.out.println(customer2);

        customer2.closeAccount();
        System.out.println(customer2);

        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
