import java.util.Scanner;
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt(), temp=Math.abs(n), reverse=0;
        while (temp>0) { reverse=reverse*10+temp%10; temp/=10; }
        if (n<0) reverse=-reverse;
        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}
