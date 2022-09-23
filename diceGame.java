import java.util.*;

class diceGame {
    static int sums(int S, List<Integer> l) {
        int[] ways = new int[S + 1];
        ways[0] = 1;
        for (int i = 1; i <= S; i++) {
            for (int j = 0; j < l.size(); j++) {
                if (i >= l.get(j)) {
                    ways[i] = ways[i] + ways[i - l.get(j)];
                }
            }
        }
        return ways[S];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int m = sc.nextInt();
            List<Integer> dice = new ArrayList<>();
            for (int j = 1; j <= m; j++)
                dice.add(j);
            int ans=sums(s,dice);
            System.out.println(ans);
        }
        sc.close();
    }
}