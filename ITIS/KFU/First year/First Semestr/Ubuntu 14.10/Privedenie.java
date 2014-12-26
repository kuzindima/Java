/**
 * Created by kuzin on 16.12.14.
 */
public class Privedenie {
    public static void main(String[] args) {
        Animal x =new Dog();
        Dog d=(Dog) x;
        if (d!=null)
        d.bit();
        Cat y=new Cat();
        y.sound();
        y.sound("Meow");
        y.sound();


    }
}
