/**
 * Created by Дмитрий on 18.10.2014.
 */
//сортировка перестановкой
import java.util.Scanner;
//Сортировка методом вставки
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Размер массива:");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Ввод элементов массива:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[x]){
                    x=j;
                }

            }
            int buf= arr[x];
            for (int j =x; j > i; j--) {
                arr[j]=arr[j-1];
            }
            arr[i] = buf;

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
