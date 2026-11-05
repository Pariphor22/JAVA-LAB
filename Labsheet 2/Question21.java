import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt(), i=1;
        if (n==0) System.out.println("Every non-zero integer is a factor of 0.");
        else {
            do {
                if (n%i==0) System.out.print(i + " ");
                i++;
            } while (i<=Math.abs(n));
        }
        sc.close();
    }
}
