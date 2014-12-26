/**
 * Created by Дмитрий on 28.10.2014.
 */
public class P12 {
    public static void main(String[] args) {
        String s="Многие думают, что Lorem Ipsum - взятый с потолка псевдо-латинский набор слов, но это не совсем так.";
           s= s.replace (" -","");//выпиливаем ненужные нам символы
           s=  s.replace(",","");
           s= s.replace(".","");
        String[] arrWords= s.split(" "); //разделяем строку по пробелам и сохраныем в массив

        for (int i = 0; i < arrWords.length; i++) {//выводим наш массив
            System.out.println(arrWords[i]);
        }
    }
}
