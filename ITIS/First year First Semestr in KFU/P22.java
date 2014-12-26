public class P22 {
    public static void main(String[] args) {
        String x = "Martin say : \" <b>Hello</b> for <b>Sasha</b> !\"";
        int a;
        int c;
        String b="";
        int i=0;
        while (i<2) {
            i++;
            a = x.indexOf("<b>");
            c = x.indexOf("</b>");
            b += x.substring(a + 3, c)+" ";
            x = x.substring(c+4);
        }
        System.out.println(b);
    }
    public static String substring(String x, int Start, int End){
        char[] array;
        array=x.toCharArray();
        x=""; 
        for (int i = Start; i <End ; i++) {
            x+=array[i];
        }
        return(x);
    }
}
