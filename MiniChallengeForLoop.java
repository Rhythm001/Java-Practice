public class MiniChallengeForLoop {
    public static void main(String[] args) {
      
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number here: ");
      
      int input = sc.nextInt();
      //asking user imput for the first number.

      System.out.println("Enter the second number here: ");
      int input2 = sc.nextInt();
    // Asking user input for the second number.
        
      
      
      primeChallenge(input, input2);

    }
    public static void primeChallenge(int input) {
        int num = 0;
        for (int i = 1; i <= input; i++){
            if (isPrime(i)){
                if (num==3){
//if you want to find more than 3 prime numbers in between, just change the 3 number here to 10.
                    System.out.println("There are 3 or more primes in between.");
                    break;
                }
                num = num + 1;
            }
        }
        System.out.println("The number of primes before or between = " + num);
    }



    public static boolean isPrime(int n) {
        if (n==1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

  
}
