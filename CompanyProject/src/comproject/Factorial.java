package comproject;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
			
		
		System.out.println(fact);

	}

}
