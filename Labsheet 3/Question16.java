import java.util.*;
public class Question16 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int p=0,n=0; for(int i=0;i<8;i++){int v=s.nextInt();if(v>0)p++;else if(v<0)n++;} System.out.println("Positive = "+p+" Negative = "+n); }
}
