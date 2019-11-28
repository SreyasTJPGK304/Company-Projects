package comproject;
import java.util.Scanner;
public class Strong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i,fact=1,sum=0,r;
		while(n>0) {
			r=n%10;
			for(i=0;i<n;i++) {
			fact=fact*i;
			sum=sum+fact;
			n=n/10;
			}
		}
		
		if(sum==n) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("not a strong number");
		}

	}

}
