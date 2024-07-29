package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Produto> produtos;

    public Empresa(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirInformacoes(){
        for (Produto produto : produtos) {
            System.out.println(produto);
            produto.descricao();
            System.out.println();
        }
    }
}
