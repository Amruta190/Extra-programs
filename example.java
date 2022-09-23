
// Java implementation to find the
// minimum number of sequence
// required from array such that
// their sum is equal to given S
import java.util.*;

class example {
    static int Count(int input1, int input2) {
        if((input1>0 && input2<=0) || input1<=1)
            return -1;
        List<Integer> l=new ArrayList<>();
        int size=0,num=2;
        while(size!=input2)
        {
            if(num==2 || num==3)
            {
                l.add(num);
                size++;
            }
            else if((num+1)%6==0 || (num-1)%6==0)
            {
                l.add(num);
                size++;
            }
            num++;
        }
        int[][] table = new int[input2 + 1][input1 + 1];
        for (int i = 1; i <= input1; i++) {
            table[0][i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 1; i <= input2; i++) {
            for (int j = 1; j <= input1; j++) {
                if (l.get(i - 1) > j) {
                    table[i][j] = table[i - 1][j];
                } 
                else {
                    table[i][j] = Math.min(table[i - 1][j],
                            table[i][j - l.get(i - 1)] + 1);
                }
            }
        }
        if(table[input2][input1]==Integer.MAX_VALUE - 1)
            return -1;
        return table[input2][input1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int k=sc.nextInt();
        int ans=Count(d,k);
        System.out.println(ans);
    }
}