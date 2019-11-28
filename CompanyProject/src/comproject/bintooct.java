package comproject;
import java.util.Scanner;
public class bintooct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bin=s.nextInt();
		int oct=0,dec=0,r1,r2;
		int i=0;
		while(bin!=0) {
			r1=bin%10;
			dec=dec+(int)(r1*Math.pow(2,i));
			bin=bin/10;
			i++;
		}
		i=1;
		while(dec!=0) {
			r2=dec%8;
			oct=oct+r2*i;
			dec=dec/8;
			i=i*10;
		}
		System.out.println(oct);

	}

}
