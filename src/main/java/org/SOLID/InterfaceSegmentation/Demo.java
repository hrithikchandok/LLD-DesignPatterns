package org.SOLID.InterfaceSegmentation;

public class Demo {
//    Jo classes ki need hai methods ki unhi ko implement krna chahiye
//one interface should have only necessary methods in it

}

interface waiter{
    void cleanBathrooom();
    void serveFood();
}

class WaiterDuty implements waiter{


    // this is the unessary method
    @Override
    public void cleanBathrooom() {

    }

    @Override
    public void serveFood() {

    }
}

//we should Segement or divide the related methods in diff interface

interface waiter1{
    void serveFood();
}
interface cleaner{
    void cleanBathrooom();
}
