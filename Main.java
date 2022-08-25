import java.util.*;
public class Main {
  public static void calculateDays(int temp){
      int day=temp*365;
      System.out.println("days in your age is : "+day);
  }
  public static void calculateMonths(int temp1){
      int months=temp1*12;
      System.out.println("months in your age is :"+months);
  }
  public static void calculateWeeks(int temp2){
      int weeks=temp2*(12*4);
      System.out.println("weeks in your age is :  "+weeks);
  }
   public static void calculateAge(int ageA,int monthsM,int dayD)
   {
       System.out.println("your age is : "+ageA+" years "+" "+monthsM+" months and "+" "+dayD+" days");
    }
    public static void calculateLeapYear(int leap){
        System.out.println("lepa years in your age is :  "+leap);
    }
    public static void main(String[] args) {
      int date,month,bornYear,currentYear,age,leapYear=0,currentMonth,currentDate;
        Scanner sc=new Scanner(System.in);
        //
        System.out.println("enter your birth date :");
        //
        date= sc.nextInt();
        System.out.println("enter your birthday month :");
        //
        month=sc.nextInt();
        System.out.println("enter your birth year :");
        //
        bornYear= sc.nextInt();
        System.out.println("your date of birth is : "+date+" / "+month+" / "+bornYear);
        //
        System.out.println("enter current year :");
        currentYear=sc.nextInt();
        //
        System.out.println("enter the current month ");
        currentMonth=sc.nextInt();
        //
        System.out.println("enter the current date ");
        currentDate=sc.nextInt();
        //
        age=currentYear-bornYear;
        //
        int daysAgo=currentDate-date;
        //
        int currentMonths=currentMonth-month;
        //
        int monthDiff = (12 - month) +  currentMonth;
        //
        if (age == 1 && (currentMonth < 12))
        {
           int  ageInMonth = monthDiff;
            System.out.println(" age in months is  : "+ageInMonth);
        }
        else{
            calculateAge(age,currentMonths,daysAgo);
        }
        calculateDays(age);
        //
        calculateMonths(age);
        //
        calculateMonths(age);
        while(bornYear!=currentYear){
            if (((bornYear % 4 == 0) && (bornYear % 100 != 0)) || (bornYear % 400 == 0)){
                leapYear++;
            }
            bornYear++;
        }
        calculateLeapYear(leapYear);

    }

}