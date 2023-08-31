
import java.util.ArrayList;
import java.util.List;


public class ListaTarefa {
    private List<Tarefa> lista;
    
    public ListaTarefa() {
        lista = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }
    public int obterNumeroTotalTarefas(){
        return lista.size();
    }

    public




    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
