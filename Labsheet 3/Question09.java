import java.util.*;
public class Question09 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][] a=new int[3][3]; for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=s.nextInt();
 for(int i=0;i<3;i++){int sum=0;for(int j=0;j<3;j++)sum+=a[i][j];System.out.println("Row "+(i+1)+" sum = "+sum);} }
}
