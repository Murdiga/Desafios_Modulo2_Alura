public class Musica {

    String titulo, artista;
    int anoLacamento, numAvaliacoes;
    double avaliacao;

    void exibeFicha() {
        System.out.println("Titulo da Musica: " + titulo +
                "\n" +
                "Artista: " + artista +
                "\n" +
                "Ano de lançamento: " + anoLacamento +
                "\n" +
                "Avaliação da Musica: " + mediaAvaliacao());
    }

    void somaAvaliacao(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao() {
        return avaliacao /= numAvaliacoes;
    }

}
