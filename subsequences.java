import java.util.Arrays;
import java.util.Scanner;
public class subsequences {
    int sum = 0;

    public void printAllSubSequences(int[] arrInput) {
        int[] temp = new int[arrInput.length];
        int index = 0;
        solve(arrInput, index, temp);
        System.out.println(sum);
    }

    private void solve(int[] arrInput, int index, int[] temp) {
        if (index == arrInput.length) {
            print(arrInput, temp);
            return;
        }
        // set the current index bit and solve it recursively
        temp[index] = 1;
        solve(arrInput, index + 1, temp);
        // unset the current index bit and solve it recursively
        temp[index] = 0;
        solve(arrInput, index + 1, temp);
    }

    private void print(int[] arrInput, int[] temp) {
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1)
                result += arrInput[i] + " ";
        }
        // if (result == "")
        // result = "{Empty Set}";
        // System.out.println("Sequence:"+ result);
        int t=0;
        int[] ans = new int[(result.length()/2)];
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != ' ')
                ans[t++] = Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        Arrays.sort(ans);
        System.out.print("ans");
        for(int j=0;j<t;j++)
            System.out.print(ans[j]+" ");
        System.out.println();
        int k = 1;
        if (t > 0) {
            int i=0;
            for (i = 0; i < t; i++) {
                while (i<t && k == ans[i])
                    i++;
                k++;
                if(k==ans[i])
                    k++;
                else {
                    sum += k;
                    break;
                }
            }
            if(i==t)
                sum+=ans[t-1]+1;
        }
        else
            sum+=k;
        System.out.println("Sum"+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrInput=new int[n];
        for(int i=0;i<n;i++)
            arrInput[i]=sc.nextInt();
        new subsequences().printAllSubSequences(arrInput);
    }
}