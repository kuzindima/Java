/**
 * Created by kuzin on 16.12.14.
 */
public class Horse extends Animal  implements Soundable,Movable {

    public  void move(){
        System.out.println("^^");
    }
    public  void sound(){
        System.out.println("brshhhh");
    }
}
