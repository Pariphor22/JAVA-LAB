import java.util.*;
public class Question24 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();
 System.out.print("Without duplicates: ");for(int i=0;i<n;i++){boolean duplicate=false;for(int j=0;j<i;j++)if(a[i]==a[j])duplicate=true;if(!duplicate)System.out.print(a[i]+" ");} }
}
