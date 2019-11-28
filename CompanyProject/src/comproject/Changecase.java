package comproject;
import java.util.Scanner;
public class Changecase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter case");
		char c=s.next().charAt(0);
		if(c>='a' && c<='z') {
			c=(char) (c-32);
			System.out.println(c);
		}
		else if(c>='A' && c<='Z') {
			c=(char) (c+32);
			System.out.println(c);
		}
		

	}

}
