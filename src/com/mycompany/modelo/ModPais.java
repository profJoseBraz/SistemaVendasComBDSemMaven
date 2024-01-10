/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author jose_
 */
public class ModPais {
    private int id;
    private String nome;

    public ModPais(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public ModPais() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ModPais{" + "id=" + id + ", nome=" + nome + '}';
    }
}
