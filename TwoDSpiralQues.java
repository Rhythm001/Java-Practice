import java.util.Scanner;

// Print the spiral order matrix as output for a given matrix of numbers. 

public class TwoDSpiralQues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt(); //n = number of rows
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        int[][] array = new int[n][m];
        //Input
        System.out.println("Enter the array: ");
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=m-1; j++){
                array[i][j] = sc.nextInt();
            }
        }

        //Output-Procedure
        int row_start = 0;
        int row_end = n-1;
        int column_start = 0;
        int column_end = m-1;

        while(row_start<=row_end && column_start<=column_end){
            for(int i=column_start; i<=column_end; i++){
                System.out.print(array[row_start][i] + " ");
            }
            row_start ++;
            for(int i=row_start; i<=row_end; i++){
                System.out.print(array[i][column_end] + " ");
            }
            column_end --;
            for(int i=column_end; i>=column_start; i--){
                System.out.print(array[row_end][i] + " ");
            }
            row_end --;
            for(int i=row_end; i>=row_start; i--){
                System.out.print(array[i][column_start] + " ");
            }
            column_start ++;
            
        }
        sc.close();
    }
}