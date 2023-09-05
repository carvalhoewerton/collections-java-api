import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    private static Set<Aluno> alunos;
    public  ListaAlunos(){
        this.alunos = new HashSet<>();
    }
    
    public static void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    
    
    public static void removerAluno(Long matricula){
        Aluno del = null;
        if(!alunos.isEmpty()){
            for (Aluno a:alunos){
                if(matricula == a.getMatricula()){
                    del = a;
                }
            }
        }if(del != null){
            alunos.remove(del);
            System.out.print("Aluno removido!\n");
        }else{
            System.out.print("ALuno não encontrado!\n");
        }
    }
    public static Set<Aluno> exibirAlunosPorNome()
    {
        Set<Aluno> nome = new TreeSet<>(alunos);
        
        return nome;

    }
    public static Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> notas = new TreeSet<>(new ComparatorPorNota());
        notas.addAll(alunos);
        return notas;

    }







    public static void main(String args[]){
        ListaAlunos alunos = new ListaAlunos();

        adicionarAluno("Ylice", 1001L, 8.5);
        adicionarAluno("Bob", 1002L, 7.8);
        adicionarAluno("Carlos", 1003L, 9.2);
        adicionarAluno("Diana", 1004L, 6.7);
        adicionarAluno("Eva", 1005L, 8.9);
        adicionarAluno("Fernando", 1006L, 7.1);
        adicionarAluno("Gustavo", 1007L, 9.5);
        adicionarAluno("Helen", 1008L, 8.0);
        adicionarAluno("Igor", 1009L, 7.3);

        Set<Aluno> nome = exibirAlunosPorNome();
        for(Aluno a:nome){
            System.out.print(a.getNome() + "\n");
        }

        Set<Aluno> notas = exibirAlunosPorNota();
        for(Aluno a:notas){
            System.out.print(a.getMedia() + "\n");
        }

    }
}
