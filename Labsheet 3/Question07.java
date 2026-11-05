import java.util.*;
public class Question07 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][] a=new int[3][3]; for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=s.nextInt();
 for(int[] row:a){for(int v:row)System.out.print(v+" ");System.out.println();} }
}
