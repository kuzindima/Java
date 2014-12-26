/**
 * Created by Дмитрий on 01.12.2014.
 */
public class ScientificCalculator extends Calculator {
    public double pi=Math.PI;
    public static double sin(double x){
        return Math.sin(x);
    }
    public static double sinDegrees(double x){
        return Math.toDegrees(sin(x));
    }
    public static double cos(double x) {
        return Math.cos(x);
    }
    public static double cosDegrees(double x){
        return Math.toDegrees(cos(x));
    }
    public static double tan(double x){
        return Math.tan(x);
    }
    public static double tanDegrees(double x){
        return Math.toDegrees(tan(x));
    }
    public static double ctg(double x){
        return 1.0/Math.tan(x);
    }
    public static double ctgDegrees(double x){
        return Math.toDegrees(ctg(x));
    }
    public static int fact(int x){
        if (x==0)
            return 1;
        return x * fact(x-1);
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
