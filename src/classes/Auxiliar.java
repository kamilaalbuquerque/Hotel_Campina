
package classes;
/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Auxiliar {

    private Contrato contrato;
    private Double valorTotalHotel;
    private Babysitter bs = new Babysitter();
    private AluguelDeCarro ac = new AluguelDeCarro();
    private Restaurante r = new Restaurante();
    private Transfer t = new Transfer();
//    private Funcionario f=new Funcionario();
    public Auxiliar(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Babysitter getBs() {
        return bs;
    }

    public void setBs(Babysitter bs) {
        this.bs = bs;
    }

    public AluguelDeCarro getAc() {
        return ac;
    }

    public void setAc(AluguelDeCarro ac) {
        this.ac = ac;
    }

    public Restaurante getR() {
        return r;
    }

    public void setR(Restaurante r) {
        this.r = r;
    }

    public Transfer getT() {
        return t;
    }

    public void setT(Transfer t) {
        this.t = t;
    }

    public Double getValorTotalHotel() {
        return valorTotalHotel;
    }

    public void setValorTotalHotel(Double valorTotalHotel) {
        this.valorTotalHotel = getBs().getValorTotal() + getAc().getValorTotal() + getContrato().getQuarto().getValor() + getR().getValorTotal() + getT().getValorTotal();
    }

    @Override
    public String toString() {
        valorTotalHotel = getBs().getValorTotal() + getAc().getValorTotal() + getContrato().getQuarto().getValor() + getR().getValorTotal() + getT().getValorTotal();
        return "---Sistema Hotel Campina Confort Premium---\nGastos do hospede\n" + getContrato() + "\n" + getBs() + "\n" + getAc() + "\n" + getR() + "\n" + getT() + "\n"  + "\nValor total a pagar= " + getValorTotalHotel();

    }

}
