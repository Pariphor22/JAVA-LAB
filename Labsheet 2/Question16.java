import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and shift count: ");
        int n=sc.nextInt(), k=sc.nextInt();
        System.out.println("Multiplication by 2^" + k + " = " + (n << k));
        System.out.println("Division by 2^" + k + " = " + (n >> k));
        sc.close();
    }
}
