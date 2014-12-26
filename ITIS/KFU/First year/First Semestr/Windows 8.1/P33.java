/**
 * Created by Дмитрий on 22.11.2014.
 */
//1 вариант
    import java.util.Scanner;
public class P33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //длинна 5
        System.out.println("Какой длинны ваш массив:");
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i = 0; i <a.length ; i++) {
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
        a=reverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] reverse(int[] x){
        int buf;
        int[] b=new int[x.length];
        for (int i = 0; i < x.length; i++) {
            buf=x[i];
            b[i]=x[(x.length-1)-i];
            b[(x.length-1)-i]=buf;
        }
        return b;
    }
}
