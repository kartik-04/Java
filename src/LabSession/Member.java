package LabSession;

public class Member extends user{
    private final int MAX_BORROW_LIMIT = 5;
    private int borrowedBooksCount;



    @Override
    void displayDashboard() {
        System.out.println("Books Borrowed:" + this.borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        if(borrowedBooksCount < MAX_BORROW_LIMIT)
            return true;
        return false;
    }

    public void Member(){

    }
    /* displayDashboard() should display Member Dashboard and Books Borrowed: X.
canBorrowBooks() should return true if borrowedBooksCount < MAX_BORROW_LIMIT.
*/

}
