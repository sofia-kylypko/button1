package com.test.button.factories;

import com.test.button.buttons.Button;
import com.test.button.buttons.LinuxButton;
import com.test.button.checkboxes.Checkbox;
import com.test.button.checkboxes.LinuxCheckbox;

public class LinuxFactory implements Application.GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new LinuxCheckbox();
    }
}