import java.util.Scanner;

public class Question7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int n = sc.nextInt();
        if (n%3==0 && n%5 ==0){
            System.out.println("Divisible!");

        }
        else{
            System.out.println("Not Divisible!");
        }
    }
}
