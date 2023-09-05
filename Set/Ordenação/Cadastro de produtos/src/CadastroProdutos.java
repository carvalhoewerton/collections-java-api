import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    private static Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }
    public static void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public static Set<Produto> exibirProdutosPorNome(){
        Set<Produto> alfabetico = new TreeSet<>(produtos);
        return alfabetico;
    }
    public static Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> preco = new TreeSet<>(new ComparatorPorPreco());
        preco.addAll(produtos); 
        return preco;
    }
    public static void main(String args[]){
        CadastroProdutos produtos = new CadastroProdutos();

            adicionarProduto(1, "AProduto1", 10.99, 5);
            adicionarProduto(2, "bProduto2", 15.49, 3);
            adicionarProduto(3, "cProduto3", 8.99, 8);
            adicionarProduto(4, "dProduto4", 25.99, 2);
            adicionarProduto(5, "fProduto5", 19.99, 7);
            adicionarProduto(6, "gProduto6", 12.49, 4);
            adicionarProduto(7, "hhhProduto7", 6.99, 10);
            adicionarProduto(8, "lProduto8", 14.99, 6);
            adicionarProduto(9, "llProduto9", 9.99, 9);
        
        Set<Produto> nome = exibirProdutosPorNome();
        for(Produto p:nome){
            System.out.print(p.getNome() + " " + "\n");
        }
        Set<Produto> numero = exibirProdutosPorPreco();
        for(Produto p:numero){
            System.out.print(p.getPreco() + " " + "\n");
        }



    }


}