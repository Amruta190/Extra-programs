import java.util.Scanner;
public class wipro {
    public static String reverseWordsAndCase(String s,int n)
    {
        String[] ans=s.split(" ");
        for(int i=0;i<ans.length;i++)
        {
            StringBuilder sb=new StringBuilder(ans[i]);
            ans[i]=String.valueOf(sb.reverse());
        }
        if(n==1)
        {
            for(int i=0;i<ans.length;i++)
            {
                char[] ch=ans[i].toCharArray();
                int l=ch.length-1;
                if(ch[0]>='a' && ch[0]<='z')
                    ch[0]=Character.toUpperCase(ch[0]);
                else if(ch[0]>='A' && ch[0]<='Z')
                    ch[0]=Character.toLowerCase(ch[0]);
                else if(ch[0]==',')
                {
                    if(ch[1]>='a' && ch[1]<='z')
                        ch[1]=Character.toUpperCase(ch[1]);
                    else if(ch[1]>='A' && ch[1]<='Z')
                        ch[1]=Character.toLowerCase(ch[1]);
                }
                if(ch[l]>='a' && ch[l]<='z')
                    ch[l]=Character.toUpperCase(ch[l]);
                else if(ch[l]>='A' && ch[l]<='Z')
                    ch[l]=Character.toLowerCase(ch[l]);
                String str=new String(ch);
                ans[i]=str;
            }
        }
        StringBuilder ans1=new StringBuilder();
        for(int i=0;i<ans.length;i++)
            ans1.append(ans[i]+" ");
        return String.valueOf(ans1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(reverseWordsAndCase(s,n));
    }
}
