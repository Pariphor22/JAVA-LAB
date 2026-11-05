import java.util.*;
public class Question14 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][][] a=new int[2][2][2]; for(int i=0;i<2;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)a[i][j][k]=s.nextInt();
 for(int[][] block:a){for(int[] row:block){for(int v:row)System.out.print(v+" ");System.out.println();}System.out.println();} }
}
