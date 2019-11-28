package comproject;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter base");
		int b=s.nextInt();
		System.out.println("Enter power");
		int p=s.nextInt();
		int result=1;
		while(p!=0) {
			p--;
			result=result*b;
		}
		
		System.out.println(result);

	}

}
