package inheritance;

public class interface_c implements interface_a,interface_b{  // multiple inheritance by using interface
	
	public void s1() 
	{
		System.out.println("s1 is running");	
	}
	
	public void s2()
	{
		System.out.println("s2 is running");
	}
	
	public void s3()
	{
		System.out.println("s3 is running");
	}
	
	public void s4()
	{
		System.out.println("s4 is running");
	}
	
	
	public static void main(String[] args)
	{
		interface_c x = new interface_c();
		
		x.s1();
		x.s2();
		x.s3();
		x.s4();
	}
	

}
