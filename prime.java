import java.util.*;
public class prime {
    public static int prime1(int input1,int input2)
    {
        List<Integer> l=new ArrayList<>();
        int size=0,num=2;
        while(size!=input2)
        {
            if(num==2 || num==3)
            {
                l.add(num);
                size++;
            }
            else if((num+1)%6==0 || (num-1)%6==0)
            {
                l.add(num);
                size++;
            }
            num++;
        }
        // for(int i=0;i<l.size();i++)
        //     System.out.println(l.get(i));
        int sum=0;
        for(int i=l.size()-1;i>=0;i--)
        {
            while(input1>sum)
                sum+=l.get(i);
            while(input1!=sum)
            {
                sum-=l.get(i);
                while(input1>sum)
                    sum+=l.get(i-1);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int k=sc.nextInt();
        int ans=prime1(d,k);
        System.out.println(ans);
    }
}
