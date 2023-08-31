
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
    public void removerTarefa(String descricao) {
        Tarefa tarefaARemover = null;
        
        for (Tarefa tarefa : lista) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefaARemover = tarefa;
                break;
            }
        }
        
        if (tarefaARemover != null) {
            lista.remove(tarefaARemover);
            System.out.println("Tarefa excluída");
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
