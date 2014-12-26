/**
 * Created by kuzin on 09.12.14.
 */
public class Main{
    public static void main(String[] args) {
        Soundable a=new Sofa();
        live(a);
        Soundable b = new Dog();
        live(b);
        Movable d = new Cat();
        live(d);
        Factory x=new Factory();
        x.getCat().sound();
    }

    public static void live(Soundable a) {
        a.sound();
    }
    public static void live(Movable a) {
        a.move();
    }
}

