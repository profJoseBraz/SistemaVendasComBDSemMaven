/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author 10156
 */
public class ModPedido {
    private int id;
    private int idCliente;
    private int idProduto;
    private String dataPedido;
    private int quantidade;

    public ModPedido(int id, int idCliente, int idProduto, String dataPedido, int quantidade) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
    }

    public ModPedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ModPedido{" + "id=" + id + ", idCliente=" + idCliente + ", idProduto=" + idProduto + ", dataPedido=" + dataPedido + ", quantidade=" + quantidade + '}';
    }
}
