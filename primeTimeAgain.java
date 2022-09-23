import java.util.*;
public class primeTimeAgain {
    public static boolean isPrime(int n)
    {
        // List<Integer> l=new ArrayList<>();
        if(n==1)
            return false;
        else if(n==2)
            return true;
        else if(n%2==0)
            return false;
        else
        {
            int cnt=1;
            for(int j=2;j<n/2;j++)
            {
                if(n%j==0)
                    cnt++;
            }
            if(cnt==1)
                return true;
            else 
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int p=sc.nextInt();
        int div=d/p;
        int time=1,i=0,c=0;
        for(int j=0;j<div;j++)
        {
            int var=time;
            for(i=0;i<p;i++)
            {
                if(isPrime(var))
                {
                    var+=div;
                }
                else
                    break;
            }
            if(i==p)
                c++;
            time++;
        }
        System.out.println(c);
        sc.close();
    }
}
