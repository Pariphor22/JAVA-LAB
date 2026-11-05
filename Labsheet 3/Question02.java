import java.util.*;
public class Question02 {
 public static void main(String[] x){
 Scanner s=new Scanner(System.in); 
 int[] a=new int[10];
 System.out.println("Enter 10 integers:"); 
 for(int i=0;i<10;i++)a[i]=s.nextInt();
 for(int i=9;i>=0;i--)System.out.print(a[i]+" "); }
}
