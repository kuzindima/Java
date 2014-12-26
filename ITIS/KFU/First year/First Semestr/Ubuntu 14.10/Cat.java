/**
 * Created by kuzin on 09.12.14.
 */
public class Cat extends Animal implements Soundable,Movable {
    private static String soundText="I'm cat!";
//    public Cat(String str){
//        soundText=str;
//    }
    public void sound(){
        System.out.println("Meow Meow Meow");
    }
    public void move(){
        System.out.println("*");
    }
    public void sound(String soundText){
        System.out.println(this.soundText);
    }
}
