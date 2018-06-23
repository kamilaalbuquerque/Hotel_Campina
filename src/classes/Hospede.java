/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Hospede {

    private String nome, endereco, cpf, credito, telefone, nomecartao, codigos, tipoCartao, tarifacao, email, formataIn, formataOut, formataNas, status;
    private int mes, ano;
    private double emAlta;
    private Date entrada, saida, nascimento;
    private static int i = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomecartao() {
        return nomecartao;
    }

    public void setNomecartao(String nomecartao) {
        this.nomecartao = nomecartao;
    }

    public String getCodigos() {
        return codigos;
    }

    public void setCodigos(String codigos) {
        this.codigos = codigos;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int aI) {
        i = aI;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getEmAlta() {
        return emAlta;
    }

    public void setEmAlta(double emAlta) {
        this.emAlta = emAlta;
    }

    public String getTarifacao() {
        return tarifacao;
    }

    public void setTarifacao(String tarifacao) {
        this.tarifacao = tarifacao;
    }

    public String getFormataOut() {
        return formataOut;
    }

    public void setFormataOut(String formataOut) {
        this.formataOut = formataOut;
    }

    public String getFormataIn() {
        return formataIn;
    }

    public void setFormataIn(String formataIn) {
        this.formataIn = formataIn;
    }

    public String getFormataNas() {
        return formataNas;
    }

    public void setFormataNas(String formataNas) {
        this.formataNas = formataNas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contrato " + i++ + "\n" + getTarifacao() + "\n" + "Nome: " + getNome() + "\nEndereco:" + getEndereco() + "\nCpf:" + getCpf() + "\nTelefone:" + getTelefone() + "\nEntrada: "
                + getFormataIn() + "\nSaida: " + getFormataOut() + "\nNascimento: " + getFormataNas() + "\nEmail: " + getEmail() + "\nCartão de credito\nNumero do cartão: " + getCredito()
                + "\nTitular do cartao: " + getNomecartao() + "\nCodigo: " + getCodigos() + "\nTipoCartao: " + getTipoCartao() + "\nValidade: " + getMes() + "/" + getAno();
    }

}
