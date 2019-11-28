package comproject;
import java.util.Scanner;
public class Nfib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int a[]=new int[n+2];
		a[0]=0;
		a[1]=1;
		int i;
		
		
			for(i=2;i<=n;i++) {
				a[i] = a[i-1] + a[i-2]; 
			}
			
			System.out.println(a[n]);
		}
		

	}


