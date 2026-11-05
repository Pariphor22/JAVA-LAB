import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year, range start and range end: ");
        int year=sc.nextInt(), start=sc.nextInt(), end=sc.nextInt();
        boolean leap = (year%400==0) || (year%4==0 && year%100!=0);
        if (leap && year>=start && year<=end) System.out.println("Leap year within range");
        else System.out.println("Condition not satisfied");
        sc.close();
    }
}
