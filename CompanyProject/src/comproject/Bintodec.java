package comproject;
import java.util.Scanner;
public class Bintodec {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter binary number");
		int bin=s.nextInt();
		int dec=0;
		int i=0,r;
		while(bin!=0) {
			r=bin%10;
			dec=dec+(int) (r*Math.pow(2,i));
			bin=bin/10;
			i++;
		}
	
		System.out.println(dec);
			
			
		}

	}


