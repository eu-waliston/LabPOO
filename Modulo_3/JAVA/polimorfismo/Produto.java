/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package polimorfismo;

/**
 *
 * @author wesan
 */
public abstract class Produto {
    private  String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void descricao();; //Método abstrato

    @Override
    public String toString(){
        return "Nome: " + nome + ", Preço: R$" + preco;
    }
}
