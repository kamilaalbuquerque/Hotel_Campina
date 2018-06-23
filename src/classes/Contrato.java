package classes;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Contrato {

    private Hospede hospede;
    private Quarto quarto;

    public Contrato(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Contrato(Hospede h) {
        this.hospede = h;
    }

    @Override
    public String toString() {
        return "" + hospede + quarto;
    }

}
