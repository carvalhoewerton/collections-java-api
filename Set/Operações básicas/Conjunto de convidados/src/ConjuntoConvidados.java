import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
   private static Set<Convidado> convidados;

public ConjuntoConvidados() {
    this.convidados = new HashSet<>();
}

public static void adicionarConvidado(String nome, int codigoConvite){
    convidados.add(new Convidado(nome, codigoConvite));
}

public static void removerConvidadoPorCodigoConvite(int codigoConvite){

    Convidado apagar = null;
    if(!convidados.isEmpty()){
        for(Convidado convidados : convidados){
            if(convidados.getCodigoConvite() == codigoConvite){
                apagar = convidados;
                break;
       

}}
   if(apagar != null){
    convidados.remove(apagar);
    System.out.print("Convidado removido!\n");
    
   }else{
    System.out.print("Convidado não encontrado!\n");
   }


}}
public static int contarConvidados(){
    int n = convidados.size();
    return n;
}

public static void exibirConvidados(){
    for(Convidado c : convidados){
        System.out.print("Nome do convidado: " + c.getNome() + " Id do convidado: " + c.getCodigoConvite() + "\n");
    }

    }

    public static void main(String args[]){
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        //Adicionando elementos
        
        adicionarConvidado("Amanda", 123343);
        adicionarConvidado("Carlos", 3234434);
        adicionarConvidado("João", 56789);
        adicionarConvidado("Laura", 23232323);
        adicionarConvidado("Andrei", 2333333);

        
        removerConvidadoPorCodigoConvite(56789);
        int numero = contarConvidados();
        System.out.print("O número total de convidados é: " + numero + "\n");
        exibirConvidados();



    


   


}




}
