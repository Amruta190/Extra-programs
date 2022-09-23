import java.util.*;
class stack{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        int max=(Collections.max(arr)>n)?Collections.max(arr):n;
        int matrix[][]=new int[max][max];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr.get(i);j++)
            {
                matrix[j][i]=1;
            }
        }
        boolean val=arr.isEmpty() || Collections.frequency(arr, arr.get(0)) == arr.size();
        if(val==true)
            System.out.println(n);
        else
        {
            int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
            int[] dp = new int[cols + 1];
            int maxsqlen = 0, prev = 0;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    int temp = dp[j];
                    if (matrix[i - 1][j - 1] == 1) {
                        dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                        maxsqlen = Math.max(maxsqlen, dp[j]);
                    } else {
                        dp[j] = 0;
                    }
                    prev = temp;
                }
            }
            System.out.println(maxsqlen);
        }
    }
}