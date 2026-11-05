import java.util.Scanner;

public class Question19 {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter your operator: ");
        char op = sc.next().charAt(0);
        if (op == '+') {
            System.out.println("Result:" + (a + b));
        } else if (op == '-') {
            System.out.println("Result:" + (a - b));
        }
        else if(op =='*'){
            System.out.println("Result:" + (a*b));
        }
        else if(op =='/'){
            System.out.print("Result:" + (a/b));
        }
        else if (op== '%'){
            System.out.println("Result:"+(a%b));
        }
        else{
            System.out.println("Invalid Operator");
        }


    }
}
