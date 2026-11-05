import java.util.Scanner;

public class Question3 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        if (n% 2== 0) {
            System.out.println("The number is Even!");
        }
        else{
            System.out.println("The Number is Odd!");
        }
    }
}
