package ShalowVsDeep;
class Adreess implements  Cloneable{
    String streetName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student implements Cloneable{
    String name;
    int age;
    Adreess adreess;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s=(Student)super.clone();
        s.adreess=(Adreess)adreess.clone();
        return s;
    }
}
public class Demo
{
    public static void main(String[] args) throws CloneNotSupportedException {
        // copy by refernce
//        Student s1 = new Student();
//        Student s2 = s1;
//        s1.age=1;
//        s2.age=2;
//        System.out.println(s1.age);

        // Shallow Copy -> only works with primitive data type and string as well
        // for string as it immutable
        // But for object it will not work
        Student s1 = new Student();

        s1.age=10;
        System.out.println(s1.age);
        s1.adreess=new Adreess();
        s1.adreess.streetName="HIG A 103 Ramganga";

        Student s2 = (Student) s1.clone();
        s2.age=20;
        s2.adreess.streetName="bnafa";
        System.out.println(s1.adreess.streetName);
        System.out.println(s2.adreess.streetName);

        // Deep Copy -> works with Object type copy as well




    }
}
