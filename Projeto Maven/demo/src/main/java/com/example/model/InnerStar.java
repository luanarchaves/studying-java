package com.example.model;

abstract class Star {
    protected Double[] temperatureMaxMin;
    protected String mass;
    protected String mainCompost;

    protected Star(){
        this.mainCompost = "hélio, hidrogênio";
    }

    abstract void setColor();

    protected void FusaoNuclear(){
        System.out.println("Estrelas realizam a fusão nuclear, elas queimam seus proprios compostos, criando energia, que emite luz");
    }

}

class Sun extends Star {

    private Sun(String mass){
        this.mass = "1.980.000.000.000.000.000.000.000.000 toneladas";
        this.temperatureMaxMin = new Double[]{5.500, 15.000000};
    }

    void setColor(){
        System.out.println("A cor do Sol é laranja");
    }
    
}

