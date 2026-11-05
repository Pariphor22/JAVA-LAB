import java.util.Scanner;

public class Question15 {
    static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n= sc.nextInt();
        int a = (n /100);
        int b = ((n /10) % 10);
        int c = n % 10 ;
        int sum = ((a*a*a) + (b*b*b) + (c*c*c));
        if (n == sum){
            System.out.println("Is a Armstrong number!");
        }
        else{
            System.out.print("Not a Armstrong number!");
        }


    }

}
