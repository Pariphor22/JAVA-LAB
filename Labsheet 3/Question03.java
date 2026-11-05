import java.util.*;
public class Question03 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(),sum=0; int[] a=new int[n];
 for(int i=0;i<n;i++){a[i]=s.nextInt();sum+=a[i];} System.out.println("Sum = "+sum); }
}
