// Exemplo de uso do Factory Method
public class ExemploFactoryMethod {
    public static void main(String[] args) {
        // Criando uma instância da logística de caminhão
        Logistica logisticaCaminhao = new LogisticaCaminhao();
        logisticaCaminhao.realizarEntrega();

        // Criando uma instância da logística de bicicleta
        Logistica logisticaBicicleta = new LogisticaBicicleta();
        logisticaBicicleta.realizarEntrega();
    }
}