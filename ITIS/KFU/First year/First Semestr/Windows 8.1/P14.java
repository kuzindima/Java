/**
 * Created by Дмитрий on 28.10.2014.
 */
import java.util.Scanner;
public class P14 {
    public static void main(String[] args) {
        String s1="No No No No No No No Ok No";
        Scanner sc=new Scanner(System.in);
        System.out.println(s1);
        System.out.println("Какое слово вы хотите выпилить?");
        String upload=sc.next();

        if (upload.equals("Ok")){
            int index=s1.indexOf("Ok");
            s1=s1.substring(0,index)+s1.substring(index+2);
        }
        else if (upload.equals("No")){
            int index=s1.indexOf("No");
            s1=s1.substring(0,index)+s1.substring(index+2);
        }
        else {
            System.out.println("Нет такого слова в массиве");
        }
        System.out.println(s1);
    }
}
