import java.util.Scanner;

    class Height {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter height in cm: ");
            int h = sc.nextInt();

            if (h < 150)
                System.out.println("Short");
            else if (h <= 170)
                System.out.println("Average");
            else
                System.out.println("Tall");
        }
    }

