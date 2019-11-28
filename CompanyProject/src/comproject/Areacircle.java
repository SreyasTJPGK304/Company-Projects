package comproject;
import java.util.Scanner;
public class Areacircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=s.nextInt();
		double a=3.14*r*r;
		System.out.println("Area : "+a);

	}

}
