package comproject;
import java.util.Scanner;
public class Dectobin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a[]=new int[100];
		//System.out.println(Integer.toBinaryString(n));
		int j;
		int i=0;
		while(n>0)
		{
			a[i]=n%2;
			n=n/2;
			i++;
			
		}
		for(j=i-1;j>=0;j--) {
			System.out.print(a[j]);
		}
		System.out.println();

	}

}
