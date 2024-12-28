package org.SOLID.OpenClosed;


import org.SOLID.SingleResponsibility.Invoice;

public class O {
    //Open for extension and closed for modification
}
//Now if i want to add thefeature of saving into file as welll. it will looks like this
class InvoiceDB{
    private Invoice invoice;
    public InvoiceDB(Invoice invoice) {this.invoice = invoice;}
    public void saveToDb(){}
}
//❌❌ this is not following the principle . Its should be closed to Modificaiton
class InvoiceDBFile{
    private Invoice invoice;
    public InvoiceDBFile(Invoice invoice) {this.invoice = invoice;}
    public void saveToDb(){};
    public void saveToFile(){};
}

interface  InvoiceSave{
    void saveToDB();
    void saveToFile();
//    Now make two classes to implement this interface
//    For example in future one new saving method then
//    we dont have to do the modification we will do the extension
//    we will add in the interface and the separate class will implements

//    "Jo class already live and testable hai -> usko modify mtt kro "
}
