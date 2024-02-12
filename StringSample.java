public class StringSample {
    public static void main(String[] args)
    {

        //Upper Case
        String s="my name is mike ";
        String c=s.toUpperCase();
        // Replcing character
        System.out.println(c);
        String b=c.replace('M' , 'K');
        //Printing sub string
        System.out.println(b);
        String k=s.substring(3,6);
        //Printing Character
        System.out.println(k);
        char n=s.charAt(6);
        System.out.println(n);
    }
}
