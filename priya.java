
// JAVA Code for Find maximum (or minimum)
// sum of a subarray of size k
import java.util.*;

class priya {

    // Returns maximum sum in a subarray of size k.
    public static int minimizeMemory(List<Integer> processes, int m) {
        int len=processes.size();
        int add = 0,total_sum=0,i=0;
        while(i<len)
        {
            total_sum+=processes.get(i);
            i++;
        }
        i=0;
        while(i<m)
        {
            add+=processes.get(i);
            i++;
        }
        int x = add;
        i=m;
        while(i<len)
        {
            x=x+(processes.get(i)-processes.get(i-m));
            if(x>add)
                add=x;
            i++;
        }
        return total_sum-add;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int arr[] = new int[n];
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int k =sc.nextInt();
        System.out.println(minimizeMemory(arr, k));
    }
}
// This code is contributed by Arnav Kr. Mandal.
