import java.util.Scanner;
public class P28 {
    public static void main(String[] args) {
        System.out.println("Введите элемент последовательности Фибоначчи :");
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        System.out.println("Введите индекс элемента:");
        int b = sc.nextInt();
        System.out.println(fib1(a)+"<-индекс элемента("+a+")");
        System.out.println(fib(b)+"<-элемент с индексом("+b+")");
    }
    public static int fib1(int element){
        return element;
    }
    public static int fib(int index){
        if(index==1 || index==2) return 1;
        int x_2=fib(index-2);
        int x_1=fib(index-1);
        return x_1+x_2;
    }

}

