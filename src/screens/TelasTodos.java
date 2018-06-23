/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import classes.Auxiliar;
import collections.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class TelasTodos extends javax.swing.JFrame {
   private static ArrayList<Auxiliar> todos;
   private Menu menu;
   

    /**
     * Creates new form TelasTodos
     */
    public TelasTodos(ArrayList<Auxiliar> todo) {
        initComponents();
        this.todos = todo;
       
        preencherTabela();
    }

    private TelasTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelacadastro.getModel();
        model.setNumRows(0);
        for (Auxiliar d : todos) {
           model.addRow(new Object[]{d.getContrato().getHospede().getNome(), d.getContrato().getHospede().getCpf(),
                d.getContrato().getHospede().getTelefone(), d.getContrato().getHospede().getFormataIn(), d.getContrato().getHospede().getFormataOut(),
                d.getContrato().getQuarto().getValor(), d.getAc().getValorTotal(), d.getBs().getValorTotal(), d.getT().getValorTotal(),
                (d.getR().getD().getValorBebida() + d.getR().getS().getValorSobremesa() + d.getR().getSs().getValorService() + d.getR().getLc().getValorRefeicao()),
                d.getValorTotalHotel(),d.getContrato().getHospede().getStatus()});
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhees = new javax.swing.JButton();
        pesquisacpf = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacadastro = new javax.swing.JTable();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        detalhees.setText("Ver detalhes do contrato");
        detalhees.setEnabled(false);
        detalhees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalheesActionPerformed(evt);
            }
        });

        pesquisacpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            pesquisacpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tabelacadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "CheckIn", "CheckOut", "Quarto", "Aluguel De Carro", "Babysitter", "Transfer", "Restaurante", "Valor total", "Status"
            }
        ));
        tabelacadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelacadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelacadastroMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabelacadastro);

        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\kamil\\Desktop\\Start-Menu-Search-icon.png")); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pesquisacpf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detalhees, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(detalhees))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisacpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void detalheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalheesActionPerformed

        
        int j = tabelacadastro.getSelectedRow();

        new TabelaDetalhes(j,todos).setVisible(true);

        detalhees.setEnabled(false);

    }//GEN-LAST:event_detalheesActionPerformed

    private void tabelacadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacadastroMouseClicked

        int j = tabelacadastro.getSelectedRow();

        if (j != -1) {
            
            detalhees.setEnabled(true);
        }

        
    }//GEN-LAST:event_tabelacadastroMouseClicked

    private void tabelacadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacadastroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelacadastroMouseEntered

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        int j = 0, v = -1;
        if (!todos.isEmpty()) {
            String x = pesquisacpf.getText();
            if (!"".equals(pesquisacpf.getText())) {
                for (int p = 0; p < todos.size(); p++) {
                    Auxiliar m = todos.get(p);
                    if (x.equals(m.getContrato().getHospede().getCpf())) {
                        j = p;
                        v = p;
                        new TabelaDetalhes(j,todos).setVisible(true);
                        break;
                    }
                }
            }
        }
        if (v == -1) {
            JOptionPane.showMessageDialog(null, "CPF não encontrado");

        }
        pesquisacpf.setText("");
    }//GEN-LAST:event_buscarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton detalhees;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField pesquisacpf;
    private javax.swing.JTable tabelacadastro;
    // End of variables declaration//GEN-END:variables
}
