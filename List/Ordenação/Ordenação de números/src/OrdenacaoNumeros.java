import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoNumeros {
    static List<Numero> numeros;
    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();

    }   
    
    public static void adicionarNumero(int numero){
        numeros.add(new Numero(numero));
    }
    
    public static List<Numero> ordenarAscendente(){
        List<Numero> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente, new Ordenar());
        return ascendente;
    }

    public static List<Numero> ordenarDescendente(){
        List<Numero> descendente = new ArrayList<>(numeros);
        Collections.sort(descendente, Collections.reverseOrder(new Ordenar()));
        return descendente;
    }
   

    public static void main(String args[]){
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        adicionarNumero(11);
        adicionarNumero(543345);
        adicionarNumero(2);
        adicionarNumero(14);
        adicionarNumero(34);
        adicionarNumero(45);
        

        System.out.print("Numeros ordenados em ordem crescente:\n");
        List<Numero> ordenar = ordenarAscendente();
        for(Numero numero:ordenar){
            System.out.print(numero.getNumero() + "\n");
        }
        System.out.print("Numeros ordenados em ordem decrescente:\n");
        List<Numero> descendente = ordenarDescendente();
        for(Numero numero: descendente){
            System.out.print(numero.getNumero() + "\n");
        }

    }
}
