package comproject;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		int i,max=0;
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(i=0;i<n;i++) {
		if(a[i]>=max) {
			max=a[i];
		}

	}
		System.out.println(max);
	}

}
