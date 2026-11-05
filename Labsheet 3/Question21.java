import java.util.*;
public class Question21 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();
 if(n>0){int first=a[0];for(int i=0;i<n-1;i++)a[i]=a[i+1];a[n-1]=first;}System.out.println(Arrays.toString(a)); }
}
