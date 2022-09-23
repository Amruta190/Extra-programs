import java.util.*;
public class largest_even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        int i=0;
        Vector<Integer> v=new Vector<Integer>();
        Vector<Integer> v1=new Vector<Integer>();
        while(i!=str.length()-1)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                v.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            i++;
        }
        Collections.sort(v);
        if(v.size()==0)
            System.out.println("-1");
        else if(v.get(0)%2==0)
        {
            for(i=v.size()-1;i>=0;i--)
                System.out.print(v.get(i));
        }
        else
        {
            for(i=v.size()-1;i>=0;i--)
            {
                if(v.get(i)%2==0)
                {
                    for(int j=i-1;j>=0;j--)
                        v1.add(v.get(j));
                    v1.add(v.get(v.size()-1));
                    break;
                }
                v1.add(v.get(i));
            }
            if(i!=-1)
            {
                for(i=0;i<v1.size();i++)
                    System.out.print(v1.get(i));
            }
            else
                System.out.println("-1");
        }
    }
}