package comproject;
import java.util.Scanner;
public class Fibreverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		a[0]=0;
		a[1]=1;
		for(i=2;i<n;i++) {
			a[i]=a[i-2]+a[i-1];
			
		}
		for(i=n-1;i>=0;i--) {
			System.out.printf("%d ",a[i]);
		}

	}

}
