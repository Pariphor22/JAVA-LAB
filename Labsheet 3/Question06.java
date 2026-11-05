import java.util.*;
public class Question06 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(); int[] a=new int[n],b=new int[n];
 for(int i=0;i<n;i++)a[i]=s.nextInt(); for(int i=0;i<n;i++)b[i]=a[i]; System.out.println(Arrays.toString(b)); }
}
