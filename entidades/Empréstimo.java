
package entidades;

import java.util.ArrayList;


public class Empréstimo { // olá
    private String cliente;
    private String midia_emprestimo;
    private int ano, mes, dia;
    private float valor, multa;
    private boolean devolvido; // devolvido eu só vou saber o valor quando eu já tiver realizado o empréstimo.

    public Empréstimo(String cliente, String midia_emprestimo, int ano, int mes, int dia, float valor, float multa) {
        this.cliente = cliente;
        this.midia_emprestimo = midia_emprestimo;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.valor = valor;
        this.multa = multa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMidia_emprestimo() {
        return midia_emprestimo;
    }

    public void setMidia_emprestimo(String midia_emprestimo) {
        this.midia_emprestimo = midia_emprestimo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
