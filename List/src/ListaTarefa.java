
import java.util.ArrayList;
import java.util.List;


public class ListaTarefa {
    private static List<Tarefa> lista;
    
    public ListaTarefa() {
        lista = new ArrayList<>();
    }
    
    
    

    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    } 
    public static void removerTarefa(String descricao) {
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
        }}

    public static int obterNumeroTotalTarefas(){
        return lista.size();
    }
   
   

    public static void obterDescricoesTarefas() {
        if (lista.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            for (Tarefa tarefa : lista) {
                System.out.println("Descrição da tarefa: " + tarefa.getDescricao());
            }
        }
    }
    


    public static void main(String[] args) throws Exception {
                ListaTarefa listaTarefas = new ListaTarefa();

        // Adicionando elementos na lista 

        lista.add(new Tarefa("Ir para faculdade"));
        lista.add(new Tarefa("Estudar para faculdade"));
        lista.add(new Tarefa("Estudar Java"));
        lista.add(new Tarefa("Assistir algum filme"));
        
        // Deletando uma tarefa da list
        removerTarefa("Estudar Java");

        // Vendo o número de tarefas;
        int numTarefas = obterNumeroTotalTarefas();
        System.out.print("O número de tarefas é " + numTarefas + "\n");
        
        //Mostrar todas as tarefas
        obterDescricoesTarefas();


    }
}




