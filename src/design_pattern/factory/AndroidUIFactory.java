package design_pattern.factory;

import design_pattern.factory.buttons.AndroidButton;
import design_pattern.factory.buttons.Button;
import design_pattern.factory.menu.AndroidMenu;
import design_pattern.factory.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
