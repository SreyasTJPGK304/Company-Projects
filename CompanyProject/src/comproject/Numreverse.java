package comproject;
import java.util.Scanner;
public class Numreverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int reverse=0,r;
		while(n>0) {
	
		r=n%10;
		reverse=reverse*10+r;
		n=n/10;
		}
		System.out.println(reverse);
		

	}

}
