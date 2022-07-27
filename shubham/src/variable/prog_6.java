package variable;

public class prog_6 {
	static int a = 10;  //static variable
	
	int b = 20;  // global variable
	
	public static void main(String[] args) {
		
		int c = 30; // local variable
		
		prog_6 ref = new prog_6();
		
		System.out.println(prog_6.a);
		System.out.println(ref.b);
		System.out.println(c);
	}

}
