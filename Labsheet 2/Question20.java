import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct="java123", entered;
        do {
            System.out.print("Enter password: ");
            entered=sc.nextLine();
        } while (!entered.equals(correct));
        System.out.println("Correct password. Access granted.");
        sc.close();
    }
}
