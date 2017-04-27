/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sites.sisresolve.modelo;

import java.time.LocalDate;

/**
 *
 * @author john
 */
public class Trabalho {
    
    private static int qtdeTrabalho;
    private int id;
    private LocalDate inicio;
    private LocalDate fim;
    private Cliente cli;
    private Servidor ser;
    private int situacao;
    private double valor;

    public Trabalho(int id, LocalDate inicio, LocalDate fim, Cliente cli, Servidor ser, int situacao, double valor) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.cli = cli;
        this.ser = ser;
        this.situacao = situacao;
        this.valor = valor;
    }
    
    public Trabalho(LocalDate inicio, LocalDate fim, Cliente cli, Servidor ser){
        this.id = ++qtdeTrabalho;
        this.inicio = inicio;
        this.fim = fim;
        this.cli = cli;
        this.ser = ser;
        this.situacao = 0;
    }

    public static int getQtdeTrabalho() {
        return qtdeTrabalho;
    }

    public static void setQtdeTrabalho(int qtdeTrabalho) {
        Trabalho.qtdeTrabalho = qtdeTrabalho;
    }

    public int getId() {
        return id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Servidor getSer() {
        return ser;
    }

    public void setSer(Servidor ser) {
        this.ser = ser;
    }
    
    public int getSituacao(){
        return this.situacao;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Trabalho{" + "id=" + id + ", inicio=" + inicio + ", fim=" + fim + ", cli=" + cli + ", ser=" + ser + '}';
    }
    
}
