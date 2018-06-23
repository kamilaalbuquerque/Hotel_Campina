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

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class TelaFechados extends javax.swing.JFrame {

     public ArrayList<Auxiliar> fechados = new ArrayList();
     private Menu menu;
    /**
     * Creates new form TelaFechados
     */
    public TelaFechados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    TelaFechados(ArrayList<Auxiliar> fechado) {
        initComponents();
        this.fechados = fechado;
        preencherTabela();
       
    }
    void preencherTabela() {
        TelaAddContrato AddC= new TelaAddContrato();
        DefaultTableModel model = (DefaultTableModel) tabelacadastro.getModel();
        model.setNumRows(0);
        //fechado = r.getArm().retornarLista();
        //if(TelaCadastro.getFechados().isEmpty()){
          // JOptionPane.showMessageDialog(null, "Oh Droga");
        //}else{
        for (Auxiliar d : fechados) {
             model.addRow(new Object[]{d.getContrato().getHospede().getNome(), d.getContrato().getHospede().getCpf(),
                d.getContrato().getHospede().getTelefone(), d.getContrato().getHospede().getFormataIn(), d.getContrato().getHospede().getFormataOut(),
                d.getContrato().getQuarto().getValor(), d.getAc().getValorTotal(), d.getBs().getValorTotal(), d.getT().getValorTotal(),
                (d.getR().getD().getValorBebida() + d.getR().getS().getValorSobremesa() + d.getR().getSs().getValorService() + d.getR().getLc().getValorRefeicao()),
                d.getValorTotalHotel()});
    }}

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhees = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacadastro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        detalhees.setText("Ver detalhes do contrato");
        detalhees.setEnabled(false);
        detalhees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalheesActionPerformed(evt);
            }
        });

        tabelacadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "CheckIn", "CheckOut", "Quarto", "Aluguel De Carro", "Babysitter", "Transfer", "Restaurante", "Valor total"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(617, 617, 617)
                .addComponent(detalhees, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detalhees)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void detalheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalheesActionPerformed

        int j = tabelacadastro.getSelectedRow();

        new TabelaDetalhes(j,fechados).setVisible(true);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detalhees;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelacadastro;
    // End of variables declaration//GEN-END:variables
}