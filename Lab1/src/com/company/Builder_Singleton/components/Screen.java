package com.company.Builder_Singleton.components;

public class Screen {
    private Float width;
    private String screenType;

    public Screen(Float width, String screenType) {
        this.width = width;
        this.screenType = screenType;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return
                "\nWidth: " + width + "inch" +
                "\nDisplay type:'" + screenType;
    }
}
