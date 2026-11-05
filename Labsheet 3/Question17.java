import java.util.*;
public class Question17 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); int max=Integer.MIN_VALUE; for(int i=0;i<8;i++){int v=s.nextInt();if(v>max)max=v;} System.out.println("Maximum = "+max); }
}
