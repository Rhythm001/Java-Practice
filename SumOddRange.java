import java.util.Scanner;

public class SumOddRange {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the start number here: ");
    int start = sc.nextInt();
    
    System.out.println("Enter the end number here: ");
    int end = sc.nextInt();
    
    System.out.println(sumOdd(start, end));
  }
  
  public static boolean isOdd(int number){    
    if(number<0){
      return false;
    }
    
    if(number % 2 == 0 ){
      return false;
    } else {
      return true;
    }
  }
  
  public static int sumOdd(int start, int end){
    int sum = 0;
    if((start > end)|| start<0 || end<0){
      return -1;
    }
    
    for(int i = start; i <= end; i++){
      if (isOdd(i)){
        sum = sum + i;
      }
    }
    return sum;
  }
}

