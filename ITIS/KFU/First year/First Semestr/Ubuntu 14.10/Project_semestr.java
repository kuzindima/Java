import java.util.Scanner;
import java.io.*;

public class Project_semestr {
    static Scanner sc;
    //глобальные переменные размера поля
    public static int fieldSize_n = 0;
    public static int fieldSize_m = 0;
    static String[][] arr1;//обьявляем игровое поле (далее GF), но пока не задаем ему размер

    //..........................................................................................GF->Game Field
    public static void main(String[] args) throws FileNotFoundException {
        sc = new Scanner(System.in);
        System.out.println("Абстрактный Интерпетатор");
        System.out.println("\n");
        System.out.println("Задайте размер игрового поля .");
        System.out.println("(размер поля по вертикали)+enter+(размер поля по горизонтали)");
        System.out.println("Клавиша Enter задает дефолтые настройки . ");
        System.out.print("Размер поля по вертикали равен :");
        int n = defaultInput();//при нажатии на Enter вводятся стандартные настройки
        if (n==10) System.out.println(n);
        if (n > 99) {
            System.out.println("Максимальный размер поля по вертикали и горизонтали 99");
            System.out.println("(!!)При повторном неверном выборе устанавливаются стандартные настройки.");
            System.out.print("Размер поля по вертикали равен :");
            n = defaultInput();
            if (n>99){
                n=10;
            }
        }

        System.out.print("Размер поля по горизонтали равен :");
        int m = defaultInput();
        if (m==10) System.out.println(m);
        if (m > 99) {
            System.out.println("Максимальный размер поля по вертикали и горизонтали 99");
            System.out.println("(!!)При повторном неверном выборе устанавливаются стандартные настройки.");
            System.out.print("Размер поля по горизонтали равен :");
            m = defaultInput();
            if (m>99){
                m=10;
            }
        }
        fieldSize_n = n;//Размер поля по вертикали
        fieldSize_m = m;//Размер поля по горизонтали
        arr1 = new String[fieldSize_n][fieldSize_m];//Устанавливаем размер нашему GF

        System.out.println("Задайте положение АИ : x  Enter  y");
        System.out.print("x=");
        int x = defaultInput();
        if (x == 10) {
            x = 0;//установим по дефолту в начало поля в левый верхний угол
            System.out.println(x);
        } else if (x > fieldSize_n) {
            System.out.println("Ваш размер поля по вертикали = " + fieldSize_n);
            System.out.println("(!!)При повторном неверном выборе устанавливаются стандартные настройки.");
            System.out.print("x=");
            x = defaultInput();
            if (x==10) x=0;
            if(x>fieldSize_n) x=0;

        }
        System.out.print("y=");
        int y = defaultInput();
        if (y == 10) {
            y = 0;
            System.out.println(y);
        } else if (y > fieldSize_m) {
            System.out.println("Ваш размер поля по горизонтали = " + fieldSize_m);
            System.out.println("(!!)При повторном неверном выборе устанавливаются стандартные настройки.");
            System.out.print("y=");
            y = defaultInput();
            if(y==10) y=0;
            if (y>fieldSize_m) y=0;
        }
        System.out.println("Нажмите на  Enter чтобы продолжить игру");
        //заполняем игровое поле элементами
        for (int i = 0; i < fieldSize_n; i++) {
            for (int j = 0; j < fieldSize_m; j++) {
                arr1[i][j] = "*";
            }
        }
        arr1[x][y] = "#";//ставим АИ на GF

        //ускоряет ввод
        String repeat = "";
        int ilikeit = 0;//для входа в режим суперпользователя
        int count = 0;
        while (1 < 2) {//зацикливаем ввод команд
            String xz = sc.nextLine();//вводим команды
            clrConsole();//очищаем консоль от предыдущего состояния GF
            if (xz.equals("helpMe")) {//ловит комаду helpMe
                openhelpMe();//открывает инструкции к игре
            }
            if (xz.equals("ilikethisprogram")) {//режим суперпользователя
                ilikeit = 1;
                if (ilikeit == 1) {
                    //в этом режиме команды вправо,влево,вверх,вниз задаются клавишами W,A,S,D , goto задается как gt
                    System.out.println("Teacher Mod >>>>> ON");
                    System.out.println("Чтобы вернуться к обычном режиму введите в консоль команду 'exitTM'");
                    for (int i = 0; i < fieldSize_n; i++) {//выводим текущее состояние GF
                        System.out.println("");
                        for (int j = 0; j < fieldSize_m; j++) {
                            System.out.print(arr1[i][j] + " ");
                        }
                    }
                    System.out.println("");
                    while (ilikeit < 2) {//зацикливаем ввод команд
                        xz = sc.nextLine();
                        clrConsole();//чистим консоль
                        if (xz.equals("helpMe")) {
                            openhelpMe();//ловит Help
                        } else if (xz.equals("exitTM")) {
                            ilikeit = 2;//выходим из режима
                        }
                        if (xz.equals("exit"))//выходим из программы
                            break;
                        ilikethisprogram(arr1, xz);//выполняем команды используя метод реализующий режим суперпользователя
                    }
                }
                System.out.println("Teacher mod >>>>>> OFF");

            }
            if (xz.equals("c")) {
                command(arr1, repeat);//ускоряет ввод
            } else {
                command(arr1, xz);//простой ввод команд
            }
            if (xz.equals("exit"))//завершает работу программы
                break;
            if ((xz.equals("right")) | (xz.equals("left")) | (xz.equals("up")) | (xz.equals("down"))) {
                System.out.println("                              ! используйте команду 'с' для ускорения набора комнанд ");
                //выводим подсказку о том что есть такая функция "с" которая помогает меньше печатать
                repeat = xz;//запоминаем команду для использоания функцией "с"
            }
            if (count == 0) {//выводит GF единажды в начале
                for (int i = 0; i < fieldSize_n; i++) {
                    System.out.println("");
                    for (int j = 0; j < fieldSize_m; j++) {
                        System.out.print(arr1[i][j] + " ");
                    }
                }
                System.out.println("Переход к инструкциям  командой 'helpMe'");
                System.out.println("");
                count++;
            }

        }
        //checkpoint
        System.out.println("Do you want to save game field?(Y/N)");//предлагает сделать checkpoint
        String answer = sc.next();
        if ((answer.equals("Y")) | answer.equals("y")) {
            System.out.println("Add your name:"); //в качстве имя файла запрашиваем имя пользоватля
            String name = sc.next();
            write(name + ".txt", arr1);//записывем поле
        }

    }


    public static void command(String[][] arr, String x) {//обычный ввод команд
        if (x.equals("right")) {
            right(arr);
        } else if (x.equals("")) {
            return;
        } else if (x.equals("left")) {
            left(arr);
        } else if (x.equals("up")) {
            up(arr);
        } else if (x.equals("down")) {
            down(arr);
        } else if (x.contains("goto")) {
            int ax = 0;
            int ay = 0;
            char[] com = x.toCharArray();
            if (com.length > 8) {//если длинна массива с командой goto больше 8 символов( goto 44 55 = 10 символов)
                if (com.length > 9) {//если больше 9 то обе координаты будут двузначные
                    ax = Character.getNumericValue(com[5]) * 10 + Character.getNumericValue(com[6]);
                    ay = Character.getNumericValue(com[8]) * 10 + Character.getNumericValue(com[9]);
                } else {
                    if (fieldSize_n > 10) {//если размер поля по вертикали двузначное число то координата ах тоже дузначное
                        //даже если и не двузначное, то 5 элемент тогда будет пустым и код тем неменее будет выполняться правильно
                        ax = Character.getNumericValue(com[5]) * 10 + Character.getNumericValue(com[6]);
                    }
                    else {
                        ax = Character.getNumericValue(com[5]);
                        ay = Character.getNumericValue(com[7]) * 10 + Character.getNumericValue(com[8]);
                    }
                }
            } else {
                ax = Character.getNumericValue(com[5]);
                ay = Character.getNumericValue(com[7]);
            }
            goTo(arr, ax, ay);

        } else if ((!x.equals("exit")) && (!x.equals("helpMe")))//сообщает что команда введена не правильно
            System.out.println("Команда не найдена!");

        for (int i = 0; i < fieldSize_n; i++) {//печатает поле
            System.out.println("");
            for (int j = 0; j < fieldSize_m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");

    }

    public static void ilikethisprogram(String[][] arr, String x) {//ввод команд для суперпользователя
        if ((x.equals("d")) | (x.equals("D"))) {
            right(arr);
        } else if ((x.equals("a")) | (x.equals("A"))) {
            left(arr);
        } else if ((x.equals("w")) | (x.equals("W"))) {
            up(arr);
        } else if ((x.equals("s")) | (x.equals("S"))) {
            down(arr);
        } else if (x.contains("gt")) {
            char[] com = x.toCharArray();
            int ax = 0;
            int ay = 0;
            if (com.length > 6) {
                if (com.length > 7) {
                    ax = Character.getNumericValue(com[3]) * 10 + Character.getNumericValue(com[4]);
                    ay = Character.getNumericValue(com[6]) * 10 + Character.getNumericValue(com[7]);
                } else {
                    if (fieldSize_n > 10) {
                        ax = Character.getNumericValue(com[3]) * 10 + Character.getNumericValue(com[4]);
                        ay = Character.getNumericValue(com[6]);
                    } else {
                        ax = Character.getNumericValue(com[3]);
                        ay = Character.getNumericValue(com[5]) * 10 + Character.getNumericValue(com[6]);
                    }
                }
            } else {
                ax = Character.getNumericValue(com[3]);
                ay = Character.getNumericValue(com[5]);
            }
            goTo(arr, ax, ay);

        } else if ((!x.equals("exit"))&&(!x.equals("exitTM"))&&(!x.contains("help"))) {
            System.out.println("Команда не найдена!");
        }

        for (int i = 0; i < fieldSize_n; i++) {
            System.out.println("");
            for (int j = 0; j < fieldSize_m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
    }

    //команды для #(АИ)
    public static void goTo(String[][] x, int x1, int y1) {
        sc = new Scanner(System.in);
        if ((x1 > fieldSize_n) | (y1 > fieldSize_m)) {
            System.out.println("Вы ввели координаты превышающие размер поля");
            System.out.println("Размер вашего поля :" + fieldSize_n + "x" + fieldSize_m);
            System.out.println("Первый элемент поля имеет координаты (0,0)");
            return;
        }
        x[searchUi(x, "a")][searchUi(x, "b")] = "*";
        x[x1][y1] = "#";

    }

    public static void right(String[][] x) {
        int a = searchUi(x, "a");
        int b = searchUi(x, "b");
        x[a][b] = ".";
        int b1 = b + 1;
        if (b1 == fieldSize_m) {
            clrField(x);
            b = -1;
        }
        x[a][b + 1] = "#";

    }

    public static void left(String[][] x) {
        int a = searchUi(x, "a");
        int b = searchUi(x, "b");
        x[a][b] = ".";
        int b1 = b - 1;
        if (b1 == -1) {
            clrField(x);
            b = fieldSize_m;
        }
        x[a][b - 1] = "#";
    }

    public static void up(String[][] x) {
        int a = searchUi(x, "a");
        int b = searchUi(x, "b");
        x[a][b] = ".";
        int a1 = a - 1;
        if (a1 == -1) {
            clrField(x);
            a = fieldSize_n;
        }
        x[a - 1][b] = "#";
    }

    public static void down(String[][] x) {
        int a = searchUi(x, "a");
        int b = searchUi(x, "b");
        x[a][b] = ".";
        int a1 = a + 1;
        if (a1 == fieldSize_n) {
            clrField(x);
            a = -1;
        }
        x[a + 1][b] = "#";
    }

    //метод для поиска #(АИ)
    public static int searchUi(String[][] x, String letter) {
        int[] c = new int[2];
        for (int i = 0; i < fieldSize_n; i++) {
            for (int j = 0; j < fieldSize_m; j++) {
                if (x[i][j].equals("#")) {
                    c[0] = i;
                    c[1] = j;
                }
            }
        }
        if (letter.equals("a")) {
            return c[0];
        } else {
            return c[1];
        }
    }

    //запись поля в файл
    public static void write(String fileName, String[][] arr) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                for (int i = 0; i < fieldSize_n; i++) {
                    out.println("");
                    for (int j = 0; j < fieldSize_m; j++) {
                        out.print(arr[i][j] + " ");
                    }
                }
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clrConsole() {
        for (int i = 0; i < 25; i++) {
            System.out.println("\n\n\n\n\n");
        }
    }

    public static void clrField(String[][] x) {//используется при тороидальном переходе АИ
        for (int i = 0; i < fieldSize_n; i++) {
            for (int j = 0; j < fieldSize_m; j++) {
                x[i][j] = "*";
            }
        }
    }

    public static void openhelpMe() {
        System.out.println("Размер поля вводится следующим образом : (размер поля по вертикали)+enter+(размер поля по горизонтали)");
        System.out.println("Команда goto вводится следующим образом : goto 4 5");
        System.out.println("Команда exit завершает работу программы .");
        System.out.println("Для передвижния по полю используйте команды right,left,up,down,goto x y .");
        System.out.println("Сущестует команда с(continue) для ускорения ввода команд");
        System.out.println("Так же существует режим 'Проверь мою семестровку' где командами служат : ");
        System.out.println("W-вверх,A-влево,S-вниз,D-вправо и gt x y.");
        System.out.println("Так же в этом режиме отсутствует команда 'c' (continue)");
        System.out.println("Режим 'Проверь мою семестровку' активируется командой ilikethisprogram .");
    }

    public static int defaultInput() {
        sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] c = a.toCharArray();
        if (a.equals("")) {
            return 10;//возьмем за стандарт размера поля
        }
        else if(a.length()>3){
            return 10;//если ввоится слишком большое число то метод выдаст стандартный размер поля и стандартное положение АИ
        }else if (a.length() > 2) {
            int ax = Character.getNumericValue(c[0]) * 100 + Character.getNumericValue(c[1]) * 10 + Character.getNumericValue(c[2]);
            return ax;
        } else if (a.length() > 1) {
            int ax = Character.getNumericValue(c[0]) * 10 + Character.getNumericValue(c[1]);
            return ax;
        } else {
            int ay = Character.getNumericValue(c[0]);
            return ay;
        }

    }

}


