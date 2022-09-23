class rotation {
    public static void main(String[] args) 
    {
        String str="amruta";
        char[] ch=str.toCharArray();
        int size=str.length();
        char last=ch[size-1];
        for(int i=size-2;i>=0;i--)
        {
            ch[i+1]=ch[i];
        }
        ch[0]=last;
        String leftr=String.valueOf(ch);
        System.out.println(leftr);
    }
}
