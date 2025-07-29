package LabSession;

import java.util.UUID;

public abstract class user {
    private String userId;
    private String name;
    private String contactInfo;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getContactInfo(){
        return this.contactInfo;
    }
    public void setContactInfo(String contactInfo){
        this.contactInfo=contactInfo;
    }

    // default constructor
    user(){
        this.userId= String.valueOf(Math.random());
        this.name = name;
        this.contactInfo = contactInfo;
    }
    //parametersized constructor
    public void user(String id, String name, String contactInfo){
        this.userId=id;
        this.name=name;
        this.contactInfo=contactInfo;
    }

    // copy constructor
    public void user(user User){
        this.name = name;
        this.contactInfo = User.contactInfo;
        this.userId= userId;
    }

    abstract boolean canBorrowBooks();
    abstract void displayDashboard();
}
