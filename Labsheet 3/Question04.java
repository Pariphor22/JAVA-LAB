import java.util.*;
public class Question04 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in); System.out.print("Size: "); int n=s.nextInt(); if(n<=0)return; int[] a=new int[n];
 for(int i=0;i<n;i++)a[i]=s.nextInt(); int max=a[0]; for(int v:a)if(v>max)max=v; System.out.println("Maximum = "+max); }
}
