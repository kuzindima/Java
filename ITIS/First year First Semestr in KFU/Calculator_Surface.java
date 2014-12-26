/**
 * Created by Дмитрий on 02.12.2014.
 */
import java.util.Scanner;
public class Calculator_Surface {
    public static void main(String[] args) {
        ScientificCalculator calc=new ScientificCalculator();
        Scanner sc=new Scanner(System.in);
        String string =sc.next();
        char[] arr= string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(arr[i]);
        }

    }
}
