import java.util.*;
public class Question22 {
 public static void main(String[] x){ Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];boolean[] done=new boolean[n];for(int i=0;i<n;i++)a[i]=s.nextInt();
 for(int i=0;i<n;i++){if(done[i])continue;int count=1;for(int j=i+1;j<n;j++)if(a[i]==a[j]){count++;done[j]=true;}System.out.println(a[i]+" appears "+count+" time(s)");} }
}
