/**
 * Created by Дмитрий on 11.11.2014.
 */
public class P24 {
    public static void main(String[] args) {
       double a=-123.4;
        System.out.println("double " + abs(a));
        int b=1000000;
        long s=b*b*(-1);
        System.out.println("long "+abs(s));
    }
    public static double abs(double  x){
        if (x<0)
            x=x*(-1);
        return x;
    }
    public static float abs(float x){
        if (x<0)
            x=x*(-1);
        return x;
    }
    public static long abs(long x){
        if (x<0)
            x*=(-1);
        return x;
    }
}
