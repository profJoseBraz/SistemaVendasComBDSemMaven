/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.utilidades.BancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author 10156
 */
public class DaoCidade extends BancoDeDadosMySql{
    private String sql; 
    
    public Boolean inserir(int id, int idEstado, String descricao){
        try{
            sql = "INSERT INTO CIDADE (ID, ID_ESTADO, NOME) VALUES (?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idEstado);
            getStatement().setString(3, descricao);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, String novoEstado, String novoNome){
        try{
            sql = "UPDATE CIDADE SET ID_ESTADO = ?, NOME = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(3, id);
            getStatement().setString(1, novoEstado);
            getStatement().setString(2, novoNome);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CIDADE WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                    " +
                "   CID.ID AS ID,           " +
                "   EST.NOME AS ESTADO,     " +
                "   CID.NOME AS CIDADE,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   CIDADE CID              " +
                " JOIN ESTADO EST ON        " +
                "   EST.ID = CID.ID_ESTADO  " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                    " +
                "   CID.ID AS ID,           " +
                "   EST.NOME AS ESTADO,     " +
                "   CID.NOME AS CIDADE,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   CIDADE CID              " +
                " JOIN ESTADO EST ON        " +
                "   EST.ID = CID.ID_ESTADO  " +
                " WHERE                     " +
                "   CID.ID = ?              ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                    " +
                "   CID.ID AS ID,           " +
                "   EST.NOME AS ESTADO,     " +
                "   CID.NOME AS CIDADE,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   CIDADE CID              " +
                " JOIN ESTADO EST ON        " +
                "   EST.ID = CID.ID_ESTADO  " +
                " WHERE                     " +
                "   CID.NOME LIKE ?         ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEstado(String estado){
        try{
            sql = 
                " SELECT                    " +
                "   CID.ID AS ID,           " +
                "   EST.NOME AS ESTADO,     " +
                "   CID.NOME AS CIDADE,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   CIDADE CID              " +
                " JOIN ESTADO EST ON        " +
                "   EST.ID = CID.ID_ESTADO  " +
                " WHERE                     " +
                "   EST.NOME LIKE ?         ";;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, estado + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorUf(String descricao){
        try{
            sql = 
                " SELECT                    " +
                "   CID.ID AS ID,           " +
                "   EST.NOME AS ESTADO,     " +
                "   CID.NOME AS CIDADE,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   CIDADE CID              " +
                " JOIN ESTADO EST ON        " +
                "   EST.ID = CID.ID_ESTADO  " +
                " WHERE                     " +
                "   EST.UF = ?              ";;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM CIDADE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
}
