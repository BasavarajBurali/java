package programCollection;

public class LeapYear {
    public static void main(String[] args) {
        int year=2020;
        if((year%4==0)||(year%400==0)&& (year%100!=0)){
            System.out.println("its leap Year"+year);

        }else{
            System.out.println("its not leap year"+" "+year);
        }

    }
}
