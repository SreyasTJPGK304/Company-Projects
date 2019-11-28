package comproject;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		int i,j;
		char x;
		String a=str.toUpperCase();
		char ch[]=a.toCharArray();
		Arrays.sort(ch);
		int fre[]=new int[ch.length];
		int length=str.length();
		
		
		
//		for(i=0;i<length;i++) {
//			for(j=i+1;j<length;j++) {
//				if(ch[i]>ch[j]) {
//					x=ch[i];
//					ch[i]=ch[j];
//					ch[j]=x;
//				}
//				
//			}
//		}
//		for(i=0;i<length;i++) {
//			ch[i]=(char)((int)(ch[i]-32));
//		}
		
		for(i=0;i<ch.length;i++)
		{
			fre[i]=1;
			for(j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j]) 
				{
				fre[i]++;
				ch[j]='0';
			    }
			}
		}
		for(i=0;i<fre.length;i++) {
			if(ch[i]!=' ' && ch[i]!='0') {
				System.out.println(ch[i]+"-"+fre[i]);
				
			}
		}

	}

}
