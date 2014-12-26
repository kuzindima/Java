/**
 * Created by kuzin on 09.12.14.
 */
public class Dog extends Animal implements Soundable,Movable {

    public void sound(){
        System.out.println("woof woof woof");
    }
    public void move(){
        System.out.println(".");
    }
    public void bit(){
        System.out.println("auch");
    }
}