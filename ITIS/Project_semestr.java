import javax.swing.*;
import javax.swing.text.AttributeSet;
import java.util.Scanner;
import java.io.*;
public class Project_semestr {//додумать интерфейс(стирать поле в консоли),
// тороидальные переходы(сохранять предыдущее поле) и сохронки
    static Scanner sc;
//    static int size=0;
//    static String[][] arr=new String[size][size];

    public static void main(String[] args)  {
        sc = new Scanner(System.in);
     //   System.out.println("Do you want to start from checkpoint?");
       // String op=sc.next();
//        if ((op.equals("Y"))|(op.equals("y"))){
//            System.out.println("Add your checkout address");
//        String g = sc.next();
//            openFile(g);
//            readFile();
//            out();
//        }
            System.out.println("Which size game field do you want:");
            int n = sc.nextInt();
            //size=n;
            System.out.println("Print 'exit' to close program");
            System.out.println("Please,use only up,left,down,right and goto(x,y)");
            System.out.println("Задайте положение АИ : x,y");
            System.out.println("c-continue");
            int x = sc.nextInt();
            int y = sc.nextInt();
            String[][] arr = new String[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = "*";
                }
            }
            arr[x][y] = "#";

        //печать поля
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
        //ускоряет ввод
        String repeat="";
        while(1<2) {
            String xz = sc.next();
            clr();
            if(xz.equals("c")){
                command(arr,repeat);
            }
            else{
                command(arr, xz);
            }
            if (xz.equals("exit"))
                break;
            if((xz.equals("right"))|(xz.equals("left"))|(xz.equals("up"))|(xz.equals("down"))|(xz.equals("goto"))){
            repeat=xz;}
        }//checkpoint

        System.out.println("Do you want to save game field?(Y/N)");
        String answer=sc.next();
        if((answer.equals("Y"))|answer.equals("y")){
            System.out.println("Add your name:");
            String name=sc.next();
            write(name+".txt",arr);
        }
        ;
    }
    public static void command(String[][] arr,String x){
//        if (x.equals("goto")) {
//            goTo(arr);
//        }
//        else
        if (x.equals("right")){
            right(arr);
        }
        else if (x.equals("left")){
            left(arr);
        }
        else if (x.equals("up")){
            up(arr);
        }
        else if (x.equals("down")){
            down(arr);
        }
        else if (x.contains("goto")){
              char[] com=x.toCharArray();
              int ax=Character.getNumericValue(com[4]);
              int ay=Character.getNumericValue(com[5]);
            goTo(arr,ax,ay);

        }
        else if (!x.contains("exit")){
            System.out.println("Command not found");
        }

//        else if(x.equals("start from checkpoint")){
//            System.out.println("Укажите путь к файлу");
//            String a=sc.next();
//            openFile(a);
//            readFile();
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");

    }
    //команды для #(АИ)
    public static void goTo(String[][] x,int x1,int y1){
        sc=new Scanner(System.in);
//        int x1=sc.nextInt();
//        int y1=sc.nextInt();
        x[searchUi(x,"a")][searchUi(x,"b")]="*";
        x[x1][y1]="#";

    }
    public static void right(String[][] x){
        int a=searchUi(x,"a");
        int b=searchUi(x,"b");
        x[a][b] = ".";
        int b1=b+1;
        if (b1==x.length) {
            b=-1;
            x[a][x.length-1]="*";
        }
        x[a][b+1] = "#";
    }
    public static void left(String[][] x){
        int a=searchUi(x,"a");
        int b=searchUi(x,"b");
        x[a][b]=".";
        int b1=b-1;
        if (b1==-1) {
            b = x.length;
            x[a][0] = "*";
        }
        x[a][b-1]="#";
    }
    public static void up(String[][] x){
        int a=searchUi(x,"a");
        int b=searchUi(x,"b");
        x[a][b]=".";
        int a1=a-1;
        if(a1==-1){
            a=x.length;
            x[0][b]="*";
        }
        x[a-1][b]="#";
    }
    public static void down(String[][] x){
        int a=searchUi(x,"a");
        int b=searchUi(x,"b");
        x[a][b]=".";
        int a1=a+1;
        if (a1==x.length){
            a=-1;
            x[x.length-1][b]="*";
        }
        x[a+1][b]="#";
    }
    //метод для поиска #(АИ)
    public static int searchUi(String[][] x,String letter){
        int[] c=new int[2];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if(x[i][j].equals("#")){
                    c[0]=i;
                    c[1]=j;
                }
            }
        }
        if (letter.equals("a")){
            return c[0];
        }
        else {
        return c[1];
        }
    }
    //делает checkpoint
    public static void write(String fileName, String[][] arr) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                for (int i = 0; i < arr.length; i++) {
                    out.println("");
                    for (int j = 0; j < arr.length; j++) {
                        out.print(arr[i][j] + " ");
                    }
                }
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void clr(){
        for (int i = 0; i < 25; i++) {
            System.out.println("\n\n\n\n\n");
        }
    }

//    private static void openFile(String x){
//        try{
//        sc=new Scanner(new File(x));
//        }catch (Exception e){JOptionPane.showMessageDialog(null,"Файл не найден!");}
//
//    }
//    private static void readFile(){
//        while(sc.hasNext()){
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr.length; j++) {
//                    arr[i][j]=sc.next();
//                }
//            }
//        }
//    }
//    public static void out(){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("");
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }
//    }

}

