import java.util.Scanner;
public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int day=1; day<=7; day++) {
            System.out.print("Rainfall on day " + day + ": ");
            total += sc.nextDouble();
        }
        System.out.println("Total rainfall = " + total);
        sc.close();
    }
}
