/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.utilidades.BancoDeDadosMySql;
import static com.mycompany.utilidades.BancoDeDadosMySql.getConexao;
import static com.mycompany.utilidades.BancoDeDadosMySql.getResultado;
import static com.mycompany.utilidades.BancoDeDadosMySql.getStatement;
import static com.mycompany.utilidades.BancoDeDadosMySql.setResultado;
import static com.mycompany.utilidades.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author jose_
 */
public class DaoEndereco extends BancoDeDadosMySql{
    
    String sql;
    
    public Boolean inserir(int id, int idCidade, String nomeRua, String cep, String numeroResidencia){
        try{
            sql = "INSERT INTO ENDERECO (ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA) VALUES (?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idCidade);
            getStatement().setString(3, nomeRua);
            getStatement().setString(4, cep);
            getStatement().setString(5, numeroResidencia);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idNovaCidade, String novoNomeRua, String novoCep, String novoNumeroResidencia){
        try{
            sql = "UPDATE ENDERECO SET ID_CIDADE = ?, NOME_RUA = ?, CEP = ?, NUMERO_RESIDENCIA = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, idNovaCidade);
            getStatement().setString(2, novoNomeRua);
            getStatement().setString(3, novoCep);
            getStatement().setString(4, novoNumeroResidencia);
            getStatement().setInt(5, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM ENDERECO WHERE ID = ?";
            
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
                " SELECT                            " +
                "   EN.ID,                          " +
                "   CID.NOME AS CIDADE,             " +
                "   EN.NOME_RUA AS RUA,             " +
                "   EN.CEP AS CEP,                  " +
                "   EN.NUMERO_RESIDENCIA AS NUM_RES " +
                " FROM                              " +
                "   ENDERECO EN                     " +
                " JOIN CIDADE CID ON                " +
                "   CID.ID = EN.ID_CIDADE           " ;
            
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
                " SELECT                            " +
                "   EN.ID,                          " +
                "   CID.NOME AS CIDADE,             " +
                "   EN.NOME_RUA AS RUA,             " +
                "   EN.CEP AS CEP,                  " +
                "   EN.NUMERO_RESIDENCIA AS NUM_RES " +
                " FROM                              " +
                "   ENDERECO EN                     " +
                " JOIN CIDADE CID ON                " +
                "   CID.ID = EN.ID_CIDADE           " +
                " WHERE                             " +
                "   EN.ID = ?                       " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNomeRua(String nomeRua){
        try{
            sql = 
                " SELECT                            " +
                "   EN.ID,                          " +
                "   CID.NOME AS CIDADE,             " +
                "   EN.NOME_RUA AS RUA,             " +
                "   EN.CEP AS CEP,                  " +
                "   EN.NUMERO_RESIDENCIA AS NUM_RES " +
                " FROM                              " +
                "   ENDERECO EN                     " +
                " JOIN CIDADE CID ON                " +
                "   CID.ID = EN.ID_CIDADE           " +
                " WHERE                             " +
                "   EN.NOME_RUA LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nomeRua + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCep(String cep){
        try{
            sql = 
               " SELECT                            " +
                "   EN.ID,                          " +
                "   CID.NOME AS CIDADE,             " +
                "   EN.NOME_RUA AS RUA,             " +
                "   EN.CEP AS CEP,                  " +
                "   EN.NUMERO_RESIDENCIA AS NUM_RES " +
                " FROM                              " +
                "   ENDERECO EN                     " +
                " JOIN CIDADE CID ON                " +
                "   CID.ID = EN.ID_CIDADE           " +
                " WHERE                             " +
                "   EN.CEP LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cep + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNumeroResidencia(String numerpResidencia){
        try{
            sql = 
                " SELECT                            " +
                "   EN.ID,                          " +
                "   CID.NOME AS CIDADE,             " +
                "   EN.NOME_RUA AS RUA,             " +
                "   EN.CEP AS CEP,                  " +
                "   EN.NUMERO_RESIDENCIA AS NUM_RES " +
                " FROM                              " +
                "   ENDERECO EN                     " +
                " JOIN CIDADE CID ON                " +
                "   CID.ID = EN.ID_CIDADE           " +
                " WHERE                             " +
                "   EN.NUMERO_RESIDENCIA LIKE ?     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, numerpResidencia + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCidade(String cidade){
        try{
            sql = 
                " SELECT                            " +
                "   EN.ID,                          " +
                "   CID.NOME AS CIDADE,             " +
                "   EN.NOME_RUA AS RUA,             " +
                "   EN.CEP AS CEP,                  " +
                "   EN.NUMERO_RESIDENCIA AS NUM_RES " +
                " FROM                              " +
                "   ENDERECO EN                     " +
                " JOIN CIDADE CID ON                " +
                "   CID.ID = EN.ID_CIDADE           " +
                " WHERE                             " +
                "   CID.NOME LIKE ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cidade + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM ENDERECO";
            
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
