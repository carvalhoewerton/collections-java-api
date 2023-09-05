import java.util.HashSet;
import java.util.Set;

public class AgendaContato{
    private static Set<Contato> contatos;

    public AgendaContato() {
        this.contatos = new HashSet<>();
    }
    
    public static void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public static void exibirContatos(){
        for(Contato c: contatos){
            System.out.print("Nome: " + c.getNome() + " Número : " + c.getNumero() + "\n");
        }
            

            
        }

    public static Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> porNome = new HashSet<>();
        for(Contato c: contatos){
            if(c.getNome().startsWith(nome)){
                porNome.add(c);
            }
        } return porNome;

    }
    public static Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato Atualizado = null;
        for(Contato c: contatos){
            if(c.getNome().equals(nome)){
                c.setNumero(novoNumero);
                Atualizado = c;
            }
        } return Atualizado;



    }
        public static void main(String args[]){
            AgendaContato contatos = new AgendaContato();

        adicionarContato("Maria", 8493);
        adicionarContato("Maria Dark", 8494);
        adicionarContato("Ana", 8496);
        adicionarContato("Pedro", 8497);
        adicionarContato("Luiza", 84977);
        adicionarContato("Carlos", 84988);
        adicionarContato("Mariana", 84900);
        adicionarContato("Paulo", 849);

        exibirContatos();
        Set<Contato> pesquisa = pesquisarPorNome("Maria");
        System.out.print("Resultado\n");
        for(Contato c: pesquisa){
            System.out.print("Nome e contato: " + c.getNome() + " " + c.getNumero() + "\n");
        }



        }


    }
