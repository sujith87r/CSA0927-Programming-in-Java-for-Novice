public class GreatestOf3 {
    public static void main(String[] args)
    {
        int a=10,b=5,c=7;
        if(a>b && a>c)
            System.out.println(a+"is a greater number ");
        if(b>c && b>a)
            System.out.println(b+"is a greater number ");
        if(c>a  && c>b)
            System.out.println(c+"is a greater number ");
    }
}
