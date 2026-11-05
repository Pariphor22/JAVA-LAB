import java.util.*;
public class Question27 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt();int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=s.nextInt();
 for(int i=0;i<r;i++){for(int j=0;j<c;j++)if(i==0||i==r-1||j==0||j==c-1)System.out.print(a[i][j]+" ");else System.out.print("  ");System.out.println();} }
}
