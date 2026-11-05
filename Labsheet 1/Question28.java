import java.util.Scanner;

public class Question28 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num= sc.nextInt();
        if (num>0 && num<9){
            System.out.println("One digit number.");
        }
        else if (num>=9 && num<100){
            System.out.println("Two digit number");
        }
        else if (num>100 && num<1000){
            System.out.println("Three digit number");
        }
        else if (num>1000 && num<10000){
            System.out.println("Four digit number");
        }
        else{
            System.out.println("Above four digit number");
        }
    }
}
