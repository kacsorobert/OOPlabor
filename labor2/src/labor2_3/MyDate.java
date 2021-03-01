package labor2_3;

public class MyDate {
    private int year,month,day;

    public MyDate(int year,int month,int day){
        if(DateUtil.isValidDate(year,month,day)==false){
            return;
        }
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        return "My date:" + this.year + " - " + this.month + " - " + this.day;
    }
}
