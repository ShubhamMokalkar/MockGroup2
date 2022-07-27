package primenumber;

import java.util.Scanner;

public class program7 {
	
	public static void main(String[] args) {
		
		int n, count=0;
		System.out.println("enter any value");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("prime");
		}
		
		else {
			System.out.println("not prime");
		}

		
			
	}

}
