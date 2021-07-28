import java.util.Scanner;

public class stringChallengeUdemy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet here: ");
        char input = sc.next().charAt(0);

        switch(input){
            case 'A': case 'B': case 'C' : case 'D': case 'E' :
                System.out.println("It is " + input);
            break;

            default:
                System.out.println("not found");
                break;
        }
    }
}
