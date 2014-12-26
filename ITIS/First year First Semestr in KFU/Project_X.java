/**
 * Created by Дмитрий on 20.10.2014.
 */
import java.util.Scanner;
public class Project_X {
    public static void main(String[] args) {
        System.out.println("Which size game field do you want:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Please,use only up,left,down,right and go_to");
       // int n = 5;
        int x = 0;
        int y = 0;
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "*";
            }
        }
        arr[x][y] = "#";
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
        //System.out.println("d-Right" + "a-Left" + "w-Up" + "s-Down");
//        String command=sc.next();
        int a = 0;
        int b = 0;
        int a1=0;
        int b1=0;
        String up="up";
        String rigth="rigth";
        String down="down";
        String left="left";
        while ((a <= n) && (b <= n)) {
           // int x=(int) 'a'; //код буквы а
            String X=sc.next();
//            if ((X=="rigth")|(X=="ight")|(X=="rigt")|(X=="ight")) {
//
//                System.out.println("Do you mean right?(Y/N)");
//                String Answer=sc.next();
//                String yes="Y";
//                String no="N";
//                if (Answer==yes) {
//                    X="right";
//                    continue;
//                }
//                else {
//                    System.out.println("Try again");
//                    continue;
//                }
//            }
//            String W="w";
//            String A="a";
//            String S="s";
//            String D="d";
            String W="up";
            String D="rigth";
            String S="down";
            String A="left";
            String GT="goto";
            //char[] Y=X.toCharArray();//  int commmand=(int) 'y';
            int command=0;
           if (X.equals(W)) {
               command=1;
           }
            else if (X.equals(A)) {
               command=2;
           }
            else if (X.equals(S)) {
               command=3;
           }
            else if (X.equals(D)) {
               command=4;
           }
           else if (X.equals(GT)) {
               command=5;
           }
            else {
               if ((X.equals("rigth"))|(X.equals("ight"))|(X.equals("rigt"))|(X.equals("ight"))) {
                   System.out.println("Do you mean right?(Y/N)");
                   String Answer=sc.next();
                   String yes="Y";
                   String no="N";
                   if (Answer.equals(yes)) {
                       X="right";
                       command=4;
                   }
                   else {
                       System.out.println("Try again");
                   }
               }
               if ((X.equals("letf"))|(X.equals("ltef"))|(X.equals("l"))|(X.equals("leht"))) {
                   System.out.println("Do you mean left?(Y/N)");
                   String Answer=sc.next();
                   String yes="Y";
                   String no="N";
                   if (Answer.equals(yes)) {
                       X="left";
                       command=2;
                   }
                   else {
                       System.out.println("Try again");
                   }
               }
               if ((X.equals("ip"))|(X.equals("u"))|(X.equals("io"))|(X.equals("uo"))) {
                   System.out.println("Do you mean up?(Y/N)");
                   String Answer=sc.next();
                   String yes="Y";
                   String no="N";
                   if (Answer.equals(yes)) {
                       X="up";
                       command=1;
                   }
                   else {
                       System.out.println("Try again");
                   }
               }
               if ((X.equals("dovn"))|(X.equals("don"))|(X.equals("do"))|(X.equals("d"))) {
                   System.out.println("Do you mean down?(Y/N)");
                   String Answer=sc.next();
                   String yes="Y";
                   String no="N";
                   if (Answer.equals(yes)) {
                       X="down";
                       command=3;
                   }
                   else {
                       System.out.println("Try again");
                   }
               }
           }
            switch (command) {
                case (4): //right
                    arr[a][b] = ".";
                    b1++;
                    if (b1==-1) {
                        b=n;
                    }
                    if (b1==n) {
                        b=-1;
                    }
                    arr[a][b+1] = "#";
                    b++;
                    b1=b;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("");
                        for (int j = 0; j < arr.length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    break;
                case (2):  //left
                    arr[a][b] = ".";
                    b1--;
                    if (b1==-1) {
                        b=n;
                    }
                    if (b1==n) {
                        b=1;
                    }
                    arr[a][b-1] = "#";
                    b--;
                    b1=b;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("");
                        for (int j = 0; j < arr.length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    break;
                case (1):  //up
                    arr[a][b] = ".";
                    a1--;
                    if (a1==-1) {
                        a=n;
                    }
                    if (a1==n) {
                        a=1;
                    }
                    arr[a - 1][b] = "#";
                    a--;
                    a1=a;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("");
                        for (int j = 0; j < arr.length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    break;
                case (3)://down
                    arr[a][b] = ".";
                    a1++;
                    if (a1==-1) {
                        a=n;
                    }
                    if (a1==n) {
                        a=-1;
                    }
                    arr[a+1][b] = "#";
                    a++;
                    a1=a;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("");
                        for (int j = 0; j < arr.length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    break;
                case(5)://go to
                    int x1=sc.nextInt();
                    int y1=sc.nextInt();
                    arr[a][b]="*";
                    arr[x1][y1]="#";
                    a=x1;
                    b=y1;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("");
                        for (int j = 0; j < arr.length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    break;

            }

        }
    }
}
