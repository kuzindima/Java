import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kuzin on 19.12.14.
 */
public class Bignumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String n = sc.nextLine();
        int[] m1 = getInt(m);
        int[] n1 = getInt(n);
        System.out.println(multiply(m1, n1));

    }

    public static int[] getInt(String a) {
        char[] m = a.toCharArray();
        int[] m2 = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            m2[i] = Character.getNumericValue(m[i]);
        }
        return m2;
    }

    public static ArrayList multiply(int[] m, int[] n) {
        int a = 0;
        ArrayList arr = new ArrayList();
        a = m.length > n.length ? m.length : n.length;
        int[][] field = new int[2][a];
        m = upend(m);
        n = upend(n);
        for (int j = 0; j < m.length; j++) {
            field[0][j] = m[j];
        }
        for (int i = 0; i < n.length; i++) {
            field[1][i] = n[i];
        }
        int buff = 0;
        int buff1 = 0;
        int k = 0;
        int result;
        for (int j = 0; j < n.length; j++) {
            for (int i = 0; i < a; i++) {
                result = field[0][i] * field[1][j];
                buff = result % 10;
                buff += buff1;
                buff1 = result / 10;
                arr.add(k++, buff);
            }
            arr.add(k++,buff1);
        }

        return arr;
    }

    public static int[] upend(int[] x) {
        int buff = 0;
        int length = x.length;
        for (int i = 0; i < length; i++) {
//            x[length-1]=buff;
            buff = x[length - 1];
            x[length - 1] = x[i];
            x[i] = buff;
            length--;
        }
        return x;
    }
}
