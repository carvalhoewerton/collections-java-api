import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContagemPalavras {
    private String palavra;
    private Integer contagem;
    static Map<String, Integer> palavras;
    
    @Override
    public String toString() {
        return "ContagemPalavras [palavra=" + palavra + ", contagem=" + contagem + "]";
    }

    public ContagemPalavras(){
        this.palavras = new HashMap<>();
    }

    public static void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);

    }

    public static void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
            System.out.print("Palavra removida");
        }else{
                System.out.print("Palavra não encontrada!");
            }

        }
    
    
    
    
    
    

    public static void exibirContagemPalavras(){
        System.out.print(palavras);


    }

    public static String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
          if (entry.getValue() > maiorContagem) {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente;
      }
 
      public static void main(String args[]){
        ContagemPalavras palavras = new ContagemPalavras();

        adicionarPalavra("Não", 2);
        adicionarPalavra("Triste", 39);
        adicionarPalavra("Ewerton", 12);
        adicionarPalavra("Olho", 12);
        adicionarPalavra("Então", 12 );

        removerPalavra("Então");
        exibirContagemPalavras();

        String palavra = encontrarPalavrasMaisFrequente();
        System.out.print(palavra);
        

      }
}
