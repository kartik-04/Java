package design_pattern.factory.buttons;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicking IOSButton");
    }
}
