public class butterflyPattern{
	public static void main(String[] args){
		int m = 5;
//outer loop
		for (int i=1; i<=m; i++){
			
			//first quadrant
			for (int j = 1; j<=i; j++){
				System.out.print("*");
			}
			
			//the spaces loop	
			int spaces = 2*(m-i);
			for (int j = 1; j<=spaces; j++){
				System.out.print(" ");
			}
			//second quadrant
			for (int j = 1; j<=i; j++){
				System.out.print("*");
			}	
			
			System.out.println();
		}
		for (int i=m; i>=1; i--){
			
			//third quadrant
			for (int j = 1; j<=i; j++){
				System.out.print("*");
			}
			
			//the spaces loop	
			int spaces = 2*(m-i);
			for (int j = 1; j<=spaces; j++){
				System.out.print(" ");
			}
			
			//fourth quadrant
			for (int j = 1; j<=i; j++){
				System.out.print("*");
			}	
			
			System.out.println();
		}	
	}
}	  