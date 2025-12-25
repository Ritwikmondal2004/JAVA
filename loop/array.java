import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the array length=");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("enter the array element=");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
             sum+=arr[i];
        }
        System.out.println("sum of the number=="+sum);

    }
}
