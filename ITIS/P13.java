/**
 * Created by Дмитрий on 28.10.2014.
 */
//Some little game
import java.util.Scanner;
public class P13 {
    public static void main(String[] args) {
        String s1="No No No No No No No No No No No No No No No No No No No Ok No";
         //int  y= s1.indexOf("Ok");
         //System.out.println(y);// ЧИТЫ
        Scanner sc=new Scanner(System.in);
        System.out.println("Попробуй угадать на каком месте Ок");
        System.out.println("Выберите уровень сложности :");
        System.out.println("4--Читер");//Very Hard
        System.out.println("3--Ванга");//Hard
        System.out.println("2--Экстросенс");//Medium
        System.out.println("1--Ведущий прогноза погоды");//Easy
        System.out.println("Ваш уровень сложности :");
        int n=sc.nextInt();
        if ((n>0)&&(n<5)) {
            switch (n) {
                case (1):
                    System.out.println(s1);
                    for (int i = 0; i < 6; i++) {
                        int a=sc.nextInt();
                        int  x= s1.indexOf("Ok");
                        if (a==x) {
                            System.out.println("Ok");
                            System.out.println("Поздравляем вы нашли его!");
                            break;
                        }
                        else if (i==5) {
                            System.out.println("Вы проиграли =( Попробуйте снова!");
                        }
                        else {
                            System.out.println("No");
                            System.out.println("Попробуйте еще раз.");
                            int att=5-i;
                            System.out.println("Попыток осталось :"+att);
                        }
                    }
                    break;
                case (2):
                    System.out.println(s1);
                    for (int i = 0; i < 4; i++) {
                        int a=sc.nextInt();
                        int  x= s1.indexOf("Ok");
                        if (a==x) {
                            System.out.println("Ok");
                            System.out.println("Поздравляем вы нашли его!");
                            break;
                        }
                        else if (i==3) {
                            System.out.println("Вы проиграли =( Попробуйте снова!");
                        }
                        else {
                            System.out.println("No");
                            System.out.println("Попробуйте еще раз.");
                            int att=3-i;
                            System.out.println("Попыток осталось :"+att);
                        }
                    }
                    break;
                case (3):
                    System.out.println(s1);
                    for (int i = 0; i < 2; i++) {
                        int a=sc.nextInt();
                        int  x= s1.indexOf("Ok");
                        if (a==x) {
                            System.out.println("Ok");
                            System.out.println("Поздравляем вы нашли его!");
                            break;
                        }
                        else if (i==1) {
                            System.out.println("Вы проиграли =( Попробуйте снова!");
                        }
                        else {
                            System.out.println("No");
                            System.out.println("Попробуйте еще раз.");
                            int att=1-i;
                            System.out.println("Попыток осталось :"+att);
                        }
                    }
                    break;
                case (4):
                    System.out.println(s1);
                        int a=sc.nextInt();
                        int  x= s1.indexOf("Ok");
                        if (a==x) {
                            System.out.println("Ok");
                            System.out.println("Поздравляем вы нашли его!");
                        }
                        else {
                            System.out.println("Вы проиграли =( Попробуйте снова!");
                        }

                    break;
            }
        }
            else {
            System.out.println("Вводите только цифру уровня (1-4)");
        }


//        System.out.println(s1);
//        System.out.println("Нужно угадать индекс первой буквы слова Ок");
//        System.out.println("У вас только две попытки.Удачи!");//есть только две попытки
//        for (int i = 0; i < n; i++) {
//            int a=sc.nextInt();
//            int  x= s1.indexOf("Ok");
//            // System.out.println(x); ЧИТЫ
//            if (a==x) {
//                System.out.println("Ok");
//                System.out.println("Congratulations!!You find it!");
//            }
//            else {
//                System.out.println("No");
//                System.out.println("Try again!");
//            }
//        }
//        int a=sc.nextInt();
//      int  x= s1.indexOf("Ok");
//       // System.out.println(x); ЧИТЫ
//        if (a==x) {
//            System.out.println("Ok");
//            System.out.println("Congratulations!!You find it!");
//        }
//        else {
//            System.out.println("No");
//            System.out.println("Try again!");
//        }
    }
}

