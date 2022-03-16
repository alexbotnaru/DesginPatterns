package com.company.Builder_Singleton;

import com.company.Builder_Singleton.components.CPU;
import com.company.Builder_Singleton.components.PhoneColor;
import com.company.Builder_Singleton.components.PhoneType;
import com.company.Builder_Singleton.components.Screen;

public class Phone {

    private PhoneType type;
    private Screen screen;
    private CPU cpu;
    private PhoneColor color;
    private Integer ramCapacity;

    public Phone(PhoneType type, Screen screen, CPU cpu, Integer ramCapacity, PhoneColor color) {
        this.type = type;
        this.screen = screen;
        this.cpu = cpu;
        this.color = color;
        this.ramCapacity = ramCapacity;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public PhoneColor getColor() {
        return color;
    }

    public void setColor(PhoneColor color) {
        this.color = color;
    }

    public Integer getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(Integer ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
}
