package reverseString;

public class program3 {
	
	public static void main(String[] args) {
		
		String a = "GUCCI";
		String rev ="";
		
		for (int i = a.length()-1;i>=0;i--) 
		{
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
	}

}
