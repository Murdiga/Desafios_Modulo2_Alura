public class Principal {
    public static void main(String[] args) throws Exception {

        Musica musica1 = new Musica();

        musica1.artista = "Post Malone";
        musica1.titulo = "Chemical";
        musica1.anoLacamento = 2024;

        musica1.somaAvaliacao(10);
        musica1.somaAvaliacao(5);
        musica1.somaAvaliacao(8);

        musica1.exibeFicha();

    }
}
