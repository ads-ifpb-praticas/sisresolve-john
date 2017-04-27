/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sites.sisresolve.modelo;

/**
 *
 * @author john
 */
public enum Servico {
    
    ELETRICA("Eletrica",0,0),
    HIDRAULICA("Hidraulica",0,0),
    PINTURA("Pintura",0,0),
    ALVENARIA("Alvenaria",0,0),
    REPAROS("Reparos",0,0);
    
    private final String descricao;
    private int positivo;
    private int negativo;

    private Servico(String descricao, int positivo, int negativo) {
        this.descricao = descricao;
        this.positivo = positivo;
        this.negativo = negativo;
    }
    
    public void positivar(){
        this.positivo++;
    }
    
    public void negaticar(){
        this.negativo++;
    }
    
    public int getPositivo(){
        return this.positivo;
    }
    
    public int getNegativo(){
        return this.negativo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
}
