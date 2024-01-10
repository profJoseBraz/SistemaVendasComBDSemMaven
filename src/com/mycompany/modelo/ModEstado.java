/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author 10156
 */
public class ModEstado {
    private int id;
    private int idPais;
    private String nome;
    private String uf;

    public ModEstado(int id, int idPais, String nome, String uf) {
        this.id = id;
        this.idPais = idPais;
        this.nome = nome;
        this.uf = uf;
    }

    public ModEstado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "ModEstado{" + "id=" + id + ", idPais=" + idPais + ", nome=" + nome + ", uf=" + uf + '}';
    }
}
