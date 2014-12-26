/**
* Created by Дмитрий on 02.12.2014.
*/
public class P41 {
    public static void main(String[] args) {
        Animal1[] animalArray1 = new Animal1[2];
        animalArray1[0] = new Dog1();
        animalArray1[1] = new Cat2();
        for (int i = 0; i < 4; i++) {
            animalArray1[i].sound();
        }
    }
}