package classes;

import abstractt.Cardapio;
import abstractt.DeliciasDaSerra;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Drinks extends Cardapio implements DeliciasDaSerra {

    private String drinks = "";
    private double valorBebida;
    private int bebida;
    

    public String getDrinks() {
        return drinks;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    
    @Override
    public String toString() {
        if (valorBebida == 0) {
            return "";
        } else {
            return "-Drinks\n" + drinks + "Valor(Bebidas) = " + valorBebida + "";
        }
    }

    @Override
    public void adicionarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
