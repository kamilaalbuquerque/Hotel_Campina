package classes;

import abstractt.Servico_adicional;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Babysitter extends Servico_adicional{

    private int tempo;
    private double valorBabysitter = 0;
    private int noturno = 0;
    private int diurno = 0;
    private String servicoBaby = "";

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getValorTotal() {
        return valorBabysitter;
    }

    public void setValorTotal(double valor) {
        this.valorBabysitter = valor;
    }

    public int getNoturno() {
        return noturno;
    }

    public int getDiurno() {
        return diurno;
    }

    public void setNoturno(int noturno) {
        this.noturno = noturno;
    }

    public void setDiurno(int diurno) {
        this.diurno = diurno;
    }

    public String getServicoBaby() {
        return servicoBaby;
    }

    public void setServicoBaby(String servicoBaby) {
        this.servicoBaby = servicoBaby;
    }

    @Override
    public String toString() {
        if (valorBabysitter == 0) {
            return "";
        } else {
            return "---Babysitter---\n" + getServicoBaby() + "Valor do serviço(Babysitter):" + getValorTotal();
        }
    }
}
