/**
 * Created by kuzin on 09.12.14.
 */
public class Chair extends Furniture implements Soundable,Movable {
    public void sound() {
        System.out.println("chair chair chair");
    }
    public void move(){
        System.out.println("_ _ _ _ _ _ _ _ _");
    }
}
