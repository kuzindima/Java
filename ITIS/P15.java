/**
 * Created by Дмитрий on 28.10.2014.
 */
import java.util.*;
public class P15 {
    public static void main(String[] args) {
        Random rand=new Random();
        String s="";
        int count=0;
        for (int i = 0; i < 10; i++) {
            s+=rand.nextInt(100)%3==0?"Ok ":"No ";
        }
        System.out.println(s);
        String[] arrWords= s.split(" ");
        for (int i = 0; i < arrWords.length; i++) {
            if (arrWords[i].contains("Ok")) {
                count++;
            }
        }
        if (count==0){
            System.out.println("Ok нет");
        }
        else {
            System.out.println("Число вхождний слова Ок="+count);
        }
    }
}
