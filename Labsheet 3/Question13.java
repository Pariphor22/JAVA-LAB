import java.util.*;
public class Question13 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][] a=new int[3][3],b=new int[3][3],c=new int[3][3];
 for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=s.nextInt(); for(int i=0;i<3;i++)for(int j=0;j<3;j++)b[i][j]=s.nextInt();
 for(int i=0;i<3;i++)for(int j=0;j<3;j++)for(int k=0;k<3;k++)c[i][j]+=a[i][k]*b[k][j];
 for(int[] row:c){for(int v:row)System.out.print(v+" ");System.out.println();} }
}
