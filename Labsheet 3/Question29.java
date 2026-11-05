import java.util.*;
public class Question29 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[][] a=new int[n][];for(int i=0;i<n;i++){int k=s.nextInt();a[i]=new int[k];for(int j=0;j<k;j++)a[i][j]=s.nextInt();Arrays.sort(a[i]);}
 for(int[] row:a){for(int v:row)System.out.print(v+" ");System.out.println();} }
}
