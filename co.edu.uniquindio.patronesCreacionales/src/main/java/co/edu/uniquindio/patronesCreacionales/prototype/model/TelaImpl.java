package co.edu.uniquindio.patronesCreacionales.prototype.model;

import co.edu.uniquindio.patronesCreacionales.prototype.services.ITela;

public class TelaImpl implements ITela {
    private String color;
    private double tamano;
    private Tipo tipo;



    public TelaImpl(String color, double tamano, Tipo tipo) {
        this.color = color;
        this.tamano = tamano;
        this.tipo = tipo;
    }

    public TelaImpl() {

    }

    public ITela clonar(){
        TelaImpl tela= null;
        try{
            tela=(TelaImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return tela;
    }

    @Override
    public String toString() {
        return "TelaImpl{" +
                "color='" + color + '\'' +
                ", tamano=" + tamano +
                ", tipo=" + tipo +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}

