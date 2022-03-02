package refactoring_guru.factory_method.example;

import refactoring_guru.factory_method.example.factory.Dialog;
import refactoring_guru.factory_method.example.factory.HtmlDialog;
import refactoring_guru.factory_method.example.factory.WindowDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {

        System.out.println(System.getProperty("os.name"));
        configure();
        runBusinessLogic();

    }

    static void configure() {
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
