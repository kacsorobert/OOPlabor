package labor12_3;

public class Main {
    public static void main(String[] args) {
        Bac bac=new Bac("labor12/nevek1.txt");
        bac.readMarks("labor12/matek.txt","Mathematics");
        bac.readMarks("labor12/magyar.txt","Hungarian");
        bac.readMarks("labor12/roman.txt","Romanian");
        bac.printResults();
    }
}
