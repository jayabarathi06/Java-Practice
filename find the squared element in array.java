import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
           for(int j=0;j*j<=arr[i];j++){  //j<=arr[i]
               if(j*j==arr[i]){
                   count++;
               }
           }
        }
        System.out.print(count);
        
    }
}
