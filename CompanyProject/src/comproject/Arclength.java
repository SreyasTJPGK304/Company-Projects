package comproject;
import java.util.Scanner;
public class Arclength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=s.nextInt();
		System.out.println("Enter angle");
		double a=s.nextDouble();
		double f=2*3.14*r*(a/360);
		System.out.println(f);
	

	}

}
