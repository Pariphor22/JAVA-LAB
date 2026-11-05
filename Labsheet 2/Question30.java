import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        boolean powerOfFour = n>0 && (n & (n-1))==0 && (n & 0x55555555)!=0;
        System.out.println("Power of 4: " + powerOfFour);
        int toggled=n ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + toggled);
        System.out.println("Multiplication table:");
        for (int i=1; i<=12; i++) {
            int product=n*i;
            if (product%48==0) break;
            if (product%6==0) continue;
            System.out.println(n + " x " + i + " = " + product);
        }
        sc.close();
    }
}
