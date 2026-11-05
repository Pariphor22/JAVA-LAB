import java.util.*;
public class Question30 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt(),zero=0,nonzero=0;for(int i=0;i<r;i++)for(int j=0;j<c;j++){int v=s.nextInt();if(v==0)zero++;else nonzero++;}
 System.out.println(zero>nonzero?"Sparse matrix":"Not a sparse matrix"); }
}
