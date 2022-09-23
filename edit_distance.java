import java.util.Scanner;
public class edit_distance {
    public static int min(int a,int b,int c){
        if(a<b && a<c) return a;
        else if(b<a && b<c) return b;
        else return c;
    }
    public static int E(String x,String y){
        int m=x.length();
        int n=y.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=min(dp[i-1][j-1]+1,dp[i-1][j]+1,dp[i][j-1]+1);
                
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String x=sc.next();
            String y=sc.next();
            System.out.println(E(x,y));   
        }
        sc.close();
    }
    
}