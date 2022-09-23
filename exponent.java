import java.util.*;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            hp.put(sc.nextInt(), val);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            int key = sc.nextInt();
            if (hp.containsKey(key)) {
                hp.put(key, hp.get(key) + val);
            } else
                hp.put(key, val);
        }
        TreeMap<Integer, Integer> t = new TreeMap<>(hp);
        List<Integer> keys=new ArrayList<>(hp.keySet());
        List<Integer> values=new ArrayList<>(hp.values());
        for(int i=keys.size()-1;i>0;i--)
            System.out.print(values.get(i)+"x^"+keys.get(i)+" + ");
        System.out.println(values.get(0)+"x^"+keys.get(0));
    }
}
