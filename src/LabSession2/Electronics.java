package LabSession2;

public class Electronics extends Item {
    public int warranty;

    Electronics(String id, String name, double price, int quantity){
        super(id, name, price, quantity);
        this.warranty = quantity;
    }

    public int getWarranty(){
        return this.warranty;
    }

}
