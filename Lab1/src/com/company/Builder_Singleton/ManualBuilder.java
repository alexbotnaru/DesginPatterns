package com.company.Builder_Singleton;

import com.company.Builder_Singleton.components.CPU;
import com.company.Builder_Singleton.components.PhoneColor;
import com.company.Builder_Singleton.components.PhoneType;
import com.company.Builder_Singleton.components.Screen;

public class ManualBuilder implements Builder{

    private PhoneType type;
    private Screen screen;
    private CPU cpu;
    private PhoneColor color;
    private Integer ramCapacity;

    @Override
    public void setPhoneType(PhoneType type) {
        this.type = type;
    }

    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void setRAM(Integer ram) {
        this.ramCapacity = ram;
    }

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setColor(PhoneColor color) {
        this.color = color;
    }

    public Manual getResult(){
        return new Manual(type, screen, cpu, color, ramCapacity);
    }
}
