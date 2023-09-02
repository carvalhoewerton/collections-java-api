
import java.util.ArrayList;
import java.util.List;



public class CarrinhoCompras {
    private static List<Item> lista;

    public CarrinhoCompras(){
        this.lista = new ArrayList<>();
    
}  

    public void adicionarItem(String nome, double preco, int quantidade){
        lista.add(new Item(nome, preco, quantidade));

    }


public static void removerItem(String nome) {
    Item itemRemover = null;
    for (Item item : lista) {
        if (item.getNome().equals(nome)) {
            itemRemover = item;
            break;
        }
    }

    if (itemRemover != null) {
        lista.remove(itemRemover);
        System.out.println("Item removido!");
    } else {
        System.out.println("Item não encontrado!");
    }
}

    public static double calcularValorTotal(){
        double valorTotal = 0;
        for(Item item:lista){
            valorTotal += (item.getPreco() * item.getQuantidade());
            

        }
        return valorTotal;


    }
    
    public static void exibirItens(){
        for(Item item: lista){
        
            System.out.print("Item: " + item.getNome() + " " + "Preço: " + item.getPreco() + " " + "Quantidade: " + item.getQuantidade()+"\n");

        }



    }

public static void main(String args[]){
    CarrinhoCompras lista = new CarrinhoCompras();

    //Adicionando elementos na lista

    lista.adicionarItem("Escova", 11.30, 2);
    lista.adicionarItem("Xampu", 17, 2);
    lista.adicionarItem("Sabonete", 1.39, 5);
    lista.adicionarItem("Manjericão", 8.9 , 2);
    lista.adicionarItem("Sandália", 49.90, 1);
    
    //Removendo um item;
    removerItem("Xampu");

    //Vendo o valor total
    System.out.print("O valor total é: " + calcularValorTotal() + "\n");

    //Exibindo os itens
    exibirItens();

}}