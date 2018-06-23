package screens;

import classes.Quarto;
import static classes.Quarto.setCont1;
import static classes.Quarto.setCont2;
import static classes.Quarto.setCont3;
import static classes.Quarto.setCont4;
import static classes.Quarto.setCont5;
import static classes.Quarto.setCont6;
import static classes.Quarto.setCont7;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class TelaQuartos extends javax.swing.JFrame {

    private String quarto = "";
    private String QP = "", QLS = "", QLD = "", QLT = "", QES = "", QED = "", QET = "";
    private double valor = 0, valorP = 0, valorES = 0, valorED = 0, valorET = 0, valorLS = 0, valorLT = 0, valorLD = 0, valor2 = 0;
    private String cama = "", camaLS = "", camaLD = "", camaLT = "", camaET = "", camaED = "";
    private double cLS = 0, cLD = 0, cLT = 0, cET = 0, cED = 0, vcama;
    private static int a,cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, contCama = 0;

    private final static double camatotal = 50;

    public TelaQuartos() {
        initComponents();
    }

    public void atualizar() {

        cama = camaLS + camaLD + camaLT + camaET + camaED;
        vcama = cLS + cLD + cLT + cET + cED;
        quarto = QP + QES + QED + QET + QLS + QLD + QLT + cama;
        valor = valorP + valorES + valorED + valorET + valorLS + valorLT + valorLD;
        valor2 = valor + vcama;
        valorTotal.setText(String.valueOf(valor2));

    }

    public void P() {
        P.setEnabled(false);
    }

    public void detalhesQuartos() {
        if (P.isSelected()) {

            QP = "PRESIDENCIAL " + cont1 + " quarto(s)\n";

        } else {

            QP = "";

        }
        if (LS.isSelected()) {
            QuantLS.setEnabled(true);
            //  LScama.setEnabled(true);
            QLS = "LUXO SIMPLES " + cont2 + " quarto(s)\n";
            cont2++;

        } else {
            QuantLS.setEnabled(false);
            LScama.setEnabled(false);
            valorLS = 0;
            cLS = 0;
            QLS = "";
        }

        if (LD.isSelected()) {
            QuantLD.setEnabled(true);
            //LDcama.setEnabled(true);
            QLD = "LUXO DUPLO " + cont3 + " quarto(s)\n";

        } else {
            QuantLD.setEnabled(false);
            LDcama.setEnabled(false);
            valorLD = 0;
            cLD = 0;
            QLD = "";

        }
        if (LT.isSelected()) {
            QuantLT.setEnabled(true);
            // LTcama.setEnabled(true);
            QLT = "LUXO TRIPLO " + cont4 + " quarto(s)\n";

        } else {
            QuantLT.setEnabled(false);
            LTcama.setEnabled(false);
            valorLT = 0;
            cLT = 0;
            QLT = "";

        }

        if (ES.isSelected()) {
            QuantES.setEnabled(true);
            QES = "EXECUTIVO SIMPLES " + cont5 + " quarto(s)\n";

        } else {
            QuantES.setEnabled(false);
            valorES = 0;
            QES = "";

        }

        if (ED.isSelected()) {
            QuantED.setEnabled(true);

            QED = "EXECUTIVO DUPLO " + cont6 + " quarto(s)\n";

        } else {
            QuantED.setEnabled(false);
            EDcama.setEnabled(false);
            valorED = 0;
            cED = 0;
            QED = "";
        }

        if (ET.isSelected()) {
            QuantET.setEnabled(true);
            // ETcama.setEnabled(true);
            QET = "EXECUTIVO TRIPLO " + cont7 + " quarto(s)\n";

        } else {
            QuantET.setEnabled(false);
            ETcama.setEnabled(false);
            valorET = 0;
            cET = 0;
            QET = "";

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LS = new javax.swing.JCheckBox();
        P = new javax.swing.JCheckBox();
        LD = new javax.swing.JCheckBox();
        ET = new javax.swing.JCheckBox();
        ED = new javax.swing.JCheckBox();
        ES = new javax.swing.JCheckBox();
        LT = new javax.swing.JCheckBox();
        QuantP = new javax.swing.JSpinner();
        QuantLT = new javax.swing.JSpinner();
        QuantLD = new javax.swing.JSpinner();
        QuantED = new javax.swing.JSpinner();
        QuantES = new javax.swing.JSpinner();
        QuantET = new javax.swing.JSpinner();
        QuantLS = new javax.swing.JSpinner();
        LScama = new javax.swing.JCheckBox();
        EDcama = new javax.swing.JCheckBox();
        LTcama = new javax.swing.JCheckBox();
        ETcama = new javax.swing.JCheckBox();
        LDcama = new javax.swing.JCheckBox();
        resevar = new javax.swing.JButton();
        valorTotal = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(590, 360));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(722, 350));
        jPanel1.setLayout(null);

        LS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LS.setText("Luxo simples(R$ 520)");
        LS.setBorder(null);
        LS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LSStateChanged(evt);
            }
        });
        jPanel1.add(LS);
        LS.setBounds(80, 80, 190, 22);

        P.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P.setText("Presencial (R$1200)");
        P.setBorder(null);
        P.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PStateChanged(evt);
            }
        });
        jPanel1.add(P);
        P.setBounds(80, 50, 190, 22);

        LD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LD.setText("Luxo duplo(R$ 570)");
        LD.setBorder(null);
        LD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LDStateChanged(evt);
            }
        });
        jPanel1.add(LD);
        LD.setBounds(80, 110, 190, 22);

        ET.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ET.setText("Executivo triplo(R$ 440)");
        ET.setBorder(null);
        ET.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ETStateChanged(evt);
            }
        });
        jPanel1.add(ET);
        ET.setBounds(80, 230, 190, 22);

        ED.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ED.setText("Executivo duplo(R$ 385)");
        ED.setBorder(null);
        ED.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EDStateChanged(evt);
            }
        });
        jPanel1.add(ED);
        ED.setBounds(80, 200, 190, 22);

        ES.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ES.setText("Executivo simples(R$ 360)");
        ES.setBorder(null);
        ES.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ESStateChanged(evt);
            }
        });
        jPanel1.add(ES);
        ES.setBounds(80, 170, 190, 22);

        LT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LT.setText("Luxo triplo(R$ 620)");
        LT.setBorder(null);
        LT.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LTStateChanged(evt);
            }
        });
        jPanel1.add(LT);
        LT.setBounds(80, 140, 190, 22);

        QuantP.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        QuantP.setBorder(null);
        QuantP.setEnabled(false);
        QuantP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantPStateChanged(evt);
            }
        });
        jPanel1.add(QuantP);
        QuantP.setBounds(280, 50, 45, 22);

        QuantLT.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        QuantLT.setBorder(null);
        QuantLT.setEnabled(false);
        QuantLT.setMinimumSize(new java.awt.Dimension(31, 20));
        QuantLT.setPreferredSize(new java.awt.Dimension(31, 20));
        QuantLT.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantLTStateChanged(evt);
            }
        });
        jPanel1.add(QuantLT);
        QuantLT.setBounds(280, 140, 45, 22);

        QuantLD.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        QuantLD.setBorder(null);
        QuantLD.setEnabled(false);
        QuantLD.setMinimumSize(new java.awt.Dimension(31, 20));
        QuantLD.setPreferredSize(new java.awt.Dimension(31, 20));
        QuantLD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantLDStateChanged(evt);
            }
        });
        jPanel1.add(QuantLD);
        QuantLD.setBounds(280, 110, 45, 22);

        QuantED.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        QuantED.setBorder(null);
        QuantED.setEnabled(false);
        QuantED.setMinimumSize(new java.awt.Dimension(31, 20));
        QuantED.setPreferredSize(new java.awt.Dimension(31, 20));
        QuantED.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantEDStateChanged(evt);
            }
        });
        jPanel1.add(QuantED);
        QuantED.setBounds(280, 200, 45, 22);

        QuantES.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        QuantES.setBorder(null);
        QuantES.setEnabled(false);
        QuantES.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantESStateChanged(evt);
            }
        });
        jPanel1.add(QuantES);
        QuantES.setBounds(280, 170, 45, 22);

        QuantET.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        QuantET.setBorder(null);
        QuantET.setEnabled(false);
        QuantET.setMinimumSize(new java.awt.Dimension(31, 20));
        QuantET.setPreferredSize(new java.awt.Dimension(31, 20));
        QuantET.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantETStateChanged(evt);
            }
        });
        jPanel1.add(QuantET);
        QuantET.setBounds(280, 230, 45, 22);

        QuantLS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        QuantLS.setBorder(null);
        QuantLS.setEnabled(false);
        QuantLS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantLSStateChanged(evt);
            }
        });
        jPanel1.add(QuantLS);
        QuantLS.setBounds(280, 80, 45, 22);

        LScama.setText("Cama Adicional");
        LScama.setEnabled(false);
        LScama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LScamaStateChanged(evt);
            }
        });
        jPanel1.add(LScama);
        LScama.setBounds(340, 80, 137, 23);

        EDcama.setText("Cama Adicional");
        EDcama.setEnabled(false);
        EDcama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EDcamaStateChanged(evt);
            }
        });
        jPanel1.add(EDcama);
        EDcama.setBounds(340, 200, 137, 23);

        LTcama.setText("Cama Adicional");
        LTcama.setEnabled(false);
        LTcama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LTcamaStateChanged(evt);
            }
        });
        jPanel1.add(LTcama);
        LTcama.setBounds(340, 140, 137, 23);

        ETcama.setText("Cama Adicional");
        ETcama.setEnabled(false);
        ETcama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ETcamaStateChanged(evt);
            }
        });
        jPanel1.add(ETcama);
        ETcama.setBounds(340, 230, 137, 23);

        LDcama.setText("Cama Adicional");
        LDcama.setEnabled(false);
        LDcama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LDcamaStateChanged(evt);
            }
        });
        jPanel1.add(LDcama);
        LDcama.setBounds(340, 110, 137, 23);

        resevar.setBackground(new java.awt.Color(153, 255, 153));
        resevar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resevar.setText("Resevar");
        resevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resevarActionPerformed(evt);
            }
        });
        jPanel1.add(resevar);
        resevar.setBounds(460, 290, 90, 20);

        valorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        valorTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(valorTotal);
        valorTotal.setBounds(230, 270, 70, 24);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Valor:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 270, 60, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Quantidade");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 20, 80, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tipo e valor da diária");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 20, 150, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1517257867317-2.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, -10, 600, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 601, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void PStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PStateChanged
        if (P.isSelected()) {
            QuantP.setEnabled(true);

        } else {
            QuantP.setEnabled(false);
            valorP = 0;
        }
        atualizar();
    }//GEN-LAST:event_PStateChanged

    private void LSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LSStateChanged
        if (LS.isSelected()) {
            QuantLS.setEnabled(true);
            //  LScama.setEnabled(true);
            //  QLS="LUXO DUPLO " + cont2 +" quartos\n";

        } else {
            QuantLS.setEnabled(false);
            LScama.setEnabled(false);
            valorLS = 0;
            cLS = 0;
            //   QLS="";        
        }
        atualizar();
    }//GEN-LAST:event_LSStateChanged

    private void LTStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LTStateChanged
        if (LT.isSelected()) {
            QuantLT.setEnabled(true);
            // LTcama.setEnabled(true);
            //  QLT="lUXO TRIPLO " + cont3 +" quartos\n";

        } else {
            QuantLT.setEnabled(false);
            LTcama.setEnabled(false);
            valorLT = 0;
            cLT = 0;
            //    QLT="";

        }
        atualizar();
    }//GEN-LAST:event_LTStateChanged

    private void LDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LDStateChanged
        if (LD.isSelected()) {
            QuantLD.setEnabled(true);
            //LDcama.setEnabled(true);
            // QLD="LUXO DUPLO " + cont4 +" quartos\n";

        } else {
            QuantLD.setEnabled(false);
            LDcama.setEnabled(false);
            valorLD = 0;
            cLD = 0;
            //   QLD="";

        }
        atualizar();
    }//GEN-LAST:event_LDStateChanged

    private void ESStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ESStateChanged
        if (ES.isSelected()) {
            QuantES.setEnabled(true);
            //  QES="EXECUTIVO SIMPLES " + cont5 +" quartos\n";

        } else {
            QuantES.setEnabled(false);
            valorES = 0;
            //  QES="";

        }
        atualizar();
    }//GEN-LAST:event_ESStateChanged

    private void EDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EDStateChanged
        if (ED.isSelected()) {
            QuantED.setEnabled(true);

            //  QED="EXECUTIVO DUPLO " + cont6 +" quartos\n";
        } else {
            QuantED.setEnabled(false);
            EDcama.setEnabled(false);
            valorED = 0;
            cED = 0;
            QED = "";
        }
        atualizar();
    }//GEN-LAST:event_EDStateChanged

    private void ETStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ETStateChanged
        if (ET.isSelected()) {
            QuantET.setEnabled(true);
            // ETcama.setEnabled(true);
            //  QET="EXECUTIVO TRIPLO " + cont7 +" quartos\n";

        } else {
            QuantET.setEnabled(false);
            ETcama.setEnabled(false);
            valorET = 0;
            cET = 0;
            //  QET="";

        }
        atualizar();
    }//GEN-LAST:event_ETStateChanged

    private void QuantPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantPStateChanged

        int x = (int) QuantP.getValue();

        valorP = 1200 * x;
        cont1 = x;

        atualizar();
    }//GEN-LAST:event_QuantPStateChanged

    private void QuantLSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantLSStateChanged

        int x = (int) QuantLS.getValue();
        valorLS = 520 * x;
        cont2 = x;
        if (x > 0) {
            LScama.setEnabled(true);
        } else {
            LScama.setEnabled(false);
            cLS = 0;
        }
        atualizar();


    }//GEN-LAST:event_QuantLSStateChanged

    private void QuantLDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantLDStateChanged

        int x = (int) QuantLD.getValue();
        valorLD = 570 * x;
        cont3 = x;
        if (x > 0) {
            LDcama.setEnabled(true);
        } else {
            LDcama.setEnabled(false);
            cLD = 0;
        }
        atualizar();

    }//GEN-LAST:event_QuantLDStateChanged

    private void QuantLTStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantLTStateChanged
        int x = (int) QuantLT.getValue();
        valorLT = 620 * x;
        cont4 = x;
        if (x > 0) {
            LTcama.setEnabled(true);
        } else {
            LTcama.setEnabled(false);
            cLT = 0;
        }
        atualizar();
    }//GEN-LAST:event_QuantLTStateChanged

    private void QuantESStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantESStateChanged
        int x = (int) QuantES.getValue();
        cont5 = x;
        valorES = 360 * x;
        atualizar();
    }//GEN-LAST:event_QuantESStateChanged

    private void QuantEDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantEDStateChanged
        int x = (int) QuantED.getValue();
        valorED = 385 * x;
        cont6 = x;
        if (x > 0) {
            EDcama.setEnabled(true);
        } else {
            EDcama.setEnabled(false);
            cED = 0;
        }
        atualizar();
    }//GEN-LAST:event_QuantEDStateChanged

    private void QuantETStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantETStateChanged
        int x = (int) QuantET.getValue();
        valorET = 440 * x;
        cont7 = x;
        if (x > 0) {
            ETcama.setEnabled(true);
        } else {
            ETcama.setEnabled(false);
            cET = 0;
        }
        atualizar();
    }//GEN-LAST:event_QuantETStateChanged

    private void LScamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LScamaStateChanged
        if (LScama.isSelected()) {

            camaLS = "Cama adicional(LS)\n";
            cLS = 70;

        } else {

            cLS = 0;
            camaLS = "";
        }
        atualizar();

    }//GEN-LAST:event_LScamaStateChanged

    private void LDcamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LDcamaStateChanged
        if (LDcama.isSelected()) {

            camaLD = "Cama adicional(LD)\n";
            cLD = 70;

        } else {

            cLD = 0;
            camaLD = "";
        }
        atualizar();
    }//GEN-LAST:event_LDcamaStateChanged

    private void LTcamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LTcamaStateChanged
        if (LTcama.isSelected()) {

            camaLT = "Cama adicional(LT)\n";
            cLT = 70;

        } else {

            cLT = 0;
            camaLT = "";
        }
        atualizar();
    }//GEN-LAST:event_LTcamaStateChanged

    private void EDcamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EDcamaStateChanged
        if (EDcama.isSelected()) {

            camaED = "Cama adicional(ED)\n";
            cED = 70;

        } else {

            cED = 0;
            camaED = "";
        }
        atualizar();
    }//GEN-LAST:event_EDcamaStateChanged

    private void ETcamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ETcamaStateChanged
        if (ETcama.isSelected()) {

            camaET = "Cama adicional(ET)\n";
            cET = 70;

        } else {

            cET = 0;
            camaET = "";
        }
        atualizar();
    }//GEN-LAST:event_ETcamaStateChanged
 
    private void resevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resevarActionPerformed
        Quarto Q = new Quarto();
        TelaAddContrato TAC = new TelaAddContrato();

        detalhesQuartos();
        atualizar();

        Q.setValor(valor2);
        Q.setTipo(quarto);

      
        // setCont1(cont1);
        setCont2(cont2);
        setCont3(cont3);
        setCont4(cont4);
        setCont5(cont5);
        setCont6(cont6);
        setCont7(cont7);
        //setCont1(Q.getCont1() + cont1);

       
        
        TAC.Quarto(Q);
        this.dispose();
    }//GEN-LAST:event_resevarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ED;
    private javax.swing.JCheckBox EDcama;
    private javax.swing.JCheckBox ES;
    private javax.swing.JCheckBox ET;
    private javax.swing.JCheckBox ETcama;
    private javax.swing.JCheckBox LD;
    private javax.swing.JCheckBox LDcama;
    private javax.swing.JCheckBox LS;
    private javax.swing.JCheckBox LScama;
    private javax.swing.JCheckBox LT;
    private javax.swing.JCheckBox LTcama;
    private javax.swing.JCheckBox P;
    private javax.swing.JSpinner QuantED;
    private javax.swing.JSpinner QuantES;
    private javax.swing.JSpinner QuantET;
    private javax.swing.JSpinner QuantLD;
    private javax.swing.JSpinner QuantLS;
    private javax.swing.JSpinner QuantLT;
    private javax.swing.JSpinner QuantP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resevar;
    private javax.swing.JFormattedTextField valorTotal;
    // End of variables declaration//GEN-END:variables
}
