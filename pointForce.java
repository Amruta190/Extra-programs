import java.util.*;
public class pointForce {
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        double ans=0;
        int res1=0,res2=0;
        for(int i=x1;i<=x2;i++)
        {
            int j=i+1;
            for(j=i+1;j<=x2;j++)
            {
                if(isPrime(i) || isPrime(j))
                    continue;
                else
                {
                    ans=(i*j)/(Math.pow(j-i,2));
                    if(ans>=f)
                    {
                        res1=i;
                        res2=j;
                        break;
                    }
                }
            }
            if(j!=x2+1)
                break;
        }
        if(res1==0 || res2==0)
            System.out.println("None");
        else
            System.out.println(res1+" "+res2);
        sc.close();
    }
}
