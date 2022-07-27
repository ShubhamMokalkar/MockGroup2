package nested_if;

public class prog_1 {

	public static void main(String[] args) {
		
		String UN ="SHUBHAM";
		String PW ="123";
		
		if(UN=="SHUBHAM") {
			System.out.println("UN is correct");
			
			if(PW=="123") {
				System.out.println("PW is correct");
				System.out.println("login successfuly");}
				
				else {
				System.out.println("WRONG PASSSWORD");	
				System.out.println("LOG IN IS FALIED");
				}
			}
		else {
			System.out.println("wrong user name");
			System.out.println("wrong password");
		}
		}
	}

