import java.util.Scanner;

/**
 * Created by Дмитрий on 20.10.2014.
 */
public class P3 {//сортировка по возраастанию
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 5;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int min_i = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        min_i = j;
                    }
                }

                if (i != min_i) {
                    int a = array[i];
                    array[i] = array[min_i];
                    array[min_i] = a;
                }
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        }
    }

