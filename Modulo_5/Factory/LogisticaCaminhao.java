// Implementação da logística de entrega por caminhão
class LogisticaCaminhao extends Logistica {
    // Factory Method específico para criar caminhões
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}