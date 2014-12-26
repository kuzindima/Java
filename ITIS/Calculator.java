/**
 * Created by Дмитрий on 01.12.2014.
 */
public class Calculator {
    private int model=15;
    protected String name="Yoga ver. 1.1";
    public int sum(int x,int y){
        int a=x+y;
        return a;
    }
    public float div(int x,int y){
        if ((x==0)|(y==0)) {
            return 0;
        }
        float a=x/y;
        return a;
    }
    public int mul(int x,int y){
        int a=x*y;
        return a;
    }
    public int sub(int x,int y){
        int a=x-y;
        return a;
    }
    public static int pow(int x,int y){
        if (x==0)
            return 0;
        int a=1;
        for (int i = 0; i < y; i++) {
            a*=x;
        }
        return a;
    }
    public static double pow(double x,int y){
        if (x==0)
            return 0;
        double a=1;
        for (int i = 0; i < y; i++) {
            a*=x;
        }
        return a;
    }
}
