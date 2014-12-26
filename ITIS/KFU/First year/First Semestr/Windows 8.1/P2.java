/**
 * Created by Дмитрий on 15.10.2014.
 */
public class P2 {
    public static void main(String[] args) {
        int n=4;
        int count=1;
        int[][] array=new int[n][n];
        while(count<=(n*n)){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              if (i%2==0) {
                  array[i][j]=count;
              }
                else {
                  array[i][j]=n+count-2*j-1;
              }
                count++;
            }

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
