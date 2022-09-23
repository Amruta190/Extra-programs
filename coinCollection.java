import java.util.*;

public class coinCollection {

    public static void Coins(int[][] grid, List<Integer> p) {

        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (grid[i][j] == 1) {
                    count = dfs(grid, i, j);
                }
                p.add(count);
            }
        }

    }

    public static int dfs(int grid[][], int i, int j) {

        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0;

        int count = 1;

        if (i - 1 >= 0)
            count += dfs(grid, i - 1, j);

        if (i + 1 < m)
            count += dfs(grid, i + 1, j);

        if (j - 1 >= 0)
            count += dfs(grid, i, j - 1);

        if (j + 1 < n)
            count += dfs(grid, i, j + 1);

        return count;

    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> l = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            l.add(sc.nextLine());
        }
        l.remove(0);
        int[][] mat = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (l.get(i).charAt(j) == 'C')
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
            }
        }
        List<Integer> p = new ArrayList<>();
        Coins(mat, p);
        Collections.sort(p,Collections.reverseOrder());
        int q = 0;
        int w = 0;
        for (int i = 0; i < p.size(); i++) {
            if (i % 2 == 0)
                q += p.get(i);
            else
                w += p.get(i);
        }
        System.out.println(q + " " + w);
        System.out.println();
        sc.close();
    }

}
