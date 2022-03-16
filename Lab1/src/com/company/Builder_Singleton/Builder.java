package com.company.Builder_Singleton;

import com.company.Builder_Singleton.components.CPU;
import com.company.Builder_Singleton.components.PhoneColor;
import com.company.Builder_Singleton.components.PhoneType;
import com.company.Builder_Singleton.components.Screen;

public interface Builder {
    void setPhoneType(PhoneType type);
    void setScreen(Screen screen);
    void setRAM(Integer ram);
    void setCPU(CPU cpu);
    void setColor(PhoneColor color);
}
