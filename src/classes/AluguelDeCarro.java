package classes;

import abstractt.Servico_adicional;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class AluguelDeCarro extends Servico_adicional{

    private double valorServicos;
    private double valorAutomovel;
    private double valorTotal;
    private String servicos = "";

    public double getValorServicos() {
        return valorServicos;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public double getValorTotal() {

        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setValorServicos(double valorServicos) {
        this.valorServicos = valorServicos;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public void setServico(String servicos) {
        this.servicos = servicos;
    }

    public String getServico() {
        return servicos;
    }

    @Override
    public String toString() {
        if (getValorTotal() == 0) {
            return "";
        } else {
            return "---AluguelDeCarro---\n" + "Descrição do serviço\n" + getServico() + "Valor do serviço (Aluguel de carro):" + getValorTotal();
        }
    }

}
