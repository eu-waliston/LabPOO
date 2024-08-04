// Implementação da logística de entrega por bicicleta
class LogisticaBicicleta extends Logistica {
    // Factory Method específico para criar bicicletas
    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}