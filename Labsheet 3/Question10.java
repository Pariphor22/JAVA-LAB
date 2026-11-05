import java.util.*;
public class Question10 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][] a=new int[3][3]; for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=s.nextInt();
 for(int j=0;j<3;j++){int sum=0;for(int i=0;i<3;i++)sum+=a[i][j];System.out.println("Column "+(j+1)+" sum = "+sum);} }
}
