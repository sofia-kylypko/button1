package com.test.button.buttons;

import com.test.button.buttons.Button;

public class WindowsButton implements Button {
    @Override
    public void paint()  {
        System.out.println("You have created the Windows button");
    }
}
