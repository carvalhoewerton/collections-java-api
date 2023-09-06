import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private static Map<Long, Produto> produtos;
    private Long cod;
    public EstoqueProdutos(){
        this.produtos = new HashMap<>();
    }

    public static void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtos.put(cod, new Produto(nome, quantidade, preco));

    }

    public static void exibirProdutos(){
        System.out.print(produtos);

    }

    public static double calcularValorTotalEstoque(){
        double valorTotal =0;
        if(!produtos.isEmpty()){
            for(Produto p:produtos.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        } return valorTotal;


    }
    
    public static Produto obterProdutoMaisCaro(){
        Produto caro = null;
        double maior = 0;
        if(!produtos.isEmpty()){
            for(Produto p:produtos.values()){
                if(p.getPreco() > maior){
                    caro = p;
                }
            }

        } return caro;



    }



    public static void main(String args[]){
        EstoqueProdutos produtos = new EstoqueProdutos();

        adicionarProduto(1001, "Camiseta", 10, 19.99);
        adicionarProduto(2002, "Calça Jeans", 5, 49.99);
        adicionarProduto(3003, "Tênis", 20, 79.99);
        adicionarProduto(4004, "Mochila", 8, 39.99);
        adicionarProduto(5005, "Boné", 15, 9.99);

        double valorTotal = calcularValorTotalEstoque();
        System.out.printf("Valor total: %.2f%n", valorTotal);

        Produto caro = obterProdutoMaisCaro();
        System.out.print("Produto mais caro: " + caro.getNome() + "\n");

        exibirProdutos();








    }

}   
