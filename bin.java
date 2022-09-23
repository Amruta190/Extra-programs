import java.util.*;
class bin
{
    public static int toBinary(int x, int len)
    {
        if (len > 0)
        {
            return Integer.parseInt(String.format("%" + len + "s",
                            Integer.toBinaryString(x)).replaceAll(" ", "0"));
        }
 
        return 0;
    }
    public static int ans(int k,int a,int b)
    {
        int val1=toBinary(a, k);
        int val2=toBinary(b, k);
        int n=k,cnt=0,cnt1=0,i=0,decimal=0;
        String sum="";
        if(a>b)
        {
            while(n>0)
            {
                int r=val1%10;
                if(r==1)
                    cnt+=1;
                val1=val1/10;
                n--;
            }
            int ar[]=new int[k];
            for(i=0;i<cnt;i++)
                ar[i]=1;
            for(int j=i;j<k;j++)
                ar[j]=0;
            n=k;
            while(n>0)
            {
                int r=val2%10;
                if(r==1)
                    cnt1+=1;
                val2=val2/10;
                n--;
            }
            int ar2[]=new int[k];
            for(i=0;i<=k-cnt1-1;i++)
                ar2[i]=0;
            for(int j=i;j<k;j++)
                ar2[j]=1;
            for(i=0;i<k;i++)
            {
                if(ar[i]==ar2[i])
                    sum=sum+"0";
                else    
                    sum=sum+"1";
            }
            decimal=Integer.parseInt(sum,2);  
        }
        else
        {
            while(n>0)
            {
                int r=val2%10;
                if(r==1)
                    cnt+=1;
                val2=val2/10;
                n--;
            }
            int ar[]=new int[k];
            for(i=0;i<cnt;i++)
                ar[i]=1;
            for(int j=i;j<k;j++)
                ar[j]=0;
            n=k;
            while(n>0)
            {
                int r=val1%10;
                if(r==1)
                    cnt1+=1;
                val1=val1/10;
                n--;
            }
            int ar2[]=new int[k];
            for(i=0;i<=k-cnt1-1;i++)
                ar2[i]=0;
            for(int j=i;j<k;j++)
                ar2[j]=1;
            for(i=0;i<k;i++)
            {
                if(ar[i]==ar2[i])
                    sum=sum+"0";
                else    
                    sum=sum+"1";
            }
            decimal=Integer.parseInt(sum,2);  
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=ans(k,a,b);
        System.out.println(res);
        sc.close();
    }
}
