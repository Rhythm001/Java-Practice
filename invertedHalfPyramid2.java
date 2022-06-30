public class invertedHalfPyramid2{
	public static void main(String[] args){
		int m = 4;
		
		
//outer loop
		for (int i =1; i<=m; i++){
			//inner loop
			for (int j = 1; j<=m-i; j++){
				System.out.print(" ");
			}
			for (int k = 1; k<=i; k++){
				System.out.print("*");
			}	
			
			System.out.println();
		}	
	
	}
}
