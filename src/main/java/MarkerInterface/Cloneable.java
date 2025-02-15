package MarkerInterface;

import java.io.Serializable;

// cloneable marker interface
class Animal implements java.lang.Cloneable {
    int id;
    String name;
    Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Cloneable
{
    public static void main(String[] args) throws CloneNotSupportedException {
       Animal animal = new Animal(1, "Dog");
       Animal d = (Animal)animal.clone();
       d.id = 2;
       System.out.println(d.id);
       System.out.println(animal.id);
    }
}
