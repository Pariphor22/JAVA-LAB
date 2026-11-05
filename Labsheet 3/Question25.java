import java.util.*;
public class Question25 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[][] a=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=s.nextInt();int d1=0,d2=0;
 for(int i=0;i<n;i++){d1+=a[i][i];d2+=a[i][n-1-i];}System.out.println("Main diagonal = "+d1);System.out.println("Secondary diagonal = "+d2); }
}
