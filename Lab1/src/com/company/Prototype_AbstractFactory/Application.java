package com.company.Prototype_AbstractFactory;

import com.company.Prototype_AbstractFactory.elements.Button;
import com.company.Prototype_AbstractFactory.elements.CheckBox;
import com.company.Prototype_AbstractFactory.elements.Color;
import com.company.Prototype_AbstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;
    private GUIFactory factory;

    public Application(GUIFactory factory){
        this.factory = factory;
    }

    public Button paintButton(String text, Color color){
        button = factory.createButton(text, color);
        button.paint();

        return button;
    }

    public CheckBox paintCheckBox(boolean checked){
        checkBox = factory.createCheckBox(checked);
        checkBox.paint();

        return checkBox;
    }

}
