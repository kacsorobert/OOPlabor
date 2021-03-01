package labor2_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);

        MyDate date=new MyDate(2021,2,22);

        System.out.println(date.getYear() + "-" + date.getMonth() + "-" + date.getDay());
        System.out.println(date.toString());

        System.out.println(randomDates());
    }
    public static String randomDates(){
        int invalidDates=0;
        Random rand=new Random();

        for(int i=0;i<1000;i++){
            int year=1+rand.nextInt(3000);
            int month=1+rand.nextInt(12);
            int day=1+rand.nextInt(31);

            if(DateUtil.isValidDate(year,month,day)){
                System.out.println(year + "-" + month + "-" + day);
            }
            else{
                invalidDates++;
            }
        }
        return "Invalid dates:" + invalidDates;
    }
}

