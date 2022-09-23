import java.util.*;

public class LongestCommonSubsequence {
	int lcs(String input1, String input2) {
		char[] X = input1.toCharArray();
		char[] Y = input2.toCharArray();
		int m = X.length;
		int n = Y.length;
		int L[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X[i - 1] == Y[j - 1])
					L[i][j] = L[i - 1][j - 1] + 1;
				else {
					if (L[i - 1][j] > L[i][j - 1])
						L[i][j] = L[i - 1][j];
					else
						L[i][j] = L[i][j - 1];
				}

			}
		}
		return L[m][n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(lcs.lcs(s1, s2));
		sc.close();
	}
}