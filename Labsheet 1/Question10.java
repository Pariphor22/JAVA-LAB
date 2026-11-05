import java.util.Scanner;

public class Question10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter two numbers: ");
                int n1 = sc.nextInt() ;
                int n2 = sc.nextInt();
                if (n1<n2){
                    System.out.println("THe greatest number is: "+n2);
                }
                else
                {
                    System.out.println("The greatest number is: "+n1);
                }
    }
}
