import java.util.*;
public class numberEncryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.nextLine();
        int index=0;
        char chArr[]=s.toCharArray();
        for(int i=0;i<c.length();i++)
        {
            switch(c.charAt(i))
            {
                case 'R': {
                    if(index+1<s.length())
                        index++;
                    break;
                }
                case 'L' : {
                    if(index>0)
                        index--;
                    break;
                }
                case 'T' : {
                    if(s.charAt(index)!='9')
                    {
                        // char ch=s.charAt(index);
                        // s=s.substring(0,index)+(ch++)+s.substring(index+1);
                        chArr[index]++;
                    }
                    break;
                }
                case 'D' : {
                    if(s.charAt(index)!='0')
                    {
                        // char ch=s.charAt(index);
                        // s=s.substring(0,index)+(ch--)+s.substring(index+1);
                        chArr[index]--;
                    }
                    break;
                }
                case 'S' : {
                    i++;
                    int k=0;
                    String num="";
                    for(k=i;k<c.length() && c.charAt(k)>='0' && c.charAt(k)<='9';k++)
                    {
                        num+=c.charAt(k);
                    }
                    i=k;
                    i--;
                    int ind=Integer.valueOf(num);
                    char temp = chArr[index];
                    chArr[index] = chArr[ind-1];
                    chArr[ind-1] = temp;
                    break;
                }
            }
        }
        sc.close();
        System.out.println(String.valueOf(chArr));
    }
}
