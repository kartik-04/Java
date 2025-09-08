package design_pattern.factory;

import design_pattern.factory.buttons.Button;
import design_pattern.factory.buttons.WindowsButton;
import design_pattern.factory.menu.Menu;
import design_pattern.factory.menu.WindowsMenu;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
