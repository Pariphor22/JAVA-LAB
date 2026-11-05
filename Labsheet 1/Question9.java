import java.util.Scanner;

public class Question9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  marks of three  subjects: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3= sc.nextInt();
        double t = ( ( n1 + n2 + n3) * 100.0)  / 300;
        System.out.println("Total percentage: "+t);
        if (t>40){
            System.out.println("PASS!");
        }
        else{
            System.out.print("FAIL!");
        }

    }
}
