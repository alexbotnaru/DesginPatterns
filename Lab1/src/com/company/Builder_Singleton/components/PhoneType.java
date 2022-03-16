package com.company.Builder_Singleton.components;

public class PhoneType {
    private Brand brand;
    private String series;

    public PhoneType(Brand brand, String series) {
        this.brand = brand;
        this.series = series;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

}
