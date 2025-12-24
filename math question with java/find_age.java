import java.util.Scanner;
public class find_age {

    public static void main(String[] aargs){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score--");
        int score=scanner.nextInt();
        if(score>=90){
            System.out.println("A");
        }
        else if(score>=70&&score<90){
            System.out.println("B");
        }
        else if(score>=50&&score<70){
            System.out.println("C");
        }
        else if(score>=35&&score<50){
            System.out.println("D");
        }
        else{
            System.out.println("FAIL");
        }
    }
    
}
