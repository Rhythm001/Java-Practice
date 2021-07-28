import java.util.Scanner;

public class DayOfTheWeekChallenge {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0-6: ");
        int day = sc.nextInt();

        printDayOfTheWeek(day);
    }


    public static void printDayOfTheWeek(int day) {
        String weekDay;
        switch(day){
            case 0:
                weekDay = "Sunday";
                System.out.println(weekDay);
                break;
            case 1:
                weekDay = "Monday";
                System.out.println(weekDay);
                break;
            case 2:
                weekDay = "Tuesday";
                System.out.println(weekDay);
                break;
            case 3:
                weekDay = "Wednesday";
                System.out.println(weekDay);
                break;
            case 4:
                weekDay = "Thursday";
                System.out.println(weekDay);
                break;
            case 5:
                weekDay = "Friday";
                System.out.println(weekDay);
                break;
            case 6:
                weekDay = "Saturday";
                System.out.println(weekDay);
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
