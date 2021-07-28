import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        System.out.println(isLeapYear(year));

        if(isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        } else{
            System.out.println(year + " is not a leap year.");
        }

        System.out.println("Enter the month: ");
        int month = sc.nextInt();

        System.out.println("Month " + month + " of year "+ year+ " has "+ getDaysInMonth(month, year) + " days.");

    }

    public static boolean isLeapYear(int year) {
        if(year<1 || year>9999){
            return false;
        }

        if(year%400 == 0){
            return  true;
        } else if (year % 4==0 && year % 100 != 0){
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12){
            return -1;
        }
        if(year<1 || year>9999){
            return -1;
        }
        int daysFeb;

        if(year%400 == 0){
            daysFeb = 29;
        } else if (year % 4==0 && year % 100 != 0){
            daysFeb = 29;
        } else {
            daysFeb = 28;
        }
        switch(month){
            case 1: case 3: case 5: case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                return daysFeb;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}
