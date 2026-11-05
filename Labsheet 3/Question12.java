import java.util.*;
public class Question12 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][] a=new int[3][3],b=new int[3][3]; for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=s.nextInt();
 for(int i=0;i<3;i++)for(int j=0;j<3;j++)b[i][j]=s.nextInt(); for(int i=0;i<3;i++){for(int j=0;j<3;j++)System.out.print((a[i][j]+b[i][j])+" ");System.out.println();} }
}
