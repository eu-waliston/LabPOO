//Definição da superclasse 
public class Pessoa {
    //Atributos da classe Pessoa
    protected String nome;
    protected int idade;

    //conmstrutor da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Metodo da classe pessoa
    public void apresentar(){
        System.out.println("Olá, meu nome é "+ nome + " e eu tenho " + idade + "anos :)");
    }
}