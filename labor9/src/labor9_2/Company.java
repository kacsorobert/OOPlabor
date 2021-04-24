package labor9_2;

import labor9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee){
        if(employee==null){
            System.out.println("You can't assign this person!");
            return;
        }
        employees.add(employee);
    }

    public void hireAll(String fileName){
        Scanner scanner=null;

        try {
            scanner=new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
            System.exit(1);
        }

        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] items=line.split(",");
            if(items.length==7){
                employees.add(new Manager(items[0].trim(),items[1].trim(),Double.parseDouble(items[2].trim()),
                        new MyDate(Integer.parseInt(items[3].trim()),Integer.parseInt(items[4].trim()),
                                Integer.parseInt(items[5].trim())),items[6].trim()));
            }
            else{
                employees.add(new Employee(items[0].trim(),items[1].trim(),Double.parseDouble(items[2].trim()),
                        new MyDate(Integer.parseInt(items[3].trim()),Integer.parseInt(items[4].trim()),
                                Integer.parseInt(items[5].trim()))));
            }
        }
    }

    public void fire(int id){
        if(id<1 || id>employees.size()){
            System.out.println("Employee not found!");
            return;
        }
        employees.remove(id-1);
    }

    public void printAll(PrintStream ps){
        if(employees.size()==0){
            return;
        }
        for(Employee employee:employees){
            ps.println(employee);
        }
    }

    public void printManagers(PrintStream ps){
        if(employees.size()==0){
            return;
        }

        for(Employee employee:employees){
            if(employee instanceof Manager){
                ps.println(employee);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees,comp);
    }
}
