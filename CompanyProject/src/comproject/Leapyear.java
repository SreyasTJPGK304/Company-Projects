package comproject;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year");
		int y=s.nextInt();
		if(y%4==0) {
			if(y%100==0) {
				if(y%400==0) {
					System.out.println("Leap year");
				}
				else {
					System.out.println("not a leap year");
				}
			}
			else {
				System.out.println("Leap year");
				
			}
		}
		else {
			System.out.println("not a leap year");
			
		}

	}

}
