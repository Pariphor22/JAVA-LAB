import java.util.*;
public class Question18 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int[][][] a=new int[2][2][2]; for(int i=0;i<2;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)a[i][j][k]=s.nextInt();
 System.out.print("Search value: ");int t=s.nextInt();boolean found=false;for(int i=0;i<2;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)if(a[i][j][k]==t){System.out.println("Position ["+i+"]["+j+"]["+k+"]");found=true;}if(!found)System.out.println("Not found"); }
}
