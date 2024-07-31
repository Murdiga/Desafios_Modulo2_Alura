import java.util.Calendar;
import java.util.Date;

public class Carro {

    String modelo, cor;
    int ano;

    Date data = new Date();
    Calendar calendario = Calendar.getInstance();

    int anoAtual = calendario.get(Calendar.YEAR);

    void fichaCarro() {

        System.out.println("Modelo do carro: " + modelo +
                "\n" +
                "Cor do carro: " + cor +
                "\n" +
                "Ano do Carro: " + ano +
                "\n" +
                "Idade do Carro: " + idadeCarro());

    }

    int idadeCarro() {

        return ano = anoAtual - ano;

    }

}
