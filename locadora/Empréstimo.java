
package locadora;

import java.util.ArrayList;


public class Empréstimo { // olá
    private String cliente;
    private ArrayList<Mídia> midias;
    private int ano, mes, dia;
    private float valor, multa;
    private boolean devolvido;

    public Empréstimo(String cliente, ArrayList<Mídia> midias, int ano, int mes, int dia, float valor, float multa, boolean devolvido) {
        this.cliente = cliente;
        this.midias = midias;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.valor = valor;
        this.multa = multa;
        this.devolvido = devolvido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Mídia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Mídia> midias) {
        this.midias = midias;
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
