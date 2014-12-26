/**
 * Created by Дмитрий on 29.11.2014.
 */
public class P38 {
    public static void main(String[] args) {
          Calc calcus=new Calc();
        float b=calcus.division(5,2);
        System.out.println(b);
        int c=calcus.sum(4,5);
        System.out.println(c);
        System.out.println(calcus.name);
    }
}
