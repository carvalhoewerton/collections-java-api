import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoas{
    static List<Pessoa> pessoas;
    OrdenacaoPessoas(){
        this.pessoas = new ArrayList<>();
    }
    public static void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    
    public static List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String args[]){
        
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        adicionarPessoa("Alice", 25, 1.65);
        adicionarPessoa("Bob", 30, 1.80);
        adicionarPessoa("Carol", 22, 1.70);
        adicionarPessoa("David", 35, 1.75);
        adicionarPessoa("Eve", 28, 1.68);
        adicionarPessoa("Frank", 40, 1.78);
        adicionarPessoa("Grace", 24, 1.62);

        List<Pessoa> orderIdade = ordenarPorIdade();
        System.out.print("Lista ordenada por idade:\n ");
        for(Pessoa p: orderIdade){
            System.out.print("Nome: " + p.getNome() + " Idade: " + p.getIdade() + " Altura: " + p.getAltura() + "\n");
        }

        List<Pessoa> orderAltura = pessoas.ordernarPorAltura();
        System.out.print("Lista ordenada por altura: \n");
        for(Pessoa p: orderAltura){
            System.out.print("Nome: " + p.getNome() + " Idade: " + p.getIdade() + " Altura: " + p.getAltura() + "\n");
        }





    }
}