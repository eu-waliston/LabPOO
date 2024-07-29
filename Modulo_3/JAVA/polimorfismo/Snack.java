package polimorfismo;

public class Snack extends Produto {
    private double peso;

    public Snack(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public void descricao(){
        System.out.println("Este é um snack com peso de " + peso + " gramas.");
    }

    @Override
    public String toString(){
        return super.toString() + ", Peso: " + peso + "g";
    }
}
