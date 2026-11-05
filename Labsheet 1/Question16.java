import java.util.Scanner;

public class Question16 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        double income = sc.nextDouble();
        if (income<= 250000){
            System.out.print("No tax!");
        }
        else if (income<=250001){
            System.out.println(" 5% tax!");
        }
        else if (income<=500001 && income< 1000000){
            System.out.println("20% tax!");
        }
        else {
            System.out.println("30% tax!");
        }

    }
}
