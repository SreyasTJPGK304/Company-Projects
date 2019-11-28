package comproject;
import java.util.Scanner;
public class Arraylcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j,min=0,max=0,x,lcm=0;
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					min=a[j];
					max=a[i];
				}
				else {
					min=a[i];
					max=a[j];
				}
			}
		}
		for(i=0;i<n;i++) {
			x=max*i;
			if(x%min==0) {
				lcm=x;
			}
		}
		System.out.println(lcm);
		
		}

	

}
