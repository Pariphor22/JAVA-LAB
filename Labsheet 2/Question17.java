import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        int rotated = (n << 2) | (n >>> 30);
        System.out.println("After 32-bit left rotation by 2 = " + rotated);
        sc.close();
    }
}
