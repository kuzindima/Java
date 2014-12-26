/**
 * Created by kuzin on 13.12.14.
 */
public class Factory {
    public Cat getCat(){
        Cat x=new Cat();
        return x;
    }
    public Dog getDog(){
        Dog x=new Dog();
        return x;
    }
    public Chair getChair(){
        Chair x=new Chair();
        return x;
    }
    public Sofa getSofa(){
        Sofa x=new Sofa();
        return x;
    }
}
