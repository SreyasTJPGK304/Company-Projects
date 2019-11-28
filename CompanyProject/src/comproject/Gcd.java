package comproject;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=s.nextInt();
		System.out.println("Enter second number");
		int num2=s.nextInt();
		int p=num1*num2;
		int i,gcd=0,lcm=0;
		for(i=2;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
				lcm=p/gcd;
			}
			
			
		}
		System.out.println(gcd);
		System.out.println(lcm);
		
	

	}

}
