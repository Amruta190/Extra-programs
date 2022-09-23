import java.util.*;

public class wow22 {
    public static long MaxSubarraySum(List<Integer> stockPrice, int k)
    {
        HashSet<Integer> map=new HashSet<>();
        map.addAll(stockPrice);
        int left = 0, res = -1, sum = 0;
        for(int right = 0; right<stockPrice.size(); right++)
        {
            while(left < right && (map.count(stockPrice.get(right)) || map.size() >= k))
            {
                sum -= stockPrice[left];
                map.erase(stockPrice[left]);
                left++;
            }
            sum +=stockPrice[right];
            map.insert(stockPrice[right]);
                
            if (map.size() == k)
                res = max(res, sum);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            l.add(sc.nextInt());
        int k=sc.nextInt();
        long ans=MaxSubarraySum(l,k);
        System.out.println(ans);
    }
}