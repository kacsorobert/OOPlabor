package labor10_2;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isValidDate(int year,int month, int day){
        if(year>0){
            if(month>0 && month<13){
                if(month==2){
                    return (day > 0 && day < 29) || (leapYear(year) && day == 29);
                }

                if(month==4 || month==6 || month==9 || month==11){
                    return day > 0 && day < 31;
                }

                return day > 0 && day < 32;
            }
        }
        return false;
    }
}
