package refactoring_guru.factory_method.example.factory;

import refactoring_guru.factory_method.example.buttons.Button;
import refactoring_guru.factory_method.example.buttons.WindowsButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
