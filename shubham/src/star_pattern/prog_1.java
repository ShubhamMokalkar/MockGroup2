package star_pattern;

public class prog_1 {
	
	public static void main(String[] args) {
		
		int star = 1;
		
		for (int row = 1; row<=5;row++) {
			
			for(int col=1;col<=star;col++) {
				
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
		
		
	
	}

}
