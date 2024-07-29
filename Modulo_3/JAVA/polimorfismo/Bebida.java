package polimorfismo;

public class Bebida extends Produto {

    private double volume;


    public Bebida(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    @Override
    public void descricao(){
        System.out.println("Esta é uma bebioda com volume de " + volume + " litros.");
    }



}