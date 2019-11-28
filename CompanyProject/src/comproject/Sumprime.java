package comproject;
import java.util.Scanner;
public class Sumprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,count=0,j,sum=0;
		System.out.println("enter lower limit");
		int s1=s.nextInt();
		System.out.println("enter upper limit");
		int s2=s.nextInt();
		for(i=s1;i<=s2;i++) {
			count=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					
					count++;
						
						break;
					}
				}
		
			if(count==0 && i!=1) {
				sum=sum+i;
			}
		}
			System.out.println(sum);
			
				
			
		}
		

	}


