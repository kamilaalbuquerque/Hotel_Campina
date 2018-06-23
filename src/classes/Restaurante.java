package classes;

import abstractt.Servico_adicional;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Restaurante extends Servico_adicional{

    private Self_service ss = new Self_service();
    private LaCarte lc = new LaCarte();
    private Drinks d = new Drinks();
    private Sobremesas s = new Sobremesas();
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public Self_service getSs() {
        return ss;
    }

    public void setSs(Self_service ss) {
        this.ss = ss;
    }

    public LaCarte getLc() {
        return lc;
    }

    public void setLc(LaCarte lc) {
        this.lc = lc;
    }

    public Drinks getD() {
        return d;
    }

    public void setD(Drinks d) {
        this.d = d;
    }

    public Sobremesas getS() {
        return s;
    }

    public void setS(Sobremesas s) {
        this.s = s;
    }

    public void setValorTotal() {
        this.valorTotal = getSs().getValorService() + getLc().getValorRefeicao() + getD().getValorBebida() + getS().getValorSobremesa();
    }

    @Override
    public String toString() {
        if (getValorTotal() == 0) {
            return "";
        } else {
            return "---Restaurante---\n" + getSs().toString() + getLc().toString() + getD().toString() + getS().toString() + "\nValor total(restaurante)= " + getValorTotal() + "\n";
        }
    }

}
