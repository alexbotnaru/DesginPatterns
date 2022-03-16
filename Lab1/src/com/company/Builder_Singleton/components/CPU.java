package com.company.Builder_Singleton.components;

public class CPU {
    private Integer nrCore;
    private Float frequency;

    public CPU(Integer nrCore, Float frequency) {
        this.nrCore = nrCore;
        this.frequency = frequency;
    }

    public Integer getNrCore() {
        return nrCore;
    }

    public void setNrCore(Integer nrCore) {
        this.nrCore = nrCore;
    }

    public Float getFrequency() {
        return frequency;
    }

    public void setFrequency(Float frequency) {
        this.frequency = frequency;
    }



}
