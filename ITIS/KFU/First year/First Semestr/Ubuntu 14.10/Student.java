/**
 * Created by kuzin on 13.12.14.
 */
public class Student {
    public String name;
    public String surname;
    public String middlename;
    public double weight;
    public double height;


    public static void main(String[] args) {
        Student first=new Student("Dima","Kuzin","Andreevich",183.0,78.0);
        Student second=new Student("Elaman","Abdullin","not_found",178.0,75.0);
        System.out.println(first.equals(second));
        String s=first.toString();
        System.out.println(s);
    }
    public Student (String name,String surname,String middlename,double weight,double height){
        this.name=name;
        this.middlename=middlename;
        this.surname=surname;
        this.weight=weight;
        this.height=height;

    }
    public String toString(){
        return surname+" "+name+" "+middlename;
    }
    public boolean equals(Object x) {
        if (this == x){ return true;}
        if (!(x instanceof Student)) return false;
        Student that=(Student) x;
        return (
                that.name.equals(this.name)&& that.surname.equals(this.surname)&&that.middlename.equals(this.middlename));
    }

}
