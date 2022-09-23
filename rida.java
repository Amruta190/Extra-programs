import java.util.*;
public class rida{
    static int steps(int n,int m,List<List<Integer>> A)
    {
        if(m==1)
        {
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i]=A.get(i).get(j);
                }
            }
            int z=0;
            Arrays.sort(ar);
            for(int k=n-1;k>=0;k=k-2)
            {
                z=z+ar[k];
            }
            for(int k=n-2;k>=0;k=k-2)
            {
                z=z-ar[k];
            }
            return z;
        }
        if(n==1)
        {
            int ar[]=new int[m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[j]=A.get(i).get(j);
                }
            }
            int z=0,k=0;
            for(k=0;k<m/2;k++)
            {
                z=z+ar[k];
                z=z-ar[m-1-k];
            }
            if(k%2==0)
            {
                z=z+ar[k];
            }
            else
                z=z-ar[k];
            return z;
        }
        int p=0,q=m-1,val=0;
        while(p<=q)
        {
            int rida[]=new int[n];
            int huss[]=new int[n];
            for(int i=0;i<n;i++)
            {
                rida[i]=A.get(i).get(p);
                huss[i]=A.get(i).get(q);
            }
            Arrays.sort(rida);
            Arrays.sort(huss);
            for(int k=n-1;k>=0;k--)
            {
                val=val+rida[k]-huss[k];
            }
            // if(ans<sum-sum2)
            //     ans=sum-sum2;
            p++;
            q--;   
        }
        return val;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> A=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
            List<Integer> l1 = new ArrayList<Integer>();
            for(int j=0;j<m;j++)
            {
                l1.add(j,sc.nextInt());
            }
            A.add(i,l1);
        }
        int res=steps(n,m,A);
        System.out.println(res);
        sc.close();
    }
}