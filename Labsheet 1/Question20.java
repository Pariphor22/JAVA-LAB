import java.util.Scanner;

public class Question20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Gender: ");
        String Gender = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (Gender == "Male"|| Gender == "male"){
            if (age>=21){
                System.out.println("ELigible for marriage.");
            }
            else {
                System.out.println("Not eligible for marriage!");
            }
        }
        else{
            if(age>=18){
                System.out.println("Eligible for marriage");
            }
            else{
                System.out.println("Not eligible for marriage!");
            }
        }
    }
}
