import java.util.Comparator;

public class Ordenar implements Comparator<Numero> {
    
        @Override
        public int compare(Numero n1, Numero n2) {
          return Integer.compare(n1.getNumero(), n2.getNumero());
        }
      }

  

