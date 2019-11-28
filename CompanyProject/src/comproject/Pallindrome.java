package comproject;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int r,reverse=0;
		int a=n;
		while(n!=0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			
		}
		if(reverse==a) {
			System.out.println("Pallindrome");
			
		}
		else {
			System.out.println("not pallindrome");
		}

	}

}
