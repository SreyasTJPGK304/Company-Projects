package comproject;
import java.util.Scanner;
public class prime1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i,flag=0;
		for(i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("not a prime number");
		}

	}

}
