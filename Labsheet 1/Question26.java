import java.util.Scanner;

public class Question26 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five- digit number: ");
        int num = sc.nextInt();
        if (num % 10 == num/10000){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
