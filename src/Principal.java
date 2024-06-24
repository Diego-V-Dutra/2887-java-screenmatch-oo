import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(true);
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        filme.exibeFichaTecnica();
        System.out.println("Média da avaliação: " + filme.pegaMedia() + "\n");

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.setIncluidoNoPlano(true);
        serie.exibeFichaTecnica();
        System.out.println("Duração da serie: " + serie.getDuracaoEmMinutos() + "\n");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        filme.setIncluidoNoPlano(true);
        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("\nTempo total: " + calculadora.getTempoTotal());




    }
}