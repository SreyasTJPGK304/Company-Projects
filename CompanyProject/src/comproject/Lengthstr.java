package comproject;
import java.util.Scanner;
public class Lengthstr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.next();
		int i=0;
		for(char c:str.toCharArray()) {
			i++;
		}
		System.out.println(i);

	}

}
