import java.util.*;

public class element {

    static int findElement(int []a, int n)
    {

        if (n == 1 || n == 2)
        {
            return -1;
        }
        int element = a[0], maxx = a[0],
                bit = -1, check = 0;
        int idx = -1;
        for(int i = 1; i < (n - 1);)
        {

            if (a[i] < maxx && i < (n - 1))
            {
                i++;
                bit = 0;
            }
            else
            {
                if (a[i] >= maxx)
                {
                    element = a[i];
                    idx = i;
                    check = 1;
                    maxx = a[i];
                }
                if (check == 1)
                {
                    i++;
                }
                bit = 1;
                
                while (a[i] >= element && i < (n - 1))
                {
                    if (a[i] > maxx)
                    {
                        maxx = a[i];
                    }
                    i++;
                }
                check = 0;
            }
        }
        if (element <= a[n - 1] && bit == 1)
        {
            return a[idx];
        }
        else
        {
            return -1;
        }
            
    }    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findElement(arr, n));
    }
}
