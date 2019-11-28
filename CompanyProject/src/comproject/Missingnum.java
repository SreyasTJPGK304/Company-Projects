package comproject;
import java.util.Scanner;
public class Missingnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		   int[]a = new int[n];
		   int i;
		   System.out.println("Enter elements");
		   for(i=0;i<n;i++) {
			   a[i]=s.nextInt();
		   }
		 
		   int expected_num_sum = n * ((n + 1) / 2);
//		   int sum = 0;
//		   for (i=0;i<n;i++) {
//		    sum = sum+i;
//		   }
		       System.out.print( expected_num_sum - n);
			   System.out.print("\n");
	}

}
