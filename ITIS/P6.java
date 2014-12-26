/**
 * Created by Дмитрий on 18.10.2014.
 */
import java.util.*;
//Binary search
public class P6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        int n=50;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int x=r.nextInt();
            arr[i]=x;
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int a = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = a;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
            System.out.println(arr[i]);
        }

        System.out.println("Чтобы узнать информацию о штрафах пожалуйста введите цифры вашего гос.номера: ");
        //Программа предлагает ввести любое число
        int key=sc.nextInt();
 //binary search


        int m=-1;

            int first = 0;
            int last = arr.length - 1;
            int mid = (last - first) / 2;
        int count=0;
while (m==-1) {
    if (key<arr[first]| key>arr[last]){

        break;
    }
    if (key == arr[mid]) {
        m = mid;
    } else if (key < arr[mid]) {
        last = mid;
        mid = (last + first) / 2;
    } else if (key > arr[mid]) {
        first = mid;
        mid = (last + first) / 2;
    }
    count++;
    if (count>5){
        break;
    }

}
        //bynary search end
        if (m==-1){
            System.out.println("Поздравляем! У вас нет неоплаченных штрафов.");
            //Выводит что нет такого числа в массиве
        }
        else {
            System.out.println("Кол-во штрафов за последний год : " + m);
            //Программа нашла число и выводит его индекс.
        }
        if (m>30) {
            System.out.println("*****************************************************");
            System.out.println("** Achievement 'Учился водить в ГТА' : unlocked!!! **");
            System.out.println("*****************************************************");
        }
    }
}
