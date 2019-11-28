package comproject;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature");
		int t=s.nextInt();
		double f=(1.8*t)+32;
		System.out.println(f);

	}

}
