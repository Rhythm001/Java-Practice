public class homeworkProblems{
	public static void main(String[] args){
		
//FIRST PROBLEM - PRINT A SOLID RHOMBUS
		int m = 5;
		for (int i = 1; i <= m; i++){
			//inner loop
			for (int j = 1; j<=(m-i); j++){
				System.out.print(" ");
			}
			for (int j = 1; j<=m; j++){
				System.out.print("*");
			}	
				
			System.out.println();
		}
			System.out.println();
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println();
			System.out.println();

//SECOND PROBLEM - PRINT A NUMBER PYRAMID 	
	
		for (int i = 1; i <= m; i++){
			//inner loop
			for (int j = 1; j<=(m-i); j++){
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++){
				System.out.print(i + " ");
			}	
				
			System.out.println();
		}	
			System.out.println();
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println();
			System.out.println();

//THIRD PROBLEM - PRINT A PALINDROMIC PYRAMID 	

		for (int i = 1; i <= m; i++){
			//inner loop
			for (int j = 1; j<=(m-i); j++){
				System.out.print("  ");
			}
			for (int j = i; j>1; j--){
				System.out.print(j + " ");
			}
			for (int j = 1; j<=i; j++){
				System.out.print(j + " ");
			}	
				
			System.out.println();
		}		
		
	

	}
}