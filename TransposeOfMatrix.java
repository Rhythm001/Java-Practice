import java.util.Scanner;

// For a given matrix of N x M, print its transpose.

public class TransposeOfMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        //INPUT
        System.out.println("Enter the matrix: ");
        for(int i=0; i<=rows-1; i++){
            for(int j=0; j<=columns-1; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //OUTPUT
        System.out.println("Transpose of the given matrix is: ");
        for(int i=0; i<=columns-1; i++){
            for(int j=0; j<=rows-1; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
