/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
// Gerente.java
public class Gerente extends Funcionario {
    private final String departamento;
    
    // Construtor
    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario); // Chama o construtor da superclasse Funcionario
        this.departamento = departamento;
    }
    
    // Método específico para Gerente
    public void gerenciarEquipe() {
        System.out.println(getNome() + " está gerenciando o departamento de " + departamento);
    }
}

