/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import classes.AluguelDeCarro;
import classes.Auxiliar;
import classes.Babysitter;
import classes.Contrato;
import classes.Hospede;
import classes.Quarto;
import classes.Restaurante;
import classes.Transfer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Menu {

    private ArrayList<Auxiliar> todos = new ArrayList<>();
    private ArrayList<Auxiliar> aberto = new ArrayList<>();
    private ArrayList<Auxiliar> fechado = new ArrayList<>();

    public ArrayList<Auxiliar> retornarLista() {
        return getAberto();
    }

    public void EditarContratos(int p, String nome, String end, String cpf, String cartao, String tel, String ncartao, String cood,
            String tarifacao, String email, int mess, int anoo, double emAlta, Date in, Date out, Date nas, String tipoCartao) {
        aberto.get(p).getContrato().getHospede().setNome(nome);
        aberto.get(p).getContrato().getHospede().setEndereco(end);
        aberto.get(p).getContrato().getHospede().setCpf(cpf);
        aberto.get(p).getContrato().getHospede().setCredito(cartao);
        aberto.get(p).getContrato().getHospede().setTelefone(tel);
        aberto.get(p).getContrato().getHospede().setNomecartao(ncartao);
        aberto.get(p).getContrato().getHospede().setCodigos(cood);
        aberto.get(p).getContrato().getHospede().setEmail(email);
        aberto.get(p).getContrato().getHospede().setEntrada(in);
        aberto.get(p).getContrato().getHospede().setSaida(out);
        aberto.get(p).getContrato().getHospede().setNascimento(nas);
        aberto.get(p).getContrato().getHospede().setTarifacao(tarifacao);
        aberto.get(p).getContrato().getHospede().setTipoCartao(tipoCartao);
        aberto.get(p).getContrato().getHospede().setMes(mess);
        aberto.get(p).getContrato().getHospede().setAno(anoo);
        aberto.get(p).getContrato().getHospede().setEmAlta(emAlta);

    }

    public boolean addCliente(Auxiliar c) {
        if (getAberto().add(c)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addTodosContratos(Auxiliar t) {
        if (getTodos().add(t)) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Auxiliar> getAberto() {
        return aberto;
    }

    public void setAberto(ArrayList<Auxiliar> aberto) {
        this.aberto = aberto;
    }

    public ArrayList<Auxiliar> getFechado() {
        return fechado;
    }

    public void setFechado(ArrayList<Auxiliar> fechado) {
        this.fechado = fechado;
    }

    public ArrayList<Auxiliar> getTodos() {
        return todos;
    }

    public void setTodos(ArrayList<Auxiliar> todos) {
        this.todos = todos;
    }

}
