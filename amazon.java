import java.util.*;

public class amazon {
    public static String cToJ(String input1) {
        String ans = "";
        String arr[] = input1.split("_");
        ans += arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
        }
        if (ans.charAt(0) >= 'A' && ans.charAt(0) <= 'Z')
            ans = String.valueOf(ans.charAt(0)).toLowerCase() + ans.substring(1);
        return ans;
    }

    public static String JToC(String input1) {
        String ans = "";
        if (input1.charAt(0) >= 'A' && input1.charAt(0) <= 'Z') {
            input1 = String.valueOf(input1.charAt(0)).toLowerCase() + input1.substring(1);
        }
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) >= 'A' && input1.charAt(i) <= 'Z') {
                ans += "_";
                ans += String.valueOf(input1.charAt(i)).toLowerCase();
            } else
                ans += String.valueOf(input1.charAt(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String ans = "";
        int i = 0;
        for (i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == '_') {
                ans = cToJ(input1);
                break;
            }
        }
        if (i == input1.length()) {
            ans = JToC(input1);
        }
        System.out.println(ans);
    }}

//     String result = "";
//     String input = "this_is_a_variable";
//     char c[] = input.toCharArray();
//     for(int i = 0;i<c.length;i++)
//     {
//         if (c[i] == '_') {
//             i++;
//             char chr = Character.toUpperCase(c[i]);
//             result += chr;
//         } else {
//             result += c[i];
//         }
//     }System.out.println(result); // o/p: thisIsAVariable
//     String s = "thisIsAVariable"; // INPUT
//     char ch[] = s.toCharArray();
//     // 1st approach
//     String str = "";
//     for(int i = 0;i<ch.length;i++)
//     {
// if (Character.isUpperCase(ch[i])) {
// str += "_";
// str += ch[i];
// } else
// str += ch[i];
// }