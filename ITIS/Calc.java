/**
 * Created by Дмитрий on 29.11.2014.
 */
public class Calc {
    private int model=15;
    protected String name="Yoga ver. 1.0";
    public int sum(int x,int y){
        int a=x+y;
        return a;
    }
    public float division(int x,int y){
        if ((x==0)|(y==0)) {
                return 0;
        }
        float a=x/y;
        return a;
    }
    public int multip(int x,int y){
        int a=x*y;
        return a;
    }
    public int subtr(int x,int y){
        int a=x-y;
        return a;
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
