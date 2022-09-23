import java.util.*;
public class priya2 {
    public static int findEarliestMonth(List<Integer> stockPrice)
    {
        int sum=0,var=0;
        for(int i:stockPrice)
            sum+=i;
        int mini=Integer.MAX_VALUE;
        int len=stockPrice.size();
        int in=0;
        for(int i=1;i<len;i++)
        {
            var+=stockPrice.get(i-1);
            int tmp=sum-var;
            Double d1=(double)var/i;
            Double d2=(double)tmp/len;
            int diff=Math.abs((int)(Math.floor(d1)-Math.floor(d2-i)));
            if(diff<mini)
            {
                mini=diff;
                in=i;
            }
        }
        return in;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
            l.add(sc.nextInt());
        System.out.println(findEarliestMonth(l));
    }
}
