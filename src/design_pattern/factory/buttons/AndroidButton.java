package design_pattern.factory.buttons;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicking AndroidButton");
    }
}
