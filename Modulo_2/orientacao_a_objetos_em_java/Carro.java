/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wesan
 */
public class Carro extends Veiculo{

    Carro(int adf, String m, String ma, int cilindradas, boolean airbag) {
        super(adf, m, ma);
        this.cilindradas = cilindradas;
        this.airbag = airbag;
    }

    private int cilindradas;
    private boolean airbag;

    public String toString() {
        return "Carro fabricado em: " + getAnoDeFabricacao() + " com " + cilindradas + "cilindradas!";        
    }

    public String AirBag(){
        if(airbag) {
            return "Esse caro tem airbeg!!!";
        }

        return null;
    }

    public static void main(String[] args) {
        Carro c = new Carro(1995, "Ford", "Bigode", 150, true);
        
        System.out.println("O carro criado: " + c);
        System.out.println(c.toString());
        System.out.println(c.AirBag());
    }
}
