import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoas{
    List<Pessoa> pessoas;
    OrdenacaoPessoas(){
        this.pessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    void main(String args[]){
        






    }
}