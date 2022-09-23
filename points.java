import java.util.*;
public class points{
    public static int segmentMatching(int N,int M,List<Integer> left,List<Integer> right,List<Integer> points)
    {
        List<Boolean> cnt=new ArrayList<Boolean>(Arrays.asList(new Boolean[M]));
        Collections.fill(cnt, Boolean.FALSE);
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(cnt.get(j)==true)
                    continue;
                else
                {
                    if(left.get(j)<=points.get(i) && points.get(i)<=right.get(j))
                        cnt.set(j,true);
                }
            }
        }
        int count=0;
        for(int i=0;i<M;i++)
        {
            if(cnt.get(i)==true)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        List<Integer> points=new ArrayList<>();
        for(int i=0;i<n;i++)
            left.add(sc.nextInt());
        for(int i=0;i<n;i++)
            right.add(sc.nextInt());
        for(int i=0;i<m;i++)
            points.add(sc.nextInt());
        int res=segmentMatching(n,m,left,right,points);
        System.out.println(res);
        sc.close();
    }
}