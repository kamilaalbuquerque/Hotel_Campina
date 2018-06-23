package classes;

import abstractt.Servico_adicional;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Transfer extends  Servico_adicional{

    private String transfer = "";
    private double valorTransfer = 0;
    private int pessoas;

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    @Override
    public double getValorTotal() {
        return valorTransfer;
    }

    
    @Override
    public void setValorTotal(double valorTranfer) {

        this.valorTransfer = valorTranfer;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        if (valorTransfer == 0) {
            return "";
        } else {
            return "Transfer\n" + getTransfer() + "Valor= " + getValorTotal();
        }
    }

}
