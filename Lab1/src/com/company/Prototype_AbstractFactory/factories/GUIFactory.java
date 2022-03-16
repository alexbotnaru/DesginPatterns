package com.company.Prototype_AbstractFactory.factories;

import com.company.Prototype_AbstractFactory.elements.Color;
import com.company.Prototype_AbstractFactory.elements.Button;
import com.company.Prototype_AbstractFactory.elements.CheckBox;

public interface GUIFactory {
    Button createButton(String text, Color color);
    CheckBox createCheckBox(boolean checked);
}
