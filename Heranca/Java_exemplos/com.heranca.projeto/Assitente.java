/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
// Assistente.java
public class Assitente extends Funcionario {
    private int horasExtra;
    
    // Construtor
    public Assitente(String nome, String cpf, double salario, int horasExtra) {
        super(nome, cpf, salario); // Chama o construtor da superclasse Funcionario
        this.horasExtra = horasExtra;
    }
    
    // Método específico para Assistente
    public void registrarHorasExtra(int horas) {
        horasExtra += horas;
    }
    
    // Sobrescrita do método calcularSalarioLiquido para Assistente
    @Override
    public double calcularSalarioLiquido() {
        double salarioBase = getSalario();
        double salarioComHorasExtras = salarioBase + (horasExtra * 20); // Exemplo de pagamento de horas extras
        return salarioComHorasExtras * 0.85; // Aplica o desconto
    }
}

