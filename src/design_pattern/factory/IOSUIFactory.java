package design_pattern.factory;

import design_pattern.factory.buttons.Button;
import design_pattern.factory.buttons.IOSButton;
import design_pattern.factory.menu.IOSMenu;
import design_pattern.factory.menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
