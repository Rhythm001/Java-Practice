public class FloydsTriangle{
	public static void main(String[] args){
		int m = 5;
		int num = 0;
//outer loop
		for (int i = 1; i <= 5; i++){
			//inner loop
			for (int j = 1; j<=i; j++){
				num++;
				System.out.print(num + " ");
			}	
				
			System.out.println();
		}	
	
	
	}
}