package polimorfismo;

public class Refeicao  extends  Produto{
    private String tipo;

    public Refeicao(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public void descricao(){
        System.out.println("Esta é uma refeição do tipo " + tipo + ".");
    }

    @Override
    public String toString(){
        return super.toString() + ", Tipo: " + tipo;
    }
}
