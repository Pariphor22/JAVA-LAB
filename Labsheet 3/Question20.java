import java.util.*;
public class Question20 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);System.out.print("Students: ");int n=s.nextInt();int[][] m=new int[n][];
 for(int i=0;i<n;i++){System.out.print("Subjects for student "+(i+1)+": ");int k=s.nextInt();m[i]=new int[k];for(int j=0;j<k;j++)m[i][j]=s.nextInt();}
 for(int i=0;i<n;i++){System.out.print("Student "+(i+1)+": ");for(int v:m[i])System.out.print(v+" ");System.out.println();} }
}
