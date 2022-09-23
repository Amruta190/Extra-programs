import java.util.*;
public class amazonSeries {
    public static void main(String[] args) {
        int k=11;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("1\n11");
        if(n==1)
            System.out.println("1");
        else if(n==2)
            System.out.println("11");
        else
        {
            String num=String.valueOf(k);
            for(int j=3;j<=n;j++)
            {
                String str="";
                for(int i=1;i<num.length();i++)
                {
                    int cnt=1;
                    while(i<num.length() && num.charAt(i-1)==num.charAt(i))
                    {
                        cnt++;
                        i++;
                    }
                    str+=String.valueOf(cnt)+String.valueOf(num.charAt(i-1));
                }
                if(num.charAt(num.length()-1)!=num.charAt(num.length()-2))
                    str+="1"+String.valueOf(num.charAt(num.length()-1));
                num=str;
                System.out.println(num);
            }
            System.out.println(n+"th number is: "+num);
        }
    }
}
