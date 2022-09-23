import java.util.*;
public class longestSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int left=0;
        int right=0;
        int res=0;
        String ans="";
        int[] chars=new int[128];
        while(right<str.length())
        {
            char r=str.charAt(right);
            chars[r]++;
            while(chars[r]>1)
            {
                char l=str.charAt(left);
                chars[l]--;
                left++;
            }
            if(res<right-left+1)
            {
                res=right-left+1;
                ans=str.substring(left, right+1);
            }
            right++;
        }
        System.out.println("String is: "+ans);
        System.out.println("Length is: "+res);
        sc.close();
    }
}
