import java.util.Scanner;

public class Question8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        if (ch=='a' || ch == 'e' || ch=='i' ||ch=='o'|| ch== 'u'
            ||ch== 'A' || ch== 'O' || ch=='E' || ch== 'I' ||ch=='U'){
            System.out.println("Vowel!");
        }
        else{
            System.out.println("Consonant");}
    }

}
