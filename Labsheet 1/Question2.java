import java.util.Scanner;

public class Question2 {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in) ;
     System.out.println("Enter two numbers: ");
     float a = sc.nextInt();
     float b = sc.nextInt();
      System.out.println("Addition: "+( a+b));
      System.out.println("Substraction: " + (a-b));
      System.out.println("Multiplication: "+ (a*b));
      System.out.println("Division: "+(a/b));
      System.out.println("Modulus: "+(a%b));



    }
}
