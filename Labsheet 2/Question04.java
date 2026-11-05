import java.util.Scanner;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitors = 0;
        System.out.print("Number of visitors entering: ");
        int entering = sc.nextInt();
        for (int i=0; i<entering; i++) System.out.println("Visitor entered. Count = " + (++visitors));
        System.out.print("Number of visitors leaving: ");
        int leaving = sc.nextInt();
        for (int i=0; i<leaving; i++) {
            if (visitors > 0) System.out.println("Visitor left. Previous count = " + (visitors--));
        }
        System.out.println("Visitors inside = " + visitors);
        sc.close();
    }
}
