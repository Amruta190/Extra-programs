import java.util.*;

public class ex {
    public static int lostInForest(int input1) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for (int i = input1; i >= 1; i--) {
            int k = i,cnt=0;
            while (k != 1) 
            {
                cnt++;
                if (k % 2 == 0)
                    k = k / 2;
                else
                    k = (3 * k) + 1;
            }
            if(max<cnt)
            {
                max=cnt;
                ans=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int ans = lostInForest(m);
        System.out.println(ans);
    }
}
