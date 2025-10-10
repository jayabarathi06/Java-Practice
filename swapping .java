import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	   
	    System.out.printf("Before swapping:a=%d,b=%d\n",a,b);
	    int temp=a;                                              //swapping with three variables
	    a=b;
	    b=temp;
	     
	     System.out.printf("After swapping:a=%d,b=%d",a,b);
	       
	    }
}
        //Another logi without three varaiable
        //a=a^b;
        //b=b^a;
        //a=a^b;               //Using xor operators
