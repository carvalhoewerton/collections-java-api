import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private String nome;
    private int telefone;
    private static Map<String, Integer> agenda;
    
    public AgendaContatos(){
        this.agenda = new HashMap<>();
    }

    public static void adicionarContato(String nome, int telefone){
        agenda.put(nome, telefone);
    }

    public static void removerContato(String nome){
        Map<String, Integer> deletar = null;
        if(!agenda.isEmpty()){
           agenda.remove(nome);
        }

    }

    public static void exibirContatos(){
        System.out.print(agenda + "\n");
    }

    public static Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if(!agenda.isEmpty()){
            numero = agenda.get(nome);

        }
    return numero;
    }
    public static void main(String args[]){
        AgendaContatos agenda = new AgendaContatos();

        adicionarContato("joao", 15);
        adicionarContato("Maria", 12);
        adicionarContato("Julio", 188);
        adicionarContato("Marcos", 190);

        removerContato("joao");
        int contato = pesquisarPorNome("Marcos");
        exibirContatos();
        System.out.print(contato);


    }
}
