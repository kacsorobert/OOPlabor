package labor12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bac {
    private Map<Integer,Student> students=new HashMap<>();
    private int passed;
    private Set<Student> failedStudents=new TreeSet<>();

    public Bac(String fileName){
        try (Scanner scanner=new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] items=line.split(" ");

                students.put(Integer.parseInt(items[0].trim()),new Student(Integer.parseInt(items[0].trim()),
                        items[1].trim(),items[2].trim()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: "+fileName);
            System.exit(1);
        }
    }

    public void readMarks(String fileName,String subject){
        try (Scanner scanner=new Scanner(new File(fileName))){
            int ID;
            double mark;
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");

                ID=Integer.parseInt(items[0].trim());
                mark=Double.parseDouble(items[1].trim());

                switch (subject) {
                    case "Mathematics" -> students.get(ID).setMathMark(mark);
                    case "Hungarian" -> students.get(ID).setHunMark(mark);
                    case "Romanian" -> students.get(ID).setRoMark(mark);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }
    }

    public boolean hasPassed(int ID){
        double mathMark=students.get(ID).getMathMark();
        double hunMark=students.get(ID).getHunMark();
        double roMark=students.get(ID).getRoMark();
        double average=(mathMark+hunMark+roMark)/3;

        if(mathMark>=5 && hunMark>=5 && roMark>=5 && average>=6){
            students.get(ID).setAverage(average);
            return true;
        }
        return false;
    }

    public void printResults(){
        for(Map.Entry student:students.entrySet()){
            if(hasPassed((int)student.getKey())){
                passed++;
            }
            failedStudents.add((Student) student.getValue());
        }
        System.out.println("Number of students who have successfully passed the BAC exam:"+passed);
        System.out.println();
        System.out.println("List of students in alphabetical order who have failed the BAC exam:");
        for(Student student:failedStudents){
            System.out.println(student.getFirstName()+" "+student.getLastName());
        }
    }
}
