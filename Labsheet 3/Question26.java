import java.util.*;
public class Question26 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[][] a=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=s.nextInt();
 System.out.println("Upper:");for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i<=j?a[i][j]:0)+" ");System.out.println();}
 System.out.println("Lower:");for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i>=j?a[i][j]:0)+" ");System.out.println();} }
}
