package labor9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates=new ArrayList<>();
        int year=2021,month,day;
        Random random=new Random();

        while(dates.size()!=10){
            month=1+random.nextInt(12);
            day=1+random.nextInt(31);

            if(DateUtil.isValidDate(year,month,day)){
                dates.add(new MyDate(year,month,day));
            }
        }

        System.out.println("Generated dates:");
        System.out.println(dates);
        Collections.sort(dates);
        System.out.println("Sorted:");
        System.out.println(dates);
    }

}