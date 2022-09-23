import java.util.*;
public class ibm {
    public static List<Integer> olympics(List<Integer> arr)
    {
        int sum=0,wins=0,out=0,last=0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
            if(arr.get(i)>0)
                wins+=1;
            if(arr.get(i)==0)
                out+=1;
        }
        for(int i=arr.size()-1;i>=arr.size()-3;i--)
            last+=arr.get(i);
        List<Integer> ans=new ArrayList<>();
        ans.add(sum);
        ans.add(wins);
        ans.add(out);
        ans.add(last);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer>
    }
}
