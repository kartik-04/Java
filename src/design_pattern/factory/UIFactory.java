package design_pattern.factory;

import design_pattern.factory.buttons.Button;
import design_pattern.factory.menu.Menu;

public interface UIFactory {
   Button createButton();

   Menu createMenu();
}
