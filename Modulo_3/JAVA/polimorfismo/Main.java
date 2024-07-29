package polimorfismo;


public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Produto produtos1 = new Bebida("Refrigerante", 5.99, 2.0);
        Produto produtos2 = new Snack("Batata Frita", 3.49, 150.0);
        Produto produtos3 = new Refeicao("Lasagna", 15.99, "Prato Principal");

        empresa.adicionarProduto(produtos1);
        empresa.adicionarProduto(produtos2);
        empresa.adicionarProduto(produtos3);
    }

}
