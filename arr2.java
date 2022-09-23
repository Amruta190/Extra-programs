import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arr2 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3};// { 1, 2, 2, 3, 3 };// { 1, 2, 3, 4 };

        meanMedian(arr);

    }

    private static int[] meanMedian(int input1,int[] input2) {
        double max = -999.9;
        List<Integer[]> subArr = subSet(input2);
        Integer[] maxArr = new Integer[1];
        for (Integer[] sub : subArr) {
            double newMax = calcDiff(sub);
            if (max <= newMax) {
                max = newMax;
                maxArr = sub;
            }
        }
        int[] ans=new int[input1];
        for(int i=0;i<input1;i++)
            ans[i]=maxArr[i];
        return ans;
    }
    private static double calcDiff(Integer[] sub) {
        double sum = 0;
        for (int i = 0; i < sub.length; i++) {
            sum += sub[i];
        }
        sum = sum / sub.length;
        double median = 0;
        if (sub.length % 2 == 0)
            median = (double) (sub[(sub.length / 2) - 1] + sub[sub.length / 2]) / 2;
        else
            median = sub[sub.length / 2];

        double diff = sum - median;
        return diff;
    }

    private static List<Integer[]> subSet(int[] arr) {
        List<Integer[]> subArr = new ArrayList<Integer[]>();
        int n = arr.length;
        for (int i = 0; i < (1 << n); i++) {
            String subSet = "";
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    subSet += arr[j] + " ";
            subArr.add(convertToInt(subSet.trim().split(" ")));
        }
        return subArr;
    }
    private static Integer[] convertToInt(String[] arr) {
        if (arr[0] == "")
            return new Integer[] { 0 };
        Integer[] intArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i].trim());
        }
        return intArr;
    }
}