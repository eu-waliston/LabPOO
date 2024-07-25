//Definição da subclasse que herda da Pessoa
public class Estudante extends Pessoa {
    //Atributo adicional da subclasse Estudante
    private String instituicao;

    //Construtor da subclasse Estudante
    public Estudante(String nome, int idade, String instituicao) {
        //chamada ao construtor da superclasse Pessoa
        super(nome, idade);
        this.instituicao = instituicao;
    }

    //Metodo especifico da subclase Estudanate
    public void estudar(){
        System.out.println(nome + " está estudando na instituição " + instituicao);
    }
}

