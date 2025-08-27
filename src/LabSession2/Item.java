package LabSession2;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;

    Item(String id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    Item(){

    }
    public String getId(){
        return this.id;
    }
    public void setId(String newId){
        this.id = newId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public double price(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        return 0;
    }
}
