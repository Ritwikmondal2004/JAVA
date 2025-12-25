import java.util.*;
public class exception {
    public static void main(String[] args){
        try{
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int divide=a/b;
        System.out.println(divide);
        }catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("done");
        };
    }
}
