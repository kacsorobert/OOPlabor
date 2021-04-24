package labor9_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company=new Company("Sapi");
        company.hireAll("labor9/employees.csv");
        company.printAll(System.out);

        System.out.println();
        System.out.println("Alphabetically: ");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getFirstName().equals(e2.getFirstName())){
                    return e1.getLastName().compareTo(e2.getLastName());
                }
                return e1.getFirstName().compareTo(e2.getFirstName());
            }
        });
        company.printAll(System.out);

        System.out.println();
        System.out.println("Decreasing salary order:");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int)(e2.getSalary()-e1.getSalary());
            }
        });
        company.printAll(System.out);

        System.out.println();
        System.out.println("Managers followed by employees, both categories sorted alphabetically:");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1 instanceof Manager && e2 instanceof Manager){
                    if(e1.getFirstName().equals(e2.getFirstName())){
                        return e1.getLastName().compareTo(e2.getLastName());
                    }
                    return e1.getFirstName().compareTo(e2.getFirstName());
                }

                if(e1 instanceof Manager || e2 instanceof Manager){
                    if(e1 instanceof Manager){
                        return -1;
                    }
                    return 1;
                }

                if(e1.getFirstName().equals(e2.getFirstName())){
                    return e1.getLastName().compareTo(e2.getLastName());
                }
                return e1.getFirstName().compareTo(e2.getFirstName());
            }
        });
        company.printAll(System.out);
    }
}
