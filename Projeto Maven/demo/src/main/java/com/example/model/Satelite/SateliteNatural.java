package com.example.model.Satelite;


class SateliteNatural extends Satelite{
    protected String massa;

    protected SateliteNatural(String massa){
        this.massa = massa;
    }


    @Override
    void Orbitar(){
        System.out.println("Orbitando planeta");
    }
}

