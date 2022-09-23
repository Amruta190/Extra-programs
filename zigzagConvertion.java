import java.util.Scanner;
public class zigzagConvertion {
    public static String convert(String s, int numRows) {
        char mat[][] = new char[numRows][10000];
        for(int k=0;k<numRows;k++)
        {
            for(int l=0;l<10000;l++)
            {
                mat[k][l]='0';
            }
        }
        int n = s.length();
        int p = 0, i = 0, j = -1, q = 0;
        while (p < n) {
            for (i = 0; i < numRows && p<n; i++) {
                mat[i][q] = s.charAt(p++);
            }
            i=i-2;q+=1;j+=1;
            while (i > 0 && p<n) {
                mat[i--][++j] = s.charAt(p++);
                q++;
            }
        }
        String str="";
        for(int k=0;k<numRows;k++)
        {
            for(int l=0;l<q;l++)
            {
                if(mat[k][l]!='0')
                    str+=mat[k][l];
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int numRows=sc.nextInt();
        System.out.println(convert(s,numRows));
        sc.close();
    }
}
