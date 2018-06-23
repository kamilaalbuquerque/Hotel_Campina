package classes;

import abstractt.Cardapio;
import abstractt.DeliciasDaSerra;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class LaCarte extends Cardapio implements DeliciasDaSerra{

    private String laCarte = "";
    private double valorRefeicao;
    private int prato;

    public String getLaCarte() {
        return laCarte;
    }

    public double getValorRefeicao() {
        return valorRefeicao;
    }

    public void setLaCarte(String laCarte) {
        this.laCarte = laCarte;
    }

    public void setValorRefeicao(double valorRefeicao) {
        this.valorRefeicao = valorRefeicao;
    }

    public int getPrato() {
        return prato;
    }

    public void setPrato(int prato) {
        this.prato = prato;
    }

    @Override
    public String toString() {
        if (valorRefeicao == 0) {
            return "";
        } else {
            return "-LaCarte\n" + getLaCarte()
                    + "Valor(Refeição) = " + getValorRefeicao() + "\n";
        }
    }

    @Override
    public void adicionarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
