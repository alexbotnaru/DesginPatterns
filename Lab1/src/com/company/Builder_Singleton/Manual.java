package com.company.Builder_Singleton;

import com.company.Builder_Singleton.components.CPU;
import com.company.Builder_Singleton.components.PhoneColor;
import com.company.Builder_Singleton.components.PhoneType;
import com.company.Builder_Singleton.components.Screen;

public class Manual {

    private PhoneType type;
    private Screen screen;
    private CPU cpu;
    private PhoneColor color;
    private Integer ramCapacity;

    public Manual(PhoneType type, Screen screen, CPU cpu, PhoneColor color, Integer ramCapacity) {
        this.type = type;
        this.screen = screen;
        this.cpu = cpu;
        this.color = color;
        this.ramCapacity = ramCapacity;
    }

    public String print() {
        String manualText = null;
        try {
            manualText =
                    "Manual for the phone: " + type.getBrand() + " " + type.getSeries() +
                            "\nFeatures " +
                            "\nWidth: " + screen.getWidth() + " inch" +
                            "\nDisplay type:" + screen.getScreenType() +
                            "\nCPU: " + cpu.getNrCore() + " core," + cpu.getFrequency() + " Ghz" +
                            "\nColor: " + color +
                            "\nRAM: " + ramCapacity + " GB";
        } catch (NullPointerException e) {
            System.out.println("The specifications of this phone are incomplete!\nManual can't be printed! ");
        }
        return manualText;
    }
}
