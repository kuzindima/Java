/**
 * subString
 */
public class P17 {
    public static void main(String[] args) {
        String s="Big bang theory";
        String x1=subString(s,4,9);
        System.out.println(x1);
    }

    public static String subString(String x, int Start, int End){
        char[] array;
        array=x.toCharArray();//преобразуем строку в массив чаров чтобы можно было обращаться к символам в строке
        x=""; //Удаляем все элементы строки чтобы subString внес в строку свои элементы
        for (int i = Start; i <End ; i++) {
            x+=array[i];
        }
        return(x);
    }
}