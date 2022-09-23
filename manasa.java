import java.util.*;
public class manasa {
    public static long fun(long[] arr,long arm)
    {
        long sum=0;
        long max=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        long k=sum;
        int j=0;
        int flag=0;
        for(long z=k;z>=0;z--)
        {
            j=0;
            sum=z;
            flag=0;
            while(j<arr.length && sum>0)
            {
                sum-=arr[j];
                if(flag==0 && sum<=0)
                {
                    sum+=arm;
                    flag=1;
                }
                j++;
            }       
            System.out.println(sum);
            if(j==arr.length && sum<=1)
            {
                if(max<arm)
                    return z+1;
                else
                    return z;      
            }
        }
        // return sum-arm+1;
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();
        long armor=sc.nextLong();
        System.out.println(fun(arr,armor));
    }
}
