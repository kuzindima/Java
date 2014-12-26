/**
 * Created by Дмитрий on 15.10.2014.
 */
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
            switch (n) {
                case (5):
                    System.out.println("Деревянная свадьба!");
                    break;
                case (10):
                    System.out.println("Розовая свадьба!");
                    break;
                case (15):
                    System.out.println("Хрустальная свадьба!");
                    break;
                case (20):
                    System.out.println("Фарфоровая свадьба!");
                    break;
                case (25):
                    System.out.println("Серебряная свадьба!");
                    break;
                case (30):
                    System.out.println("Жемчужная свадьба!");
                    break;
                case (35):
                    System.out.println("Коралловая свадьба!");
                    break;
                case (40):
                    System.out.println("Рубиновая свадьба!");
                    break;
                case (45):
                    System.out.println("Сапфировая свадьба!");
                    break;
                case (50):
                    System.out.println("Золотая свадьба!");
                    break;
                case (55):
                    System.out.println("Изумрудная свадьба!");
                    break;
                case (60):
                    System.out.println("Бриллиантовая свадьба!");
                    break;
                case (65):
                    System.out.println("Железная свадьба!");
                    break;
                case (70):
                    System.out.println("Благодатная свадьба!");
                    break;
                case (75):
                    System.out.println("Коронная свадьба!");
                    break;
                case (80):
                    System.out.println("Дубовая свадьба!");
                    break;
                case (100):
                    System.out.println("Красная свадьба!");
                    break;
                default:
                    if (n>100) {
                        System.out.println("Да ладно!Такого не бывает!");
                    }
                    else {
                        System.out.println("Неверное число");
                    }
                    break;

            }


        }

    }

