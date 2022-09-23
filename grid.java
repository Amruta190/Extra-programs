import java.util.*;
class grid{
    static boolean sol(int a, int b, int x, int y){
        if( a == x && b == y)
            return true;
        else if(a > x || b > y)
            return false;
        else{
            if(sol(a+b, a, x, y)) return true;
            if(sol(a, a+b, x, y)) return true;
        }
        return false;
    }
    static int ans(int x, int y){
        int cnt=0;
        if(sol(0, 0, x, y))
        {
            cnt+=1;
            System.out.println(cnt);
            // return "Yes";
        } 
        // return "No";
        return cnt;
    }
    public static void main(String[] args) {
        int x,y,k;
        Scanner sc = new Scanner(System.in);
            k=sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(ans(x, y));
        
    }
    
}