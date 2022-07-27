package inheritance;

public class prog_H2 extends prog_H1 {  // herachical inheritance
	
	public void prasad()
	{
		System.out.println("pune");
	}
	
	public void kalyanee()
	{
		System.out.println("paratvada");
	}
	
	public static void main(String[] args) {
		
		prog_H2 s = new prog_H2();
		s.amravti();
		s.malkapur();
		s.kalyanee();
		s.prasad();
	}
	

}
