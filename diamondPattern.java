public class diamondPattern{
	public static void main(String[] args){
		int m = 4;
//outer loop
		for (int i=1; i<=m; i++){
			
			//first half
			for (int j = m-i; j>=1; j--){
				System.out.print(" ");//the spaces
			}
			
			//the stars	
			int star = 2*i-1;
			for (int j = 1; j<=star; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}			
		for (int i=1; i<=m; i++){
			
			//second half
			for (int j = 1; j<=i; j++){
				System.out.print(" ");//the spaces
			}
			
			//the stars	
			int star = 2*(m-i+1)-1;
			for (int j = star; j>=1; j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}	  