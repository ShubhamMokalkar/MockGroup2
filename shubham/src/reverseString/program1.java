package reverseString;

public class program1 {
	
	public static void main(String[] args) {
		
		String s = "shubham"; //m a h b u h s
		String rev ="";      // 6 5 4 3 2 1 0
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
	}

}
