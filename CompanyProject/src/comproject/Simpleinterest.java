package comproject;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int n=s.nextInt();
		int r=s.nextInt();
		
		int si=p*n*r/100;
		System.out.println(si);

	}

}
