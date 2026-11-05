import java.util.*;
public class Question23 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();Integer max=null,second=null;
 for(int v:a){if(max==null||v>max){second=max;max=v;}else if(v!=max&&(second==null||v>second))second=v;}
 if(second==null)System.out.println("Second largest distinct value does not exist");else System.out.println("Second largest = "+second); }
}
