package com.test.button.factories;

import com.test.button.buttons.Button;
import com.test.button.checkboxes.Checkbox;

public class MacOsFactory implements Application.GUIFactory {

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Checkbox createCheckBox() {
        return null;
    }
}

