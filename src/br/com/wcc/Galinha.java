package br.com.wcc;

public class Galinha implements Animal{
    private int destino;

    public void setdestino(int destino){
        this.destino=destino;
    }

    public int getdestino(){
        return destino;
    }

    @Override
    public int Andar() {
        destino=-1;
        return destino;
    }

    @Override
    public int Comer() {
        destino=+1
        return destino;
    }
}
