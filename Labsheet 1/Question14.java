import java.util.Scanner;

public class Question14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch)){
            System.out.println("IS a digit");
        }
        else if (Character.isUpperCase(ch)){
            System.out.println("Is uppercase");
        }
        else if (Character.isLowerCase(ch)){
            System.out.println("Is lowercase");
        }
        else{
            System.out.print("Is a special character");
        }

    }
}
