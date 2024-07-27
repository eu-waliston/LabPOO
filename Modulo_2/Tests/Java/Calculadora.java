/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
public class Calculadora {
    private int primeiroValor, segundoValor;

    public Calculadora(int primeiroValor, int segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    public float media(){
        float media = 0;
        media = this.primeiroValor + this.segundoValor /2;
        return media;
    }

    public int maximo(){
        if(primeiroValor < segundoValor) {
            return this.segundoValor;
        }

        return this.primeiroValor;
    }

   // public int minimo(){

   // }
}
