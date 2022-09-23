import java.util.*;
public class primeMailReads {
    public static boolean isPrime(int i)
    {
        if(i==0 || i==1)
            return false;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0,f=1;
        while(n>1)
        {
            cnt=0;
            f=f+1;
            int i=1;
            // for(int i=1;i<=n;i++)
            // {
            //     if(isPrime(i))
            //         cnt+=1;
            // }
            while(i<=n)
            {
                if(isPrime(i))
                    cnt+=1;
                i++;
            }
            n-=cnt;
        }
        System.out.println(f);
        sc.close();
    }
}
