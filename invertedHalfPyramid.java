public class invertedHalfPyramid{
	public static void main(String[] args){
		int m = 3;
		
		
//outer loop
		for (int i =0; i<=m; i++){
			//inner loop
			for (int j = 0; j<=m-i; j++){
				System.out.print("*");
			}	
				
			System.out.println();
		}	
	
//OR WE CAN USE (int i=m; i>=1; i--)
	
	}
}