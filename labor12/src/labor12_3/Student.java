package labor12_3;

public class Student implements Comparable<Student>{
    private final int ID;
    private String firstName;
    private String lastName;
    private double mathMark;
    private double hunMark;
    private double roMark;
    private double average;

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }

    public void setHunMark(double hunMark) {
        this.hunMark = hunMark;
    }

    public void setRoMark(double roMark) {
        this.roMark = roMark;
    }

    public double getMathMark() {
        return mathMark;
    }

    public double getHunMark() {
        return hunMark;
    }

    public double getRoMark() {
        return roMark;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student student) {
        if(this.getFirstName().equals(student.getFirstName())){
            return this.getLastName().compareTo(student.getLastName());
        }
        return this.firstName.compareTo(student.getFirstName());
    }
}
