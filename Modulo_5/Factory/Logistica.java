
public abstract class Logistica {
    abstract Transporte criarTransporte();

    public void realizarEntrega(){
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
