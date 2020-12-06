package com.test.button.factories;

import com.test.button.buttons.Button;
import com.test.button.checkboxes.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button=factory.createButton();
        checkbox= (Checkbox) factory.createCheckBox();
    }
    public void paint(){
        checkbox.paint();
        button.paint();
    }

    public static interface GUIFactory {
        abstract Button createButton();
        abstract Checkbox createCheckBox();
    }
}
