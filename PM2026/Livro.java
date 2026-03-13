
import java.io.IO;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private List<Integer> avaliacoes;
    

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.avaliacoes = new ArrayList<>();

    }

    public void adicionarAvaliacao(int estrelas) {
        if (estrelas < 0 || estrelas > 5) {
            IO.println("Avaliação deve ser entre 0 e 5 estrelas.");
        } else {
           avaliacoes.add(estrelas);
        }
    }
    public String classificar() {
        if (numeroPaginas <= 90) {
            return "Curto";
        }else if (numeroPaginas <= 200) {
            return "Médio";
        } else {
            return "Longo";
        }
    }
    public double calcularMedia() {  
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }
        int soma = 0;
        for (int estrelas : avaliacoes) {
            soma += estrelas;
        }
        return (double) soma / avaliacoes.size();
    }
    
}