public class Question19 {
    public static void main(String[] args) {
        for (int n=1; n<=1000; n++) {
            int digits=String.valueOf(n).length(), temp=n, sum=0;
            while (temp>0) {
                int digit=temp%10;
                sum += (int)Math.pow(digit, digits);
                temp/=10;
            }
            if (sum==n) System.out.print(n + " ");
        }
    }
}
