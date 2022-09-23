import java.util.*;
class arr{
    public static int CountWays(int n,int k,int m,int ar[])
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int val=ar[i]*k;
            if(val<=m)
                ans+=1;
        }
        return ans;
    } 
    public static void main(String[] args)
    {
        int n=0,k=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        m=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int res=CountWays(n,k,m,ar);
        System.out.println(res);
        sc.close();
    }
}