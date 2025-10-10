import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();//sc.nextLine().toLowerCase();
           int v=0,c=0;
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){//if it is characters it allows
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		        v++;
		    }
		     else{
		         c++;
		     }
		    }
		}System.out.print("consonents:"+c);
		      System.out.print("\nvowels:"+v); 
	}
}
