import java.util.*;
public class soldier {
    public static int program(int n,List<Integer> A,List<Integer>B)
    {
        int max=0,sum=0;;
        for(int i=1;i<n;i++)
        {
            max=0;
            for(int j=0;j<i;j++)
            {
                if(A.get(i)>A.get(j) && B.get(i)>B.get(j))
                {
                    if(max<B.get(j))
                        max=B.get(j);
                }

            }
            sum+=max;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> A=new ArrayList<>();
        List<Integer> B=new ArrayList<>();
        for(int i=0;i<n;i++)
            A.add(sc.nextInt());
        for(int i=0;i<n;i++)
            B.add(sc.nextInt());
        int res=program(n,A,B);
        System.out.println(res);
        sc.close();
    }
}
