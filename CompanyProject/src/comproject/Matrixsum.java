package comproject;
import java.util.Scanner;
public class Matrixsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int r=s.nextInt();
		int c=s.nextInt();
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		int sum[][]=new int[r][c];
		int i,j;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m1[i][j]=s.nextInt();
			}
			}
		
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m2[i][j]=s.nextInt();
			}
			}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				sum[i][j]=m1[i][j]+m2[i][j];
				System.out.println(""+sum[i][j]);
			}
		}
		
	}

}
