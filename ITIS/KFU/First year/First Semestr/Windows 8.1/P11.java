/**
 * Created by Дмитрий on 26.10.2014.
 */
import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=(int) 'w';
        int a=(int) 'a';
        int s=(int) 's';
        int d=(int) 'd';
        System.out.println(w+"<-w");
        System.out.println(a+"<-a");
        System.out.println(s+"<-s");
        System.out.println(d+"<-d");
        for (int i = 0; i <4 ; i++) {
            String X=sc.next();
            char[] Y=X.toCharArray();
            System.out.println(X+" "+Y);
        }

    }
}
