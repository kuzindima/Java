/**
 * Created by Дмитрий on 11.11.2014.
 */
import java.util.Scanner;
public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=7;
        while (i < 10) {
            System.out.println("1-Площадь круга  2-площадь прямоугольника  3-площадь трапеции  4-площадь сегмента круга");
            int n = sc.nextInt();
            switch (n) {
                case (1):
                    System.out.println("Введите радиус круга:");
                    int circle = sc.nextInt();
                    System.out.println("Circle square= " + area(circle));
                    break;
                case (2):
                    System.out.println("Введите стороны прямоугольника:");
                    int pryamoug1 = sc.nextInt();
                    int pryamoug2 = sc.nextInt();
                    System.out.println("Площадь прямоугольника= " + area(pryamoug1, pryamoug2));
                    break;
                case (3):
                    System.out.println("Чтобы вычислить прощадь трапеции введите:");
                    System.out.println("1 основание=");
                    int ab = sc.nextInt();
                    System.out.println("2 основание =");
                    int bc = sc.nextInt();
                    System.out.println("высота трапеции =");
                    int ca = sc.nextInt();
                    System.out.println("Площадь трапеции= " + area(ab, bc, ca));
                    break;
                case (4):
                    System.out.println("Если вам лень вводить угол в радианах нажмите 1 иначе нажмите 2");
                    int ans = sc.nextInt();
                    if (ans == 1) {
                        System.out.println("Предположим что радиус =4 а угол =0.5235987755 ,тогда");
                        System.out.println("Сегмент круга = " + area(4, 0.5235987755983));
                    } else {
                        System.out.println("Введите радиус круга:");
                        int r = sc.nextInt();
                        System.out.println("Введите угол в радианах:");
                        double v = sc.nextDouble();
                        System.out.println("Сегмент круга = " + area(r, v));
                    }
            }
        }
    }
    public static double area(int x){//круг
        double a=Math.PI;
        double b=a*(x*x);
        return b;
    }
    public static double area(int x,int y){//// прямоуг
        double b = x*y;
        return b;
    }
    public static double area(int x,int y,int h){//трапеция
       double c=((x+y)/2)*h;
        return c;
    }
    public static double area(int y,double rad){//сегмент
      // double s=(((y*y)/2)*((Math.PI*(rad/180))-Math.sin(rad)));//угол в градусах
        double s=(((y*y)/2)*(rad-Math.sin(rad)));//угол в радианах
        return s;
    }
}
