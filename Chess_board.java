import java.util.Scanner;
import java.lang.Math;
public class Chess_board
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int n=sc.nextInt();
        String ar[][]=new String[b][n];
        for(int i=0;i<b;i++)
            for(int j=0;j<n;j++)
                ar[i][j]=sc.next();
        int max1=0,max2=0,x=0,y=0;
        for(int i=0;i<b;i++)
        {
            int cnt=0;
            for(int j=0;j<n;j++)
            {
                if(ar[i][j]=="W")
                    cnt+=1;
            }
            max1=Math.max(max1,cnt);
            if(max1==cnt)
                x=i;
            cnt=0;
            for(int j=0;j<n;j++)
            {
                if(ar[j][i]=="W")
                    cnt+=1;
            }
            max2=Math.max(max2,cnt);
            if(max2==cnt)
                y=i;
        }
        if(max1>=max2)
        {
            for(int j=0;j<n;j++)
            {
                if(ar[x][j]=="B")
                    ar[x][j]="W";
                else
                    ar[x][j]="B";
            }
        }
        else
        {
            for(int i=0;i<b;i++)
            {
                if(ar[i][y]=="B")
                    ar[i][y]="W";
                else
                    ar[i][y]="B";
            }
        }
        sc.close();
    }
}