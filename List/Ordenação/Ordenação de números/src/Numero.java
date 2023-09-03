public class Numero implements Comparable<Numero>{
    private int numero;
    public Numero(int numero){
        this.numero = numero;

    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
   

    @Override
    public int compareTo(Numero outroNumero) {
        return Integer.compare(this.numero, outroNumero.getNumero());
    }
}