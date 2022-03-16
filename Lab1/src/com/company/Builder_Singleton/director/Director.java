package com.company.Builder_Singleton.director;

import com.company.Builder_Singleton.Builder;
import com.company.Builder_Singleton.components.*;

public class Director {
    private static Director instance;

    private Director(){}

    public static Director getInstance(){
        if (instance == null){
            instance = new Director();
        }
        return instance;
    }


    public void constructSamsungPhone(Builder builder){
        PhoneType type = new PhoneType(Brand.SAMSUNG, "A12");
        Screen screen = new Screen(5.5f, "Super AMOLED");
        CPU cpu = new CPU(8, 2.1f);
        builder.setPhoneType(type);
        builder.setScreen(screen);
        builder.setRAM(8);
//        builder.setCPU(cpu);
        builder.setColor(PhoneColor.BLACK);
    }

    public void constructApplePhone(Builder builder){
        PhoneType type = new PhoneType(Brand.APPLE, "11");
        Screen screen = new Screen(6f, "IPS LCD");
        CPU cpu = new CPU(4, 2.0f);
        builder.setPhoneType(type);
        builder.setScreen(screen);
        builder.setRAM(4);
        builder.setCPU(cpu);
        builder.setColor(PhoneColor.WHITE);
    }

    public void constructXiaomiPhone(Builder builder){
        PhoneType type = new PhoneType(Brand.XIAOMI, "Mi 11");
        Screen screen = new Screen(6.2f, "Super AMOLED");
        CPU cpu = new CPU(8, 2.5f);
        builder.setPhoneType(type);
        builder.setScreen(screen);
        builder.setRAM(16);
        builder.setCPU(cpu);
        builder.setColor(PhoneColor.GREY);
    }
}
