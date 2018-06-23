package classes;

import abstractt.Cardapio;
import abstractt.DeliciasDaSerra;



/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Sobremesas extends Cardapio implements DeliciasDaSerra {

    private String sobremesas = "";
    private double valorSobremesa;
    private int sobremesa;

    public String getSobremesas() {
        return sobremesas;
    }

    public double getValorSobremesa() {
        return valorSobremesa;
    }

    public void setSobremesas(String sobremesas) {
        this.sobremesas = sobremesas;
    }

    public void setValorSobremesa(double valorSobremesa) {
        this.valorSobremesa = valorSobremesa;
    }

    public int getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(int sobremesa) {
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        if (valorSobremesa == 0) {
            return "";
        } else {
            return "-Sobremesas\n" + sobremesas + "Valor(Sobremesa) = " + valorSobremesa + "\n";
        }
    }

    @Override
    public void adicionarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
