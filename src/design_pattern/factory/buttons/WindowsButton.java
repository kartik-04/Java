package design_pattern.factory.buttons;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicking Windows Button");
    }
}
