public class Array_Exception {
    public static void main(String[] args) {
        try {
            int a[]={1,2,3,4,5};
            for(int i=0;i<=6;i++)
            System.out.println(a[i]);
        } catch (Exception e) {
            System.out.print("There is an exception :" + e);
        }
    }
}
