import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt(), count=0, value=n;
        while (value!=0) { count += value & 1; value >>>= 1; }
        System.out.println("Number of set bits = " + count);
        sc.close();
    }
}
