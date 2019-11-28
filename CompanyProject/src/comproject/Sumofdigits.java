package comproject;
import java.util.Scanner;
public class Sumofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,sum=0,r,sum1=0,r1;
		while(n!=0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
					
		}
		while(sum!=0) {
			r1=sum%10;
			sum1=sum1+r1;
			sum=sum/10;
		}
		System.out.println(sum1);
		

	}

}
