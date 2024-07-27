/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
public class Veiculo {
    private int anoDeFabricacao;
    private String modelo;
    private String marca;

    Veiculo(int adf, String m, String ma) {
        anoDeFabricacao = adf;
        modelo = m;
        marca = ma;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
