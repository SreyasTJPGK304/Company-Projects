package comproject;
import java.util.Scanner;
public class Perfsquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
	
		int p=(int) Math.sqrt(n);
		int q=p*p;
		if(q==n) {
			System.out.println("Perfect square");
		}
		else {
			System.out.println("not perfect square");
		}

	}

}
