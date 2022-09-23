import java.util.*;
public class AmazonWow{
    public static int magicstick(int input1,int[] input2,int[] input3)
    {
        int[] arr=new int[input2.length];
        for(int i=0;i<input2.length;i++)
                arr[i]=input2[i];
        Arrays.sort(arr);
        int max=arr[input1-1];
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=max;i++){
            int k=0;
            for(int j=0;j<input2.length;j++)
            {
                k+=(Math.abs(input2[j]-i)*input3[j]);
            }
            if(k<ans)
                ans=k;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cost=new int[n];
        int[] length=new int[n];
        for(int i=0;i<n;i++)
            cost[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            length[i]=sc.nextInt();
        Arrays.sort(length);
        System.out.println(length[n-1]);
        int ans=magicstick(n,length,cost);
        System.out.println(ans);
    }
}