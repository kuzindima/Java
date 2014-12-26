/**
 * Created by Дмитрий on 11.11.2014.
 */
import java.util.Scanner;
public class P25 {
    public static void main(String[] args) {
        System.out.println("Введите элемент последовательности Фибоначчи :");
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        System.out.println("Введите индекс элемента:");
        int b = sc.nextInt();
        System.out.println(findIndex(a)+"<-индекс элемента("+a+")");
        System.out.println(fintElement(b)+"<-элемент с индексом("+b+")");
    }
    public static int findIndex(int element){
      int a=1;
      int b=1;
      int result=1;
        int k=1;
        while (result!=element){
            k++;
            result=a+b;
            a=b;
            b=result;

        }
      return k;
    }
    public static int fintElement(int index){
        int fn=1;
        int fn2=1;
        int fn1=1;
        for (int i = 2; i <=index; i++) {
            fn=fn1+fn2;
            fn2=fn1;
            fn1=fn;
        }
        return fn;
    }

}
