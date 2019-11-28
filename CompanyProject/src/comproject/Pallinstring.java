package comproject;
import java.util.Scanner;
public class Pallinstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int i;
		String reverse="";
		int length=n.length();
		for(i=length-1;i>=0;i--) {
			reverse=reverse+n.charAt(i);
		}
		System.out.println(reverse);

	}

}
