
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

    public void obterDescricoesTarefas() {
        if (lista.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            for (Tarefa tarefa : lista) {
                System.out.println("Descrição da tarefa: " + tarefa.getDescricao());
            }
        }
    }




    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
