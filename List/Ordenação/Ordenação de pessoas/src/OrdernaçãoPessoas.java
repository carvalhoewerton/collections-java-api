import java.util.ArrayList;
import java.util.List;

public class OrdernaçãoPessoas {
    static List<Pessoa> pessoas;

    OrdernaçãoPessoas(){
        this.pessoas = new ArrayList<>();

    }
    public static void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));

    }

    



}
