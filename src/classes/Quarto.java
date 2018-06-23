package classes;


import java.util.Scanner;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class Quarto {

    private String tipo = "";
    private double valor = 0;
    private int noite = 1;
    private final double cama = 70;
    private static int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, contCama = 0;
   

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static int getCont1() {
        return cont1;
    }

    public static void setCont1(int aCont1) {
        cont1 = aCont1;
    }

    public static int getCont2() {
        return cont2;
    }

    public static void setCont2(int aCont2) {
        cont2 = aCont2;
    }

    public static int getCont3() {
        return cont3;
    }

    public static void setCont3(int aCont3) {
        cont3 = aCont3;
    }

    public static int getCont4() {
        return cont4;
    }

    public static void setCont4(int aCont4) {
        cont4 = aCont4;
    }

    public static int getCont5() {
        return cont5;
    }

    public static void setCont5(int aCont5) {
        cont5 = aCont5;
    }

    public static int getCont6() {
        return cont6;
    }

    public static void setCont6(int aCont6) {
        cont6 = aCont6;
    }

    public static int getCont7() {
        return cont7;
    }

    public static void setCont7(int aCont7) {
        cont7 = aCont7;
    }

    public static int getContCama() {
        return contCama;
    }

    public static void setContCama(int aContCama) {
        contCama = aContCama;
    }

    public int getNoite() {
        return noite;
    }

    public void setNoite(int noite) {
        this.noite = noite;
    }

    public void presidencial() {

    }

    public void luxoSimples() {

    }

    public void luxoDuplo() {

    }

    public void luxoTriplo() {

    }

    public void executivoSimples() {

    }

    public void executivoDuplo() {

    }

    public void executivoTriplo() {

    }

    @Override
    public String toString() {
        return "\n---Quarto(s)---\n" + getTipo() + "Valor=" + getValor();
    }
}
