package star_pattern;

public class prog_5 {

	public static void main(String[] args) {
		
		int star = 1;
		int space =4;
		
		for(int row =1; row<=5;row++) 
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int col=1;col<=star;col++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
	}
}
