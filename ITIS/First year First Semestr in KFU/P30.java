
public class P30 {
    public static void main(String[] args) {
        int[] a={0,1,2};
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
        int [] b=change(a);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public static int[] change(int[] a){
        a[0]=2048;
        return a;
    }
}
