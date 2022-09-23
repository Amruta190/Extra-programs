import java.math.BigInteger;
import java.util.Scanner;

public class examPaperDistribution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger r;
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        if (n == 1 || n == 2)
            r = BigInteger.valueOf(n - 1);
        else {
            int i = 3;
            BigInteger p = new BigInteger("0");
            BigInteger q = new BigInteger("1");
            while (i <= n) {
                BigInteger val = BigInteger.valueOf(i - 1).multiply(p.add(q));
                p = q;
                q = val;
                ++i;
            }
            r = q;
        }
        f = f.subtract(r);
        System.out.println(f);
        sc.close();
    }
}