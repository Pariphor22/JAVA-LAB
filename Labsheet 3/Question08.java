import java.util.*;
public class Question08 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][] a=new int[3][3]; int sum=0;
 for(int i=0;i<3;i++)for(int j=0;j<3;j++){a[i][j]=s.nextInt();sum+=a[i][j];} System.out.println("Sum = "+sum); }
}
