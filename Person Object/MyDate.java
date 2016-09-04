
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        this.day++;
        if(this.day>30){
            this.day=1;
            this.month++;
            if(this.month>12){
                this.month=1;
                this.year++;
            }
        }

    }
    
    public void advance(int numberOfDays){
        int base=0;
        while(base<numberOfDays){
            advance();
            base++;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(this.day,this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }

    
    
    public int differenceInYears(MyDate comparedDate){
        if(this.year==comparedDate.year && this.month==comparedDate.month && this.day==comparedDate.day){
            return 0;
        }else if(this.earlier(comparedDate)){
            int difference=comparedDate.year-this.year;
            MyDate afterSomeYears=this.afterNumberOfDays(difference*360);
            if(afterSomeYears.earlier(comparedDate)){
                return difference;
            }else if(afterSomeYears.year==comparedDate.year && afterSomeYears.month==comparedDate.month && afterSomeYears.day==comparedDate.day){
                return 1;
            }else{
                return difference-1;
            }
        }else{
            int difference=this.year-comparedDate.year;
            MyDate afterSomeYears=comparedDate.afterNumberOfDays(difference*360);
            if(afterSomeYears.earlier(this)){
                return difference;
            }else if(afterSomeYears.year==this.year && afterSomeYears.month==this.month && afterSomeYears.day==this.day){
                return 1;
            }else{
                return difference-1;
            }
        }
    }
    
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }
    
    
    
}