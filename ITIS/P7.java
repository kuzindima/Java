/**
 * Created by Дмитрий on 20.10.2014.
 */
import java.util.*;
//Buble sort
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=8;
        int[] a=new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (a[j]>a[j+1]){
                    int k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }
        System.out.println("Отсортированные по возрастанию элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
