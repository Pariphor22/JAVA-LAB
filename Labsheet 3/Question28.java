import java.util.*;
public class Question28 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt();int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=s.nextInt();int t=s.nextInt();boolean found=false;
 for(int i=0;i<r;i++)for(int j=0;j<c;j++)if(a[i][j]==t){System.out.println("Row "+(i+1)+", Column "+(j+1));found=true;}if(!found)System.out.println("Not found"); }
}
