package comproject;
import java.util.Scanner;
public class Hyptenuse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base");
		int b=s.nextInt();
		System.out.println("Enter altitude");
		int a=s.nextInt();
		int h=(b*b)+(a*a);
		int hyp=(int) Math.sqrt(h);
		System.out.println(hyp);

	}

}
