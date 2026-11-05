import java.util.*;
public class Question05 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(),e=0,o=0; int[] a=new int[n];
 for(int i=0;i<n;i++){a[i]=s.nextInt();if(a[i]%2==0)e++;else o++;} System.out.println("Even = "+e+" Odd = "+o); }
}
