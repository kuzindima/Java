/**
 * Created by Дмитрий on 20.11.2014.
 */
public class P32 {
    public static void main(String[] args) {
System.out.println(fact(10));
        }
public static int fact(int x){
        if (x==0)
        return 1;
        return x * fact(x-1);
        }
        }
