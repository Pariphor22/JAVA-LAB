import java.util.Scanner;

public class Question22 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimentions (length and breadth): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.print("Its a square");
        }
        else{
            System.out.println("Its a rectangle");
        }
    }
}
