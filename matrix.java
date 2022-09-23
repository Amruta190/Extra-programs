import java.util.*;
public class matrix {
    public static int[][] RotateMatrixByKStep(int[][] arr,int k,int p,char cmd)
    {
        if(cmd=='R')
        {
            int l=k;
            while(l>0)
            {
                int temp=arr[p-1][0],i=0;
                for(i=1;i<arr[p-1].length;i++)
                {
                    arr[p-1][i-1]=arr[p-1][i];
                }
                arr[p-1][i-1]=temp;
                l--;
            }
        }
        else if(cmd=='C')
        {
            int l=k;
            while(l>0)
            {
                int temp=arr[0][p-1],i=0;
                for(i=1;i<arr.length;i++)
                {
                    arr[i-1][p-1]=arr[i][p-1];
                }
                arr[i-1][p-1]=temp;
                l--;
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int p=sc.nextInt();
        int k=sc.nextInt();
        char cmd=sc.next().charAt(0);
        mat=RotateMatrixByKStep(mat,k,p,cmd);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
