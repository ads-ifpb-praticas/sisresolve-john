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
public class Cliente {
    
    private final String cpf;
    private String nome;
    private String sobrenome;
    private String bairro;
    private String referencia;
    private String telefone;
    private String email;
    private int positivo;
    private int negativo;
    
    public Cliente(String cpf, String nome, String sobrenome, String bairro, String referencia, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.bairro = bairro;
        this.referencia = referencia;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + ", bairro=" + bairro + ", referencia=" + referencia + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}
