/**
 * Created by Дмитрий on 02.12.2014.
 */
public class P40 {
    public static void main(String[] args) {
        Animal[] animalArray = new Animal[4];

        animalArray[0] = new Dog();
        animalArray[1] = new Cat();

        animalArray[2] = new Pinguin();
        animalArray[3] = new Fox();

        for(int i = 0 ; i < 4; i++){
            animalArray[i].sound();
        }
    }
}
