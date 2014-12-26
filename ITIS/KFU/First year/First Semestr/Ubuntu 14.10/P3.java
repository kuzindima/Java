/**
 * Created by kuzin on 14.12.14.
 */
public class P3 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            // any action
            System.out.println("this is try");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
