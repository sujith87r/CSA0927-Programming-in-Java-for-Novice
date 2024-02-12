public class Matrix {
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i] [j]+" ");
                if (a[1][1]==5)
                {
                    a[1][1]=6;
                }
            }
            System.out.println();
        }
    }
}
