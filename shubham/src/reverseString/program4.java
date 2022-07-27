package reverseString;

public class program4 {
	
	public static void main(String[] args) {
		
		String x = "SUPPI";
		String rev ="";
		
		for(int i=x.length()-1;i>=0;i--) 
		{
			rev=rev+x.charAt(i);
		}
		
		System.out.println(rev);
	}

}
