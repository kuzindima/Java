/**
 * Created by Дмитрий on 25.11.2014.
 */
public class P37 {
    public static void main(String[] args) {
        System.out.println(strCount("OkOkOkNoNoNoOk","Ok"));
    }
    public static int strCount (String x,String y) {
        int count=0;
        if(x.contains(y)){
            int a=x.indexOf(y);
            x=x.substring(a);
            count++;
            strCount(x,y);

        }
        return count;
    }
}
