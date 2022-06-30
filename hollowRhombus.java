public class hollowRhombus{
	public static void main(String[] args){
		int m = 4;
		int n = 5;
//outer loop
		for (int i = 1; i <= m; i++){
			for (int j = m; j>=i; j--){
				System.out.print(" ");
			}
			for (int j = 1; j<=n; j++){
				if ((i==2 || i==3) && (j==2 || j==3 || j==4)){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}	
				
			System.out.println();
		}	
	
	
	}
}