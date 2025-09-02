package facade;

public class CheckOutFacade {

    private final AuthService auth = new AuthService();
    private final InventoryService inv = new InventoryService();
    private final PaymentService pay = new PaymentService();

    public String checkout(String user, String pass, String sku, String card, String address,
                           int qlt, double amount){

    }
}
