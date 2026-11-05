import java.util.Scanner;

public class Question27 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your selling price and cost price: ");
        int sp = sc.nextInt();
        int cp = sc.nextInt();
        int profit = sp-cp;
        int loss = cp-sp;
        if(cp > sp){
            System.out.println("Loss of $ "+loss);
        }
        else{
            System.out.println("Profit of $ "+profit);
        }

    }
}
