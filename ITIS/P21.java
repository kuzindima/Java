/**
 * Created by Дмитрий on 02.11.2014.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P21 {
    public static void main(String[] args) {
        String[] family={"Галина","Ольга","Андрей","Дмитрий","Лиза"};
        String name1="Дима";
        String name2="Андрей";
        int result;
        String buf="";
//        if (comapre(name1,name2)==1){
//            buf=name1;
//            name1=name2;
//            name2=buf;}
//        System.out.println(name1);
//        System.out.println(name2);

        for (int i = 0; i < family.length-1; i++) {
            result=comapre(family[i],family[i+1]);
            if (result==2){
              buf=family[i];
              family[i]=family[i+1];
              family[i+1]=buf;
            }
//            else if(result==1){
//                buf=family[i];
//                family[i]=family[i+1];
//                family[i+1]=buf;
//            }
            else if (result==0){
                continue;
            }
        }
        for (int i = 0; i < family.length  ; i++) {
            System.out.println(family[i]);
        }

    }
    public static int comapre(String x1, String x2){
        x1.toLowerCase().trim();
        x2.toLowerCase().trim();
        char[] array1 = x1.toCharArray();
        char[] array2 = x2.toCharArray();

        int minLength = x1.length() > x2.length() ? x2.length() : x1.length();

        for(int i = 0; i < minLength; i++){
            if(array1[i] < array2[i]){
                return 1;
            }else if(array2[i] < array1[i]){
                return 2;
            }
        }
        if(x1.length() == x2.length())
            return 0;
        else
            return x1.length() > x2.length() ? 2: 1;

    }


}
