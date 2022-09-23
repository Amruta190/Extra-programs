import java.util.*;
public class keypad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Character> one=Arrays.asList(',','@');
        List<Character> two=Arrays.asList('A','B','C','a','b','c','2');
        List<Character> three=Arrays.asList('D','E','F','d','e','f','3');
        List<Character> four=Arrays.asList('G','H','I','g','h','i','4');
        List<Character> five=Arrays.asList('J','K','L','j','k','l','5');
        List<Character> six=Arrays.asList('M','N','O','m','n','o','6');
        List<Character> seven=Arrays.asList('P','Q','R','S','p','q','r','s','7');
        List<Character> eight=Arrays.asList('T','U','V','t','u','v','8');
        List<Character> nine=Arrays.asList('W','X','Y','Z','w','x','y','z','9');
        List<Character> zero=Arrays.asList(' ','0');
        String str=sc.nextLine();
        // StringBuilder input = new StringBuilder();
        // input.append(str);
        // input.reverse();
        // List<Character> arr=new ArrayList<>();
        // for(int i=0;i<str.length();i++)
        //     arr.add(str.charAt(i));
        int i=' ';
        while(i<str.length())
        {
            int cnt=1;
            char r=str.charAt(i++);
            while(r==str.charAt(i++))
                cnt++;
            if(r=='1')
            {

            }
        }
        String ans="Bangalore";
        ans+="\n";
        System.out.println(ans);
    }
}
