/**
 * Created by Дмитрий on 22.11.2014.
 */
public class P35 {
    public static void main(String[] args) {
        int a=strCount("OkOkOkNoNoOk", "Ok");
        System.out.println(a);
    }
    public static int strCount(String text,String str){
        if (text.contains(str)){
            int a=text.indexOf(str)+str.length();
       String newText = text.substring(a);
        return strCount(newText,str)+1;
        }
        
    return 0;
    }
}

