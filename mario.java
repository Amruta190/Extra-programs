import java.util.*;
public class mario {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        List<String> l=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            l.add(sc.nextLine());
        }
        char[][] mat=new char[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=l.get(i).charAt(j);
            }
        }
        int coins=0,ex=0;
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                if(mat[i][j]=='O')
                    continue;
                else if(mat[i][j]=='C')
                {
                    coins+=1;
                    ex+=2*(m-1-i);
                    int k=i;
                    while(k!=m-1)
                    {
                        if(mat[k-1][j]=='C')
                            coins++;
                    }
                }
                else if(mat[i][j]=='H' && mat[m-1][j]=='H')
                {
                    int k=i;
                    while(k!=m-1)
                    {
                        if(mat[k-1][j]=='O')
                        {
                            ex+=2*(m-1-k);
                        }
                        k--;
                    }
                }
            }
        }
        System.out.println(ex);
    }
}
