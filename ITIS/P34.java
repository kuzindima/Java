import java.util.Scanner;

/**
 * Created by Дмитрий on 22.11.2014.
 */
public class P34 {
    public static void main(String[] args) {
        System.out.println("Which size game field do you want:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        int count =1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j]=count;
                    count++;
                }
            }


        arr=reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public static int[][] reverse(int[][] arr){
        int[] buf=null;
        for(int i=0;i<arr.length/2;i++){
            buf=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=buf;
        }
        return arr;
    }

}
