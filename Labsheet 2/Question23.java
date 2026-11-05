import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt(), temp=n, reverse=0;
        while (temp>0) { reverse=reverse*10+temp%10; temp/=10; }
        if (n>=0 && n==reverse) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        sc.close();
    }
}
