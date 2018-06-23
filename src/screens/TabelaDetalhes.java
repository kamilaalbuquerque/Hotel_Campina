/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package screens;

import java.util.ArrayList;
import classes.Auxiliar;


/**
 *
 * @author 
Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com> 
 Matrícula: <161080448>
 */
public class TabelaDetalhes extends javax.swing.JFrame {

    int linha;
    private ArrayList<Auxiliar> ver;
    
    public TabelaDetalhes(int indice, ArrayList<Auxiliar> ver ) {
        initComponents();
        this.linha=indice;
        this.ver=ver;
        preencherTexto();
        
    }

    private TabelaDetalhes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void preencherTexto(){
        
        descricao.setText(ver.get(linha).toString());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        descricao.setBackground(new java.awt.Color(255, 255, 204));
        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane3.setViewportView(descricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descricao;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
