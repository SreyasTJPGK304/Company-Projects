package comproject;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j;
		String str="F A C E";
		
		
	
		int n=str.length();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i == 1) {
					System.out.print(str );
				}
					
				
				
				
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println("\n");
			
		}
	

	}

}
