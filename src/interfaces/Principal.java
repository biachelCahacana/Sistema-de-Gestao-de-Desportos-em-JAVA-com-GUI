/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import generatedPackages.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bebochel
 */
public class Principal extends javax.swing.JFrame {

    private final String url = "jdbc:postgresql://localhost/projectodb";
    private final String user = "postgres";
    private final String password = "Elizabeth1995";

    public Principal() {
        initComponents();
    }
    

    //Procedimento que preenche a tabela
    public void fillTable() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM desporto order by iddesporto";
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(query);
            DefaultTableModel tblModelClean;
            tblModelClean = (DefaultTableModel) jTable1.getModel();
            tblModelClean.getDataVector().removeAllElements();
            tblModelClean.fireTableDataChanged();
            while (res.next()) {
                String iddesporto = String.valueOf(res.getInt("iddesporto"));
                String nomedesporto = String.valueOf(res.getString("nomedesporto"));
                String descricaodesporto = String.valueOf(res.getString("descricaodesporto"));
                String paisorigem = String.valueOf(res.getString("paisorigem"));
                String qdeAtletas = String.valueOf(res.getString("qdeAtletas"));
                String registador = String.valueOf(res.getString("registador"));
                String tbData[] = {iddesporto, nomedesporto, descricaodesporto, paisorigem, qdeAtletas, registador};
                DefaultTableModel tblModel;
                tblModel = (DefaultTableModel) jTable1.getModel();
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    }

    //Procedimento que limpa os campos a serem preenchidos
    public void clear() {
        jSpinnerIdDesporto.setValue(0);
        jTextFieldNomeDesporto.setText("");
        jTextFieldDescricaoDesporto.setText("");
        jTextFieldPaisOrigem.setText("");
        jSpinnerQuantidadeAtletas.setValue(0);
        jTextFieldNomeRegistador.setText("");
    }
    
    public void clearMessage(){
        jLabelStatus.setBorder(null);
        jLabelStatus.setOpaque(false);
        jLabelStatus.setText("");
    }

    //Procedimento com as propriedades padrão dos alertas
    public void alertStyle(String fmessage, boolean fstatus) {
        Border border;
        jLabelStatus.setOpaque(true);
        
        
        
        if (fstatus) {
                border = BorderFactory.createLineBorder(new Color(195,230,203), 3);
                jLabelStatus.setBorder(border);
                jLabelStatus.setForeground(new Color(21,87,36));
                jLabelStatus.setBackground(new Color(212, 237, 218));
                jLabelStatus.setText(fmessage);
        }
        if (!fstatus) {
                border = BorderFactory.createLineBorder(new Color(245,198,203), 3);
                jLabelStatus.setBorder(border);
                jLabelStatus.setForeground(new Color(114,28,36));
                jLabelStatus.setBackground(new Color(248, 215, 218));
                jLabelStatus.setText(fmessage);
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNomeRegistador = new javax.swing.JTextField();
        jTextFieldPaisOrigem = new javax.swing.JTextField();
        jSpinnerQuantidadeAtletas = new javax.swing.JSpinner();
        jTextFieldDescricaoDesporto = new javax.swing.JTextField();
        jTextFieldNomeDesporto = new javax.swing.JTextField();
        jSpinnerIdDesporto = new javax.swing.JSpinner();
        btnGuardarNovo = new javax.swing.JButton();
        btnDeleteSport = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFormClean = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 197, 217));

        jTabbedPane1.setBackground(new java.awt.Color(102, 197, 217));

        jPanel1.setBackground(new java.awt.Color(102, 197, 217));

        jLabel3.setText("Identificador da Modalidade");

        jLabel2.setText("Nome da Modalidade");

        jLabel4.setText("Descrição da Modalidade");

        jLabel6.setText("País de Origem");

        jLabel5.setText("Atletas por Equipe");

        jLabel10.setText("Nome do Registador");

        jTextFieldPaisOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaisOrigemActionPerformed(evt);
            }
        });

        jTextFieldNomeDesporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDesportoActionPerformed(evt);
            }
        });

        btnGuardarNovo.setBackground(new java.awt.Color(40, 167, 69));
        btnGuardarNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarNovo.setText("Guardar Desporto");
        btnGuardarNovo.setBorder(null);
        btnGuardarNovo.setBorderPainted(false);
        btnGuardarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNovoActionPerformed(evt);
            }
        });

        btnDeleteSport.setBackground(new java.awt.Color(255, 193, 7));
        btnDeleteSport.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSport.setText("Eliminar Desporto");
        btnDeleteSport.setBorder(null);
        btnDeleteSport.setBorderPainted(false);
        btnDeleteSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSportActionPerformed(evt);
            }
        });

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus.setText(" ");

        btnUpdate.setBackground(new java.awt.Color(0, 123, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Editar Desporto");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id do Desporto", "Nome do Desporto", "Descrição", "País de Origem", "Qde Atletas", "Registador"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setName(""); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnFormClean.setBackground(new java.awt.Color(108, 117, 125));
        btnFormClean.setForeground(new java.awt.Color(255, 255, 255));
        btnFormClean.setText("Limpar Formulário");
        btnFormClean.setBorder(null);
        btnFormClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormCleanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE CADASTRO DE DESPORTOS");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Copyright © 2022, Sistemas Cahacana. Todos os direitos reservados.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerIdDesporto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNomeDesporto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDescricaoDesporto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerQuantidadeAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNomeRegistador, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFormClean, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteSport, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerIdDesporto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeDesporto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDescricaoDesporto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerQuantidadeAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeRegistador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteSport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFormClean, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(291, 291, 291))
        );

        jTabbedPane1.addTab("SISTEMA DE CADASTRO DE DESPORTOS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormCleanActionPerformed
        // TODO add your handling code here:
        clear();
        clearMessage();
    }//GEN-LAST:event_btnFormCleanActionPerformed

    //Procedimento baseado no evento clicar do mouse para mostrar no formulário de entrada os dados apresentados na tabela para proceder a edição
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jSpinnerIdDesporto.setValue(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
        jTextFieldNomeDesporto.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextFieldDescricaoDesporto.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextFieldPaisOrigem.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jSpinnerQuantidadeAtletas.setValue(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString()));
        jTextFieldNomeRegistador.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //Procedimento para Atualizar os desportos já guardados
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (jTable1.getSelectedRowCount() == 1) {

                Connection conn = null;
                conn = DriverManager.getConnection(url, user, password);

                PreparedStatement statement = null;
                Desporto desporto = new Desporto();

                desporto.setIdDesporto((Integer) jSpinnerIdDesporto.getValue());
                desporto.setNomeDesporto(jTextFieldNomeDesporto.getText());
                desporto.setDescricaoDesporto(jTextFieldDescricaoDesporto.getText());
                desporto.setPaisOrigem(jTextFieldPaisOrigem.getText());
                desporto.setQdeAtletas((Integer) jSpinnerQuantidadeAtletas.getValue());
                desporto.setRegistador(jTextFieldNomeRegistador.getText());

                String query = "UPDATE desporto SET nomedesporto= ? , descricaodesporto= ? , paisorigem= ? , qdeatletas= ? , registador=? WHERE iddesporto = ?";
                statement = conn.prepareStatement(query);

                statement.setString(1, desporto.getNomeDesporto());
                statement.setString(2, desporto.getDescricaoDesporto());
                statement.setString(3, desporto.getPaisOrigem());
                statement.setInt(4, desporto.getQdeAtletas());
                statement.setString(5, desporto.getRegistador());
                statement.setInt(6, desporto.getIdDesporto());
                statement.executeUpdate();
                conn.close();
                alertStyle("DESPORTO EDITADO COM SUCESSO!",true);
            } else {
                System.out.println(jTable1.getRowCount());
                if (jTable1.getRowCount() == 0) {
                    alertStyle("A TABELA ESTÁ VAZIA!",false);
                } else {
                    alertStyle("SELECIONE APENAS UMA LINHA!",false);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        } finally {
            clear();
            fillTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    //Procedimento para deletar Desportos da Lista
    private void btnDeleteSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSportActionPerformed
        // TODO add your handling code here:
        try {
            if (jTable1.getSelectedRowCount() == 1) {
                int iddesporto = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
                tbModel.removeRow(jTable1.getSelectedRow());

                Connection conn = null;
                conn = DriverManager.getConnection(url, user, password);

                PreparedStatement statement = null;
                String query = "DELETE FROM desporto WHERE iddesporto=?";
                statement = conn.prepareStatement(query);
                statement.setInt(1, iddesporto);
                statement.execute();
                conn.close();
                alertStyle("DESPORTO ELIMINADO COM SUCESSO!",true);
            } else {
                System.out.println(jTable1.getRowCount());
                if (jTable1.getRowCount() == 0) {
                    alertStyle("A TABELA ESTÁ VAZIA!",false);
                } else {
                    alertStyle("SELECIONE APENAS UMA LINHA!",false);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        } finally {
            clear();
            fillTable();
        }

    }//GEN-LAST:event_btnDeleteSportActionPerformed

    //Procedimento para guardar novos desportos
    private void btnGuardarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNovoActionPerformed
        // TODO add your handling code here:

        try {
            Desporto desporto = new Desporto();

            Connection conn = null;
            conn = DriverManager.getConnection(url, user, password);

            desporto.setIdDesporto((Integer) jSpinnerIdDesporto.getValue());
            desporto.setNomeDesporto(jTextFieldNomeDesporto.getText());
            desporto.setDescricaoDesporto(jTextFieldDescricaoDesporto.getText());
            desporto.setPaisOrigem(jTextFieldPaisOrigem.getText());
            desporto.setQdeAtletas((Integer) jSpinnerQuantidadeAtletas.getValue());
            desporto.setRegistador(jTextFieldNomeRegistador.getText());

            String query = "INSERT INTO desporto(iddesporto, nomedesporto, descricaodesporto, paisorigem, qdeatletas, registador) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, desporto.getIdDesporto());
            statement.setString(2, desporto.getNomeDesporto());
            statement.setString(3, desporto.getDescricaoDesporto());
            statement.setString(4, desporto.getPaisOrigem());
            statement.setInt(5, desporto.getQdeAtletas());
            statement.setString(6, desporto.getRegistador());
            statement.execute();

            conn.close();
            alertStyle("DESPORTO ADICIONADO COM SUCESSO!",true);

        } catch (SQLException e) {
            if (e.getErrorCode() == 0) {
                alertStyle("ESSE IDENTIFICADOR DA MODALIDADE JÁ FOI USADO!",false);
            } else {
                alertStyle("ERRO! VERIFIQUE OS DADOS POR FAVOR!",false);
            }
            System.out.println(e.getErrorCode());
        } finally {
            clear();
            fillTable();
        }

        // new Principal().connect();
    }//GEN-LAST:event_btnGuardarNovoActionPerformed

    private void jTextFieldNomeDesportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDesportoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDesportoActionPerformed

    private void jTextFieldPaisOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaisOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaisOrigemActionPerformed

    //Função Principal
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Principal novaTela = new Principal();
                novaTela.fillTable();
                novaTela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteSport;
    private javax.swing.JButton btnFormClean;
    private javax.swing.JButton btnGuardarNovo;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerIdDesporto;
    private javax.swing.JSpinner jSpinnerQuantidadeAtletas;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDescricaoDesporto;
    private javax.swing.JTextField jTextFieldNomeDesporto;
    private javax.swing.JTextField jTextFieldNomeRegistador;
    private javax.swing.JTextField jTextFieldPaisOrigem;
    // End of variables declaration//GEN-END:variables
}
