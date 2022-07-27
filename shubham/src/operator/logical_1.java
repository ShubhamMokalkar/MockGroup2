package operator;

public class logical_1 {
	
	public static void main(String[] args) {
		
		// && operator(and)
		
		System.out.println((20>15)&&(20>10)); // true bcz both expression are true
		System.out.println((20>15)&&(20<10));// false bcz only one expression is true
		
		
		// || (OR) operator
		
		System.out.println((20>15)||(20>10));// true
		System.out.println((20>15)||(20<10));//true
		
		//! not operator
		
		System.out.println(!(3==5)); //true
		System.out.println(!(5>3));// false
 		
		
		
	}

}
