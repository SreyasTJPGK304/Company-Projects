package comproject;
import java.util.Scanner;
public class Smallno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int min=0;;
		int b=min;
		System.out.println("Enter limit");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		int i;
		for(i=1;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
				i++;
			}
		}
		System.out.println(b);

	}

}
