/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
public class Main {

    public static void main(String[] args) {

        // Criando um gerente
        Gerente gerente = new Gerente("João", "123.456.789-00", 5000.0, "TI");
        gerente.gerenciarEquipe();
        System.out.println("Salário líquido do gerente: " + gerente.calcularSalarioLiquido());

        // Criando um assistente
        Assistente assistente = new Assistente("Maria", "987.654.321-00", 2500.0, 10);
        assistente.registrarHorasExtra(5);
        System.out.println("Salário líquido do assistente: " + assistente.calcularSalarioLiquido());
    }
}
