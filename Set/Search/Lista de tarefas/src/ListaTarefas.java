import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private static Set<Tarefa> lista;

    public ListaTarefas() {
        this.lista = new HashSet<>();
    }
    
    public static void adicionarTarefa(String descricao, boolean concluido){
        lista.add(new Tarefa(descricao, concluido));
    }
    public static void removerTarefa(String descricao){
        Tarefa remover = null;
        if(!lista.isEmpty()){
             for(Tarefa t:lista){
            if(t.getDescricao().equals(descricao)){
                remover = t;
                break;
            }
        }

        }
       if(remover != null){
        lista.remove(remover);
        System.out.print("Tarefa apagada!\n");
       }else{
        System.out.print("Tarefa não encontrada!\n");
       }

    }
    public static void exibirTarefas(){
        for(Tarefa t: lista){
            System.out.print("Descrição da tarefa: " + t.getDescricao() + "\n");
        }




    }

    public static int contarTarefa(){
        int soma = lista.size();
        return soma;
    }
    public static Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidos = new HashSet<>();
        for(Tarefa t:lista){
            if(t.isConcluido()){
                concluidos.add(t);
            }
        }
        return concluidos;
    }
    public static Set<Tarefa> obeterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        for(Tarefa t:lista){
            if(!t.isConcluido()){
                pendentes.add(t);
            }
        }
        return pendentes;

    }
    
    public static void marcarTarefaConcluida(String descricao){
        for(Tarefa t:lista){
            if(t.getDescricao().equals(descricao)){
                t.setConcluido(t.isConcluido());


            }
        }

    }
    public static void marcarTarefaPendente(String descricao){
        for(Tarefa t:lista){
            if(t.getDescricao().equals(descricao)){
                t.setConcluido(!t.isConcluido());


            }
        }

    }
    public static void limparListaTarefas(){
        lista.clear();
    }
    public static void main(String args[]){
        ListaTarefas lista = new ListaTarefas();
        adicionarTarefa("Estudar java", false);
        adicionarTarefa("Ir pra faculdade", true);
        adicionarTarefa("Assistir um filme", true);
        adicionarTarefa("Estudar C++", false);
        removerTarefa("Estudar C++");
        exibirTarefas();
        marcarTarefaConcluida("Assistir um filme");
        marcarTarefaPendente("Ir para faculdade");
        Set<Tarefa> con = obterTarefasConcluidas();
        Set<Tarefa> pen = obeterTarefasPendentes();
        for(Tarefa t:con){
            System.out.print(t.getDescricao() + "\n");
        }
        for(Tarefa t:pen){
            System.out.print(t.getDescricao() + "\n");
        }
        
        




    }








}
