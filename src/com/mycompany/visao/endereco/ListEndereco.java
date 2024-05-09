/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.endereco;

import com.mycompany.dao.DaoCidade;
import com.mycompany.dao.DaoEndereco;
import com.mycompany.dao.DaoEstado;
import com.mycompany.utilizades.DadosTemporarios;
import com.mycompany.utilizades.Formularios;
import com.mycompany.modelo.ModCidade;
import com.mycompany.modelo.ModEndereco;
import com.mycompany.visao.cidade.CadCidade;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class ListEndereco extends javax.swing.JFrame {

    /**
     * Creates new form ListEndereco
     */
    public ListEndereco() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }

    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEndereco.getModel();
            
            tableEndereco.setModel(defaultTableModel);

            DaoEndereco daoEndereco = new DaoEndereco();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEndereco.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numeroRes = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numeroRes});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEndereco.getModel();

            tableEndereco.setModel(defaultTableModel);

            DaoEndereco daoEndereco = new DaoEndereco();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEndereco.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numeroRes = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numeroRes});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorCidade(String pCidade){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEndereco.getModel();
            
            tableEndereco.setModel(defaultTableModel);

            DaoEndereco daoEndereco = new DaoEndereco();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEndereco.listarPorCidade(pCidade);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numeroRes = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numeroRes});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNomeRua(String pNomeRua){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEndereco.getModel();
            
            tableEndereco.setModel(defaultTableModel);

            DaoEndereco daoEndereco = new DaoEndereco();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEndereco.listarPorNomeRua(pNomeRua);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numeroRes = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numeroRes});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorCep(String pCep){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEndereco.getModel();
            
            tableEndereco.setModel(defaultTableModel);

            DaoEndereco daoEndereco = new DaoEndereco();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEndereco.listarPorCep(pCep);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numeroRes = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numeroRes});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNumeroResidencia(String pNumeroResidencia){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEndereco.getModel();
            
            tableEndereco.setModel(defaultTableModel);

            DaoEndereco daoEndereco = new DaoEndereco();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEndereco.listarPorNumeroResidencia(pNumeroResidencia);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numeroRes = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numeroRes});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEndereco = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de endereço");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "CIDADE", "RUA", "CEP", "NÚMERO RES." }));

        tableEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CIDADE", "RUA", "CEP", "NUMERO RES."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEnderecoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEndereco);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFiltro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(tfFiltro.getText()));
                break;
            case 2:
                listarPorCidade(tfFiltro.getText());
                break;
            case 3:
                listarPorNomeRua(tfFiltro.getText());
                break;
            case 4:
                listarPorCep(tfFiltro.getText());
                break;
            case 5:
                listarPorNumeroResidencia(tfFiltro.getText());
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tableEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEnderecoMouseClicked
        try{
            if (evt.getClickCount() == 2){
                ModEndereco modEndereco = new ModEndereco();

                modEndereco.setId(Integer.parseInt(String.valueOf(tableEndereco.getValueAt(tableEndereco.getSelectedRow(), 0))));
                modEndereco.setNomeRua(String.valueOf(tableEndereco.getValueAt(tableEndereco.getSelectedRow(), 2)));
                modEndereco.setCep(String.valueOf(tableEndereco.getValueAt(tableEndereco.getSelectedRow(), 3)));
                modEndereco.setNumeroResidencia(String.valueOf(tableEndereco.getValueAt(tableEndereco.getSelectedRow(), 4)));
                
                DaoCidade daoCidade = new DaoCidade();
                ResultSet resultSet = daoCidade.listarPorNome(String.valueOf(tableEndereco.getValueAt(tableEndereco.getSelectedRow(), 1)));

                int idEstado = -1;
                while(resultSet.next())
                    idEstado = resultSet.getInt("ID");

                modEndereco.setIdCidade(idEstado);
                
                DadosTemporarios.tempObject = (ModEndereco) modEndereco;

                CadEndereco cadEndereco = new CadEndereco();
                cadEndereco.setVisible(true);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_tableEnderecoMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.listEndereco = null;
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableEndereco;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
