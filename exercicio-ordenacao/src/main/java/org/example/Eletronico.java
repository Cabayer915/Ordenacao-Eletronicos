package org.example;

public class Eletronico {
    private int id;
    private String marca;
    private String modelo;
    private String tipoCarregador;
    private int bateria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCarregador() {
        return tipoCarregador;
    }

    public void setTipoCarregador(String tipoCarregador) {
        this.tipoCarregador = tipoCarregador;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Eletronico(int id, String marca, String modelo, String tipoCarregador, int bateria) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCarregador = tipoCarregador;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCarregador='" + tipoCarregador + '\'' +
                ", bateria=" + bateria +
                '}';
    }
}
