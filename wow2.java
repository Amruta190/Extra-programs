import java.util.*;
public class wow2 {
    public static int minimum(String search,String result)
    {
        // int[] alpha=new int[26];
        // int[] b2=new int[26];
        // for(int i=0;i<search.length();i++)
        // {
        //     alpha[search.charAt(i)-'a']++;
        // }
        // for(int i=0;i<result.length();i++)
        // {
        //     b2[search.charAt(i)-'a']++;
        // }
        int i=0,j=0;
        while(i<search.length() && j<result.length())
        {
            while(i<search.length() && j<result.length() && search.charAt(i)==result.charAt(j))
            {
                i++;j++;
            }
            i++;
        }
        return result.length()-j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String search=sc.nextLine();
        String result=sc.nextLine();
        int ans=minimum(search, result);
        System.out.println(ans);
    }
}
