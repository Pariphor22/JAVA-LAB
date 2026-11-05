import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory, practical and overall marks (%): ");
        double theory=sc.nextDouble(), practical=sc.nextDouble(), overall=sc.nextDouble();
        if ((theory>=40 && practical>=50) || overall>=50)
            System.out.println("Pass");
        else System.out.println("Fail");
        sc.close();
    }
}
