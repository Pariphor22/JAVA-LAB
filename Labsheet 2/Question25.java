import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks=new int[3][3];
        int total=0, count=0;
        System.out.println("Enter marks for 3 students in 3 subjects:");
        for (int[] student : marks)
            for (int markIndex=0; markIndex<student.length; markIndex++)
                student[markIndex]=sc.nextInt();
        for (int[] student : marks)
            for (int mark : student) { total+=mark; count++; }
        System.out.println("Average marks = " + (double)total/count);
        sc.close();
    }
}
