/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
public class Calcular {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(3, 4);

        float resultados = calc.media();

        System.out.println("A média é igual a: " + resultados);
    }
}
