/**
 * Сортировка в массиве строк по алфавиту
 */
public class P10 {
    public static void main(String[] args) {
        String[] names = {"Максим", "Артём", "Александр", "Никита", "Дмитрий", "Кирилл", "Даниил", "Иван", "Андрей", "Илья", "Владислав", "Егор", "Алексей", "Роман", "Сергей", "Михаил", "Денис", "Ярослав", "Матвей", "Владимир", "Данил", "Евгений", "Тимофей", "Павел", "Арсений", "Тимур", "Константин", "Вадим", "Антон", "Глеб", "Николай", "Игорь", "Богдан", "Данила", "Руслан", "Олег", "Артур", "Семен", "Вячеслав", "Степан"};
        int result=-1;
        String buf;
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1; j++) {
                result=comapre(names[j],names[j+1]);
                if(result==2){
                    buf=names[j];
                    names[j]=names[j+1];
                    names[j+1]=buf;
                }
            }
        }
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }

    }
    public static int comapre(String x1, String x2){
        x1.toLowerCase().trim();
        x2.toLowerCase().trim();
    char[] array1 = x1.toCharArray();
    char[] array2 = x2.toCharArray();

    int minLength = x1.length() > x2.length() ? x2.length() : x1.length();

    for(int i = 0; i < minLength; i++){
        int x = 1;
        if(array1[i] < array2[i]){
            return 1;
        }else if(array2[i] < array1[i]){
            return 2;
        }
    }
    if(x1.length() == x2.length())
        return 0;
    else
        return x1.length() > x2.length() ? 2: 1;

}
}

