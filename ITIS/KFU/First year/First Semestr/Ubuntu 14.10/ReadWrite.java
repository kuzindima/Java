import java.io.*;
import java.util.Scanner;

/**
 * Created by kuzin on 23.12.14.
 */
public class ReadWrite {

    public static void main(String[] args) {
        read("santaFile","Hey Hey Hey I'm Santa! Give me cookies (^^) ");
        System.out.println(write());
    }
    //Запись в файл
    public static void read(String nameOfFile,String x){
        FileOutputStream Stream = null;
        try {
            Stream = new FileOutputStream(nameOfFile+".txt");
            Stream.write(x.getBytes());
        } catch (Exception e) {

        } finally {
            try {
                Stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PrintWriter print = null;
        try{
            print = new PrintWriter("11.txt");
            print.println("Hey! ");
        }catch (Exception e){

        }finally{
            print.close();
        }
    }
    //чтение из файла
    public static String write() {
        FileInputStream Stream = null;
        String x = null;
        try {
            Stream = new FileInputStream("1.txt");
//            DataInputStream s=new DataInputStream(Stream);
            Scanner sc = new Scanner(Stream);
            x = sc.nextLine();
        } catch (Exception e) {

        } finally {
            try {
                Stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return x;
    }
}
