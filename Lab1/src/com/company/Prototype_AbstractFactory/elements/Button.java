package com.company.Prototype_AbstractFactory.elements;

import com.company.Prototype_AbstractFactory.Prototype;

import java.util.Objects;

public abstract class Button implements Prototype {
    private String text;
    private Color color;

    public Button(String text, Color color) {
        this.text = text;
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void paint();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Button button = (Button) o;
        return text.equals(button.text) && color == button.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, color);
    }
}
