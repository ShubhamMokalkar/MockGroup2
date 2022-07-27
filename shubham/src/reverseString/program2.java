package reverseString;

public class program2 {
	
	public static void main(String[] args) {
		
		String a = "MARVEL";    
		String rev ="";
		
		for(int i=a.length()-1;i>=0;i--) // 5 4 3 2 1 0
		{                                
			rev=rev+a.charAt(i);        //  L E V R A M
		}
		
		System.out.println(rev);
				
	}

}
