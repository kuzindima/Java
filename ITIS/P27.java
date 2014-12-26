
public class P27 {
    public static void main(String[] args) {
        kopat(60,0);
    }
    public static void kopat(int n,int nCurrent){
        if (n==nCurrent)
            return ;
        System.out.println(nCurrent);
        kopat(n,nCurrent+1);
    }
}
