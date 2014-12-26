
/**
 * Created by Дмитрий on 18.10.2014.
 */
import java.util.Random;
//Sorting Test
public class P5 {
    public static void main(String[] args) {
        int  n=10000;
        int[] a1=new int[n];
        int[] a2=new int[n];
        int[] a3=new int[n];
        Random r= new Random();
        for (int i = 0; i < n; i++) {
            int x=r.nextInt();
            a1[i]=x;
            a2[i]=x;
        }
        long t1=System.currentTimeMillis();
        for (int i = 0; i < a1.length; i++) {
            int min = a1[i];
            int min_i = i;
            for (int j = i+1; j < a1.length; j++) {
                if (a1[j] < min) {
                    min = a1[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int a = a1[i];
                a1[i] = a1[min_i];
                a1[min_i] = a;
            }
        }
        long t2=System.currentTimeMillis();
        long t3=System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            int x=i;
            for (int j = i+1; j < n; j++) {
                if (a2[j]<a2[x]){
                    x=j;
                }

            }
            int buf= a2[x];
            for (int j =x; j > i; j--) {
                a2[j]=a2[j-1];
            }
            a2[i] = buf;

        }
        long t4=System.currentTimeMillis();
        long t5=System.currentTimeMillis();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (a3[j]>a3[j+1]){
                    int k=a3[j];
                    a3[j]=a3[j+1];
                    a3[j+1]=k;
                }
            }
        }
        long t6=System.currentTimeMillis();
        long time1= t2-t1;
        long time2= t4-t3;
        long time3= t6-t5;
        System.out.println("Метод прямого выбора");
        System.out.println(time1);
        System.out.println("Метод вставки");
        System.out.println(time2);
        System.out.println("Buble sort");
        System.out.println(time3);
        if ( (time1<time2)&&(time1<time3)) {
            System.out.println("Метод прямого выбора быстрее !");
        }
        else if ((time2<time1) && (time2<time3)) {
            System.out.println("Метод вставки быстрее!");
        }
        else if ((time3<time1) && (time3<time2)) {
              System.out.println("Метод пузырька быстрее!");
        }
        else {
            System.out.println("Ничья!");
        }
    }
}

