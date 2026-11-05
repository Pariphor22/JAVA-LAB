import java.util.Scanner;

public class Question25 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print("Enter your operator: ");
        String op= sc.next();
        if(op.equals("&&")){
            System.out.println(a>0 && b>0);
        }
        else if(op.equals("||")){
            System.out.println(a>0 ||b>0);
        }
        else if(op.equals("!")){
            System.out.println(!(a>0));
        }
        else{
            System.out.println("Invalid Operator");
        }


    }
}
