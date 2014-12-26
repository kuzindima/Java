/**
 * Created by Дмитрий on 01.11.2014.
 */

public class P19 {
    public static void main(String[] args) {

        int x[]={10,20,30,40,50,60};
        int x2[]={100,90,80,70,10,0};
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x.length-1; j++) {
                if (x[j]<x[j+1]){
                    int k=x[j];
                    x[j]=x[j+1];
                    x[j+1]=k;
                    int z=x2[j];
                    x2[j]=x2[j+1];
                    x2[j+1]=z;
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]+" "+x2[i]);
        }
    }
}
