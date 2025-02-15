package MarkerInterface;

import java.io.*;

// Serializable marker interface
class Animal1 implements Serializable {
    int id;
    String name;

    Animal1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal1 a = new Animal1(1, "Bob"); // Use Animal1

        // Serialize object to file
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();
        fos.close();

        // Deserialize object from file
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Animal1 o = (Animal1) ois.readObject(); // Correct class name
        System.out.println(o.name + " " + o.id);
        ois.close();
        fis.close();
    }
}
