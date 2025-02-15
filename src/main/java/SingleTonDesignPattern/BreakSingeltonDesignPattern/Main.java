package SingleTonDesignPattern.BreakSingeltonDesignPattern;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Early early = Early.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.obj"));
        objectOutputStream.writeObject(early);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.obj"));
        Early o = (Early)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(o.hashCode());
        System.out.println(early.hashCode());
    }
}
