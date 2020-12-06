package com.test.button.factories;

import com.test.button.buttons.Button;
import com.test.button.buttons.WindowsButton;
import com.test.button.checkboxes.WindowsCheckbox;

public class WindowsFactory implements Application.GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public WindowsCheckbox createCheckBox() {
        return new WindowsCheckbox();
    }

}
