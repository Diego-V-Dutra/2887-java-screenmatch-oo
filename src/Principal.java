import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme Filme = new Filme();
        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);

        Filme.setNome("O poderoso chefão");
        Filme.setAnoDeLancamento(1970);
        Filme.setDuracaoEmMinutos(180);

        Filme.exibeFichaTecnica();
        Filme.avalia(8);
        Filme.avalia(5);
        Filme.avalia(10);
       // System.out.println(meuFilme.somaDasAvaliacoes);
       // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(Filme.pegaMedia());

    }
}