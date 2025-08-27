package LabSession2;

public class Clothing extends Item{
    public String size;

    public String getSize(){
        return this.size;
    }

    Clothing(String id, String name, double price, int quantity, String size){
        super(id, name, price, quantity);
        this.size = size;
    }
}
