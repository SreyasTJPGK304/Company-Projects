package comproject;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int i,j;
		 String reverse="";
		
		String a="My name is abc";

		 String str[]=a.split(" ");//split two strings
	        
		
	        
	        for(i=0;i<str.length;i++) {
	        	if(i%2!=0) {
	        		for(j=str[i].length()-1;j>=0;j--) {
	        		
	        			System.out.print(str[i].charAt(j));
	        		}
	        		System.out.print(" ");
	        		
	        	}
	        	else {
	        		System.out.print(str[i]+" ");
	        	}
	        	
	        
	}
	}
}


