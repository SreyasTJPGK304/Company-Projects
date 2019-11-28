package comproject;
import java.util.Scanner;
public class Searchnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,flag=0;
		System.out.println("Enter elements");
		
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter search element");
		int k=s.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==k) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
			
		}
		if(flag==1) {
			System.out.println("search element found");
		}
		else {
			System.out.println("not found");
		}
		

	}

}
