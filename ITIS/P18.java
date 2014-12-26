/**
 * Created by Дмитрий on 01.11.2014.
 */
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class P18 {

        public static void main(String[] args) throws IOException {


          int x1= comapre("Антон".toLowerCase().trim(),"антон".toLowerCase().trim());
          int x2=comapre("Алексей".toLowerCase().trim(),"АлекСей".toLowerCase().trim());
          int x3=comapre("Гоша".toLowerCase().trim(),"ГОШАН".toLowerCase().trim());
          int x4=comapre("Маша ".toLowerCase().trim(),"Маша".toLowerCase().trim());
          int x5=comapre("Маша".toLowerCase().trim(),"Антон".toLowerCase().trim());

            System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5);
        }

        public static int comapre(String x1, String x2){
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
