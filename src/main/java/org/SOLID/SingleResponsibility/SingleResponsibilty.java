package org.SOLID.SingleResponsibility;

public class SingleResponsibilty
{
//    A single class should have only one reason to change
}
class Marker{
    int color;
    int size;
    int price;

    public Marker(int color, int price, int size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }
}
//This is not following the Single Responsiblity as this as three reason to change
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public void printInvoce(){}
    public void saveToDb(){}
}
//To make them Single responsible I will make serparate classes to make them single responsible
class InvoiceDAO{
    private Invoice invoice;
    public InvoiceDAO(Invoice invoice) {this.invoice = invoice;}
    public void printInvoice(){}
}
class InvoiceDB{
    private Invoice invoice;
    public InvoiceDB(Invoice invoice) {this.invoice = invoice;}
    public void saveToDb(){}
}