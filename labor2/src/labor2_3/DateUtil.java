package labor2_3;

public class DateUtil {
    public static boolean leapYear(int year){
        if((year%4==0 && year%100!=0) || year%400==0){
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year,int month, int day){
        if(year>0){
            if(month>0 && month<13){
                if(month==2 ){
                    if(((day>0 && day<29) || (leapYear(year)==true && day==29))){
                        return true;
                    }
                }
                else if(month==4 || month==6 || month==9 || month==11){
                    if((day>0 && day<31)){
                        return true;
                    }
                }
                else{
                    if(day>0 && day<32){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
