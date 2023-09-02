import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{
    private static List<Livro> lista;
    
    public CatalogoLivros(){
        this.lista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        lista.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
         List<Livro> livrosAutor = new ArrayList<>();
        if(!lista.isEmpty()){
            for(Livro livro : lista){
                if(livro.getAutor().equals(autor)){
                    livrosAutor.add(livro);
                }
            }
        }
        return livrosAutor;


    }
}