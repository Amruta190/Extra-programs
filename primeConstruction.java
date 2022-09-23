import java.util.*;

public class primeConstruction {
    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++)
            result = lcm(result, input[i]);
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
    public static int nextPrime(int N) {
        if (N <= 1)
            return 2;
        int prime = N;
        boolean found = false;
        while (!found) {
            prime++;

            if (isPrime(prime))
                found = true;
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        List<Integer> l = new ArrayList<>();
        // List<Integer> l1 = new ArrayList<>();
        for (String i : arr) {
            l.add(Integer.parseInt(i));
        }
        int rem = Collections.min(l);
        int flag = 0, n = 1;
        l.remove(new Integer(rem));
        long[] lToArr = new long[l.size()];
        for (int k = 0; k < l.size(); k++)
            lToArr[k] = l.get(k);
        long ans = lcm(lToArr) - rem;
        int res=(int)ans;
        int prime=nextPrime(res);
        int i=0;
        for(i=0;i<l.size();i++)
        {
            if(prime%l.get(i)!=rem)
            {
                System.out.println("None");
                break;
            }
        }
        if(i==l.size())
            System.out.println(prime);
    }
}