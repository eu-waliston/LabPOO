/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //construtor
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Metodos getterse setters
    public String getNome(){
        return nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodo para calcular o salário liquido
    public double calcularSalarioLiquido(){
        return salario * 0.85; //exemplo de desconto de 15%
    }
}
