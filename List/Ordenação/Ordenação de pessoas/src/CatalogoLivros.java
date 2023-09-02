import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{
    private static List<Livro> lista;
    
    public CatalogoLivros(){
        this.lista = new ArrayList<>();
    }

    public static void adicionarLivro(String titulo, String autor, int ano){
        lista.add(new Livro(titulo, autor, ano));
    }

    public static List<Livro> pesquisarPorAutor(String autor){
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



    public static List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> ano = new ArrayList<>();
        for(Livro livro:lista){
            if(anoInicial < livro.getAno() && livro.getAno() < anoFinal ){
                ano.add(livro);
            }

        }
        return ano;
    }

    public static boolean pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!lista.isEmpty()){
            for(Livro livro:lista){
                if(livro.getTitulo().equals(titulo)){
                   return true;
                    
                }
            }
        } return false;
    }



        public static void main(String args[]){

            CatalogoLivros lista = new CatalogoLivros();

            //Adicionando objetos à lista 

            adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
            adicionarLivro("Romeu e Julieta", "William Shakespeare", 1597);
            adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
            adicionarLivro("1984", "George Orwell", 1949);
            adicionarLivro("O Grande Gatsby", "F. Scott Fitzgerald", 1925);
            adicionarLivro("Crime e Castigo", "Fiódor Dostoiévski", 1866);
            
            List<Livro> ano = pesquisarPorIntervaloAnos(1900, 2000);
            for (Livro livro : ano) {
                System.out.println(livro.getTitulo() + ("\n"));
            }
            if(pesquisarPorTitulo("Solaris")){
                System.out.print("Livro encontrado!");
            }else{
                System.out.print("Livro não encontrado!");
            }



















        }

}