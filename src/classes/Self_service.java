package classes;

import abstractt.DeliciasDaSerra;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Self_service implements DeliciasDaSerra {

    private double self_service;
    private double valorService;
    private String kg;

    public double getSelf_service() {
        return self_service;
    }

    public double getValorService() {
        return valorService;
    }

    public void setSelf_service(double self_service) {
        this.self_service = self_service;
    }

    public void setValorService(double valorService) {
        this.valorService = valorService;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        if (valorService == 0) {
            return "";
        } else {
            return "-Self-service\n" + getKg() + "Valor(Self-service) = " + getValorService() + "\n";
        }
    }

    @Override
    public void adicionarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
