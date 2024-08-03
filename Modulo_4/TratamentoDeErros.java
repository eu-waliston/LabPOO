
import java.io.FileReader;
import netscape.javascript.JSObject;

public class TratamentoDeErros {
     static String con = "./temp.f";
    static String lerArquivo(String nomeArq) {
        String conteudo = "./temp.f";
        try {
            FileReader fr = new FileReader(nomeArq);
            fr.read();
            fr.close();
        } catch (Exception e) {
            System.out.println("Não deu certo");
        }

        return conteudo;
    }

    public static void main(String[] args) {
        try  {
            System.out.println(lerArquivo(String.format(con, (Object) args)));
        } catch (Exception e) {
            System.out.println("""
                               Nao foi possivel ler o arquivo
                               """ + e);
        }
    }
}
