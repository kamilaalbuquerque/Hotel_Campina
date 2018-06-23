package screens;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.AluguelDeCarro;
import classes.Auxiliar;
import classes.Babysitter;
import classes.Contrato;
import classes.Drinks;
import classes.Hospede;
import classes.LaCarte;
import collections.Menu;
import classes.Quarto; //essa
import static classes.Quarto.setCont1;
import static classes.Quarto.setCont2;
import static classes.Quarto.setCont3;
import static classes.Quarto.setCont4;
import static classes.Quarto.setCont5;
import static classes.Quarto.setCont6;
import static classes.Quarto.setCont7;
import classes.Restaurante;
import classes.Self_service;
import classes.Sobremesas;
import classes.Transfer;

/**
 *
 * @author Aluno: Kamila da Silva Albuquerque <kamilaalbuquerque80@gmail.com>
 * Matrícula: <161080448>
 */
public class TelaAddContrato extends javax.swing.JFrame {

    private Menu menu;
    private static ArrayList<Auxiliar> aberto;
    private static ArrayList<Auxiliar> todos;
    static double valorcarro, valorbs, valortran, valorres, valorq, valors, valorS, valorLC, valorD, emAlta, l, vTH;
    static int diurno, noturno, tempo, pessoas, datacont, m;
    static String tipoS = "", tipoLc = "", tipoD = "", status,tipoc="";
    private int s,cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, contCama = 0;
    static String tipocarro = "", tipoq = "", tipot = "", tarifacao, tipoSs = "", servicoBaby = "";

    public TelaAddContrato() {
        initComponents();
        menu = new Menu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        grupoDeBotao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        cnome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Cadrastar = new javax.swing.JButton();
        cendereco = new javax.swing.JTextField();
        ccel = new javax.swing.JFormattedTextField();
        ccpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cemail = new javax.swing.JTextField();
        Nascimento = new javax.swing.JLabel();
        checkin = new com.toedter.calendar.JDateChooser();
        cnascimento = new com.toedter.calendar.JDateChooser();
        checkout = new com.toedter.calendar.JDateChooser();
        detalhees = new javax.swing.JButton();
        datavalida = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        AddQuarto = new javax.swing.JButton();
        AddCarro = new javax.swing.JButton();
        AddRestaurante = new javax.swing.JButton();
        Baby = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        editarquarto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fechar = new javax.swing.JButton();
        fechados = new javax.swing.JButton();
        todoos = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ccredito = new javax.swing.JFormattedTextField();
        codseg = new javax.swing.JFormattedTextField();
        nomecartao = new javax.swing.JTextField();
        ano = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        visa = new javax.swing.JButton();
        elo = new javax.swing.JButton();
        master = new javax.swing.JButton();
        hipercard = new javax.swing.JButton();
        validadedadata = new javax.swing.JLabel();
        validadedadata1 = new javax.swing.JLabel();
        numvalido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacadastro = new javax.swing.JTable();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1517257867317-1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(49, 31, 0, 0);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel5.setBackground(new java.awt.Color(0, 204, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("---Sistema Hotel Campina Confort Premium---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 610, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Dados do responsável");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 50, 170, 40);

        c.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c.setText("CPF:");
        getContentPane().add(c);
        c.setBounds(40, 120, 60, 15);

        cnome.setToolTipText("nome competo");
        cnome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cnome.setEnabled(false);
        getContentPane().add(cnome);
        cnome.setBounds(90, 90, 320, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 90, 70, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Celular:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 120, 90, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Endereço:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 180, 70, 20);

        Cadrastar.setBackground(new java.awt.Color(153, 255, 153));
        Cadrastar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cadrastar.setText("Cadrastar");
        Cadrastar.setEnabled(false);
        Cadrastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadrastarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadrastar);
        Cadrastar.setBounds(480, 450, 100, 22);

        cendereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cendereco.setEnabled(false);
        getContentPane().add(cendereco);
        cendereco.setBounds(110, 180, 300, 22);

        ccel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            ccel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ccel.setEnabled(false);
        ccel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(ccel);
        ccel.setBounds(290, 120, 120, 22);

        ccpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            ccpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ccpf.setEnabled(false);
        getContentPane().add(ccpf);
        ccpf.setBounds(90, 120, 120, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Check out:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 245, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Check in:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 245, 70, 10);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("E-mail:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 150, 70, 20);

        cemail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cemail.setEnabled(false);
        getContentPane().add(cemail);
        cemail.setBounds(90, 150, 320, 22);

        Nascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nascimento.setText("Nascimento:");
        getContentPane().add(Nascimento);
        Nascimento.setBounds(40, 210, 80, 20);

        checkin.setEnabled(false);
        checkin.setPreferredSize(new java.awt.Dimension(80, 20));
        getContentPane().add(checkin);
        checkin.setBounds(100, 240, 130, 22);

        cnascimento.setEnabled(false);
        cnascimento.setPreferredSize(new java.awt.Dimension(80, 20));
        getContentPane().add(cnascimento);
        cnascimento.setBounds(120, 210, 130, 22);

        checkout.setEnabled(false);
        checkout.setPreferredSize(new java.awt.Dimension(80, 20));
        getContentPane().add(checkout);
        checkout.setBounds(320, 240, 130, 22);

        detalhees.setText("Ver detalhes do contrato");
        detalhees.setEnabled(false);
        detalhees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalheesActionPerformed(evt);
            }
        });
        getContentPane().add(detalhees);
        detalhees.setBounds(270, 450, 180, 23);

        datavalida.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(datavalida);
        datavalida.setBounds(280, 220, 180, 10);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setRequestFocusEnabled(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        AddQuarto.setBackground(new java.awt.Color(255, 255, 255));
        AddQuarto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddQuarto.setText("Adicionar quarto");
        AddQuarto.setEnabled(false);
        AddQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuartoActionPerformed(evt);
            }
        });

        AddCarro.setBackground(new java.awt.Color(255, 255, 255));
        AddCarro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddCarro.setText("Contratar carro");
        AddCarro.setEnabled(false);
        AddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCarroActionPerformed(evt);
            }
        });

        AddRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        AddRestaurante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddRestaurante.setText("Restaurante");
        AddRestaurante.setEnabled(false);
        AddRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRestauranteActionPerformed(evt);
            }
        });

        Baby.setBackground(new java.awt.Color(255, 255, 255));
        Baby.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Baby.setText("Babysitter");
        Baby.setEnabled(false);
        Baby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabyActionPerformed(evt);
            }
        });

        Transfer.setBackground(new java.awt.Color(255, 255, 255));
        Transfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Transfer.setText("Transfer");
        Transfer.setEnabled(false);
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(255, 255, 255));
        editar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editar.setText("Salvar Alterações");
        editar.setEnabled(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        editarquarto.setBackground(new java.awt.Color(255, 255, 255));
        editarquarto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editarquarto.setText("Editar Quartos");
        editarquarto.setEnabled(false);
        editarquarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarquartoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarquarto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AddRestaurante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Baby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Transfer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarquarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Baby, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editar)
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        fechar.setBackground(new java.awt.Color(255, 255, 255));
        fechar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fechar.setText("Fechar contrato");
        fechar.setEnabled(false);
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        fechados.setBackground(new java.awt.Color(255, 255, 255));
        fechados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fechados.setText("Fechados");
        fechados.setEnabled(false);
        fechados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechadosActionPerformed(evt);
            }
        });

        todoos.setBackground(new java.awt.Color(255, 255, 255));
        todoos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        todoos.setText("Todos");
        todoos.setEnabled(false);
        todoos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoosActionPerformed(evt);
            }
        });

        abrir.setBackground(new java.awt.Color(255, 255, 255));
        abrir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        abrir.setText("Abrir contrato");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fechados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(todoos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(abrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(fechar)
                .addGap(18, 18, 18)
                .addComponent(fechados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(todoos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32304, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(610, 0, 250, 495);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cartão de crédito:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        ccredito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Número do cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        try {
            ccredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ccredito.setEnabled(false);
        ccredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ccreditoKeyReleased(evt);
            }
        });

        codseg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Código de segurança", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        try {
            codseg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        codseg.setToolTipText("3 ultimos numeros encontrados na parte de trá do cartão");
        codseg.setEnabled(false);

        nomecartao.setToolTipText("");
        nomecartao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nome do titular(como está gravado no cartão)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        nomecartao.setEnabled(false);

        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "18", "19", "20", "21", "22", "23", "24", "25", " ", " " }));
        ano.setEnabled(false);

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        mes.setToolTipText("");
        mes.setEnabled(false);

        visa.setBackground(new java.awt.Color(255, 255, 255));
        visa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visa.png"))); // NOI18N
        visa.setEnabled(false);

        elo.setBackground(new java.awt.Color(255, 255, 255));
        elo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cartão Elo patrocina 42ª edição do São Paulo Fashion Week.png"))); // NOI18N
        elo.setEnabled(false);

        master.setBackground(new java.awt.Color(255, 255, 255));
        master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mastercard.png"))); // NOI18N
        master.setEnabled(false);

        hipercard.setBackground(new java.awt.Color(255, 255, 255));
        hipercard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Hipercard-logo-5.png"))); // NOI18N
        hipercard.setEnabled(false);

        validadedadata.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        validadedadata1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        validadedadata1.setText("Data de validade");

        numvalido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(nomecartao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(validadedadata1)
                        .addGap(18, 18, 18)
                        .addComponent(validadedadata, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(mes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(ccredito, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(codseg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(master, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hipercard, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(numvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(numvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ccredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hipercard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(master, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(validadedadata, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validadedadata1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nomecartao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(40, 280, 520, 140);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1517257867317-2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -70, 610, 630);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("      \n                            Hotel Campina Confort Premium\n\n     O Hotel Campina Confort Premium é um resort de luxo na magnífica\n Serra da Borborema, que conta com piscina, playground, babysitter, aluguel \nde carro, transfer para João Pessoa e Campina Grande, wifi grátis em todo o \nhotel, além de oferecer o que há de melhor em cozinha com o tradicional \nrestaurante Delícias da Serra. Está há alguns quilômetros da cidade, de forma \nque seus hóspedes possam relaxar e respirar um ar puro das montanhas.\n\n      As acomodações do hotel são todas novas, equipadas com TV LCD 42'', \nsplit, frigobar, cofre. As suítes presidenciais podem comportar até 4 pessoas \nem 2 quartos separados e uma sala de jogos e home theater, ideal para \nfamílias em férias. Os demais quartos, luxo e executivo, podem acomodar 1, \n2 ou 3 pessoas no máximo, sendo o quarto luxo mais espaçoso e contando \ncom home theater. Camas extras para crianças menores de 9 anos são \npermitidas em quartos do tipo luxo e executivo single e double quando \nohóspede solicitar na reserva e de acordo com a disponibilidade de cama \nextra no período. Incluso na diária das acomodações já está o café da manhã.\n\n     Os hóspedes têm acesso gratuito ao complexo de piscinas do hotel, onde \nocorrem atividades recreativas para toda a família, bem como à academia e à \nsauna.\n\n       Além dessas comodidades, os hóspedes podem acrescentar ao seu \ncontrato outros serviços quando desejarem utilizar:\n\n      1. Aluguel de carro. Os carros a serem alugados podem ser de 2 tipos: \nluxo e executivo. Na hora de solicitar o aluguel o hóspede tem que informar \nse deseja adicionar tanque cheio e seguro de automóvel. Cada um desses \naditivos aumenta o valor do aluguel. Os hóspedes que alugarem carros terão \nem seu contrato um aditivo relativo a \"Aluguel de carro\" no valor consumido \nem quaisquer das unidades. Idealmente deve discriminar o que foi \ncontratado e a quantidade de dias.\n\n      2. Babysitter. Para os pais que desejarem descansar um pouco dos \npequenos de 2 a 9 anos, o hotel oferece serviço de babysitter 24 horas. Os \nhóspedes que contratarem esse serviço terá um aditivo em seu contrato \nreferente a \"Babysitter\" que deve indicar a quantidade de horas solicitadas e \ndestas horas, quantas são valor dobrado.\n\n       3. Restaurantes Delícias da Serra. O restaurante oferece lanches (todo o \ntempo), self-service no almoço e jantar, buffet a la carte e drinks. Os \nhóspedes que pretendem usar os restaurantes terão em seu contrato um \naditivo relativo a \"refeição\" no valor consumido em quaisquer das unidades.\n\n\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(860, 0, 490, 495);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

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
        });
        jScrollPane1.setViewportView(tabelacadastro);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 460, 1360, 230);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void zerarDados() {
        cnome.setText("");
        ccpf.setText("");
        cendereco.setText("");
        ccel.setText("");
        cemail.setText("");
        cnascimento.setDate(null);
        checkin.setDate(null);
        checkout.setDate(null);
        ccredito.setText("");
        nomecartao.setText("");
        mes.setSelectedIndex(0);
        ano.setSelectedIndex(0);
        codseg.setText("");

        valorcarro = 0;
        valorbs = 0;
        valortran = 0;
        valorres = 0;
        valorq = 0;
        valorD = 0;
        valorLC = 0;
        valorS = 0;
        valors = 0;
        valorq = 0;
        tipoq = "";
        tipoLc = "";
        tipoS = "";
        tipoSs = "";
        tipoD = "";
        tipot = "";
        tipocarro = "";
        pessoas = 0;
        servicoBaby = "";

    }

    public void desabilitarCampos() {
        cnome.setEnabled(false);
        ccpf.setEnabled(false);
        cendereco.setEnabled(false);
        ccel.setEnabled(false);
        cemail.setEnabled(false);
        cnascimento.setEnabled(false);
        checkin.setEnabled(false);
        checkout.setEnabled(false);
        ccredito.setEnabled(false);
        nomecartao.setEnabled(false);
        mes.setEnabled(false);
        ano.setEnabled(false);
        codseg.setEnabled(false);
    }

    public void habilitarCampos() {
        cnome.setEnabled(true);
        ccpf.setEnabled(true);
        cendereco.setEnabled(true);
        ccel.setEnabled(true);
        cemail.setEnabled(true);
        cnascimento.setEnabled(true);
        checkin.setEnabled(true);
        checkout.setEnabled(true);
        ccredito.setEnabled(true);
        nomecartao.setEnabled(true);
        mes.setEnabled(true);
        ano.setEnabled(true);
        codseg.setEnabled(true);
    }

    public void desabilitarBotoes() {

        AddQuarto.setEnabled(false);
        AddCarro.setEnabled(false);
        AddRestaurante.setEnabled(false);
        Baby.setEnabled(false);
        Transfer.setEnabled(false);

    }

    public void habilitarBotoes() {
        AddQuarto.setEnabled(true);
        AddCarro.setEnabled(true);
        AddRestaurante.setEnabled(true);
        Baby.setEnabled(true);
        Transfer.setEnabled(true);
    }

    private void CadrastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadrastarActionPerformed

        Hospede h = new Hospede();
        Quarto q = new Quarto();
        Contrato c1 = new Contrato(h, q);
        Babysitter bs = new Babysitter();
        AluguelDeCarro ac = new AluguelDeCarro();
        Restaurante r = new Restaurante();
        Transfer t = new Transfer();
        Auxiliar a = new Auxiliar(c1);
        TelaAluguelCarro AC = new TelaAluguelCarro();
        TelaBabySitter B = new TelaBabySitter();
        TelaRestaurante R = new TelaRestaurante();

        String nome = cnome.getText();
        String cpf = ccpf.getText();
        String end = cendereco.getText();
        String cartao = ccredito.getText();
        String tel = ccel.getText();
        String email = cemail.getText();
        Date nas = cnascimento.getDate();
        Date in = checkin.getDate();
        Date out = checkout.getDate();
        int mess = mes.getSelectedIndex();
        int anoo = ano.getSelectedIndex();
        String ncartao = nomecartao.getText();
        String cood = codseg.getText();
        

        int compare = out.compareTo(in);

        if (compare == 0) {
            datavalida.setText("*selecione datas diferentes.");
        }
        if (compare < 0) {
            datavalida.setText("*chekout menor que checkin.");
        }

        if (compare > 0) {
            datavalida.setText("");
        }

        int k = 0;

        if (mess < 6 && anoo == 1) {
            validadedadata.setText("*mês inválido");
            k = 1;
        } else {
            switch (anoo) {
                case 1:
                    anoo = 2018;
                    break;
                case 2:
                    anoo = 2019;
                    break;
                case 3:
                    anoo = 2020;
                    break;
                case 4:
                    anoo = 2021;
                    break;
                case 5:
                    anoo = 2022;
                    break;
                case 6:
                    anoo = 2023;
                    break;
                case 7:
                    anoo = 2024;
                    break;
                case 8:
                    anoo = 2025;
                    break;
                default:
                    break;
            }

            validadedadata.setText("");
        }

        h.setNome(nome);
        h.setCpf(cpf);
        h.setEndereco(end);
        h.setEmail(email);
        h.setTelefone(tel);
        h.setEntrada(in);
        h.setSaida(out);
        h.setNascimento(nas);
       
        h.setTipoCartao(tipoc);

        h.setCredito(cartao);
        h.setAno(anoo);
        h.setMes(mess);
        h.setCodigos(cood);
        h.setNomecartao(ncartao);
        h.setStatus("ABERTO");

        if (valorq == 0) {
            JOptionPane.showMessageDialog(null, "Adicione um quarto!");
        }

        if (!cnome.getText().equals("") && !ccpf.getText().equals("") && !cendereco.getText().equals("") && !ccel.getText().equals("") && !ccredito.getText().equals("")
                && mes.getSelectedIndex() != 0 && ano.getSelectedIndex() != 0 && !nomecartao.getText().equals("") && !codseg.getText().equals("")
                && valorq > 0 && !cnascimento.getDate().equals(null) && !checkin.getDate().equals(null) && !checkout.getDate().equals(null) && compare > 0 && k == 0 && s!=1) {
        
            
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        String saida = formatarData.format(checkout.getDate());
        String entrada = formatarData.format(checkin.getDate());
        String nascimento = formatarData.format(cnascimento.getDate());
            
        h.setFormataIn(entrada);
        h.setFormataOut(saida);
        h.setFormataNas(nascimento);
            
            
            datacont = (int) ((out.getTime() - in.getTime()) / 86400000L);
            m = in.getMonth();
            emAlta = 1;
            tarifacao = "";
            if (m == 0) {

                emAlta = 1.25;
                tarifacao = "*Janeiro: tarifas mais alto que o normal , acrescentado o valor de 25%\n";
            }
            if (m == 5) {

                emAlta = 1.25;
                tarifacao = "*Junho: tarifas mais alto que o normal , acrescentado o valor de 25%\n";
            }
            if (m == 11) {

                emAlta = 1.25;
                tarifacao = "*Dezembro: tarifas mais alto que o normal , acrescentado o valor de 25%\n";
            }
            h.setTarifacao(tarifacao);
            h.setEmAlta(emAlta);

            a.getAc().setValorTotal(valorcarro * emAlta); //essa
            a.getAc().setServico(tipocarro);

            a.getBs().setValorTotal(valorbs * emAlta);
            a.getBs().setServicoBaby(servicoBaby);

            a.getR().getSs().setValorService(valors * emAlta);
            a.getR().getSs().setKg(tipoSs);
            a.getR().getS().setValorSobremesa(valorS * emAlta);
            a.getR().getS().setSobremesas(tipoS);
            a.getR().getLc().setValorRefeicao(valorLC * emAlta);
            a.getR().getLc().setLaCarte(tipoLc);
            a.getR().getD().setValorBebida(valorD * emAlta);
            a.getR().getD().setDrinks(tipoD);

            a.getR().setValorTotal();

            a.getT().setValorTotal(valortran * emAlta);
            a.getT().setPessoas(pessoas);
            a.getT().setTransfer(tipot);

            l = datacont * emAlta;
            q.setValor(valorq * l);
            q.setTipo(tipoq);
            setCont1(cont1);
            setCont2(cont2);
            setCont3(cont3);
            setCont4(cont4);
            setCont5(cont5);
            setCont6(cont6);
            setCont7(cont7);
            a.setValorTotalHotel(vTH);

            boolean b = menu.addCliente(a);
            menu.addTodosContratos(a);

            JOptionPane.showMessageDialog(this, b ? "Salvo" : "nao salvo", "Salvo", JOptionPane.INFORMATION_MESSAGE);

            preencherTabela();

            zerarDados();

            R.getTD().setH(0);
            R.getLC().setH(0);
            R.getS().setH(0);
            R.setValorS(0);
            entrada = "";
            saida = "";

            desabilitarCampos();

            todoos.setEnabled(true);
            Cadrastar.setEnabled(false);

            desabilitarBotoes();
            visa.setEnabled(false);
            master.setEnabled(false);
            hipercard.setEnabled(false);
            elo.setEnabled(false);
            abrir.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os dados corrretamente");
        }

    }//GEN-LAST:event_CadrastarActionPerformed

    void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelacadastro.getModel();
        model.setNumRows(0);
        aberto = menu.retornarLista();
        for (Auxiliar d : aberto) {
            model.addRow(new Object[]{d.getContrato().getHospede().getNome(), d.getContrato().getHospede().getCpf(),
                d.getContrato().getHospede().getTelefone(), d.getContrato().getHospede().getFormataIn(), d.getContrato().getHospede().getFormataOut(),
                d.getContrato().getQuarto().getValor(), d.getAc().getValorTotal(), d.getBs().getValorTotal(), d.getT().getValorTotal(),
                (d.getR().getD().getValorBebida() + d.getR().getS().getValorSobremesa() + d.getR().getSs().getValorService() + d.getR().getLc().getValorRefeicao()),
                d.getValorTotalHotel()});
        }

    }

    private void AddCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCarroActionPerformed
        new TelaAluguelCarro().setVisible(true);
    }//GEN-LAST:event_AddCarroActionPerformed

    private void AddQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddQuartoActionPerformed

        new TelaQuartos().setVisible(true);

    }//GEN-LAST:event_AddQuartoActionPerformed

    private void AddRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRestauranteActionPerformed
        new TelaRestaurante().setVisible(true);
    }//GEN-LAST:event_AddRestauranteActionPerformed

    private void BabyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabyActionPerformed
        new TelaBabySitter().setVisible(true);
    }//GEN-LAST:event_BabyActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
        new TelaTransfer().setVisible(true);
    }//GEN-LAST:event_TransferActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        int j = tabelacadastro.getSelectedRow();

        if (j != -1) {
            menu.getAberto().get(j).getContrato().getHospede().setStatus("FECHADO");
            new TabelaDetalhes(j, menu.getAberto()).setVisible(true);
            String x = (String) tabelacadastro.getValueAt(j, 1).toString();
            for (int p = 0; p < aberto.size(); p++) {
                Auxiliar Aux = aberto.get(p);
                if (x.equals(Aux.getContrato().getHospede().getCpf())) {
                    //fechados.add(sa);
                    menu.getFechado().add(Aux);
                    menu.getAberto().remove(Aux);
                    aberto.remove(Aux);
                    ((DefaultTableModel) tabelacadastro.getModel()).removeRow(tabelacadastro.getSelectedRow());

                    break;
                }
            }
            abrir.setEnabled(true);
            fechar.setEnabled(false);
            fechados.setEnabled(true);
        }
    }//GEN-LAST:event_fecharActionPerformed

    private void fechadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechadosActionPerformed
        new TelaFechados(menu.getFechado()).setVisible(true);
    }//GEN-LAST:event_fechadosActionPerformed

    private void todoosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoosActionPerformed
        new TelasTodos(menu.getTodos()).setVisible(true);
    }//GEN-LAST:event_todoosActionPerformed

    private void tabelacadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacadastroMouseClicked

        int j = tabelacadastro.getSelectedRow();

        if (j != -1) {

            fechar.setEnabled(true);
            editar.setEnabled(true);
            detalhees.setEnabled(true);
            editarquarto.setEnabled(true);

            habilitarBotoes();

            habilitarCampos();

            Cadrastar.setEnabled(false);

        }

        int linha = tabelacadastro.getSelectedRow();

        cnome.setText(tabelacadastro.getValueAt(linha, 0).toString());
        ccpf.setText(tabelacadastro.getValueAt(linha, 1).toString());
        ccredito.setText(menu.getAberto().get(linha).getContrato().getHospede().getCredito());
        cendereco.setText(menu.getAberto().get(linha).getContrato().getHospede().getEndereco());
        cnascimento.setDate(menu.getAberto().get(linha).getContrato().getHospede().getNascimento());
        checkin.setDate(menu.getAberto().get(linha).getContrato().getHospede().getEntrada());
        checkout.setDate(menu.getAberto().get(linha).getContrato().getHospede().getSaida());

        ccel.setText(tabelacadastro.getValueAt(linha, 2).toString());

        cemail.setText(menu.getAberto().get(linha).getContrato().getHospede().getEmail());

        codseg.setText(menu.getAberto().get(linha).getContrato().getHospede().getCodigos());
        nomecartao.setText(menu.getAberto().get(linha).getContrato().getHospede().getNomecartao());
        mes.setSelectedIndex(menu.getAberto().get(linha).getContrato().getHospede().getMes());

        //int o = menu.getAberto().get(linha).getContrato().getHospede().getAno();
        if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2018) {
            ano.setSelectedIndex(1);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2019) {
            ano.setSelectedIndex(2);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2020) {
            ano.setSelectedIndex(3);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2021) {
            ano.setSelectedIndex(4);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2022) {
            ano.setSelectedIndex(5);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2023) {
            ano.setSelectedIndex(6);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2024) {
            ano.setSelectedIndex(7);
        } else if (menu.getAberto().get(linha).getContrato().getHospede().getAno() == 2025) {
            ano.setSelectedIndex(8);
        }

    }//GEN-LAST:event_tabelacadastroMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        int indice = tabelacadastro.getSelectedRow();

        String nome = cnome.getText();
        String cpf = ccpf.getText();
        String end = cendereco.getText();
        String cartao = ccredito.getText();
        String tel = ccel.getText();
        String email = cemail.getText();
        Date nas = cnascimento.getDate();
        Date in = checkin.getDate();
        Date out = checkout.getDate();

        int mess = mes.getSelectedIndex();
        int anoo = ano.getSelectedIndex();

        String ncartao = nomecartao.getText();
        String cood = codseg.getText();
        

        int compare = out.compareTo(in);

        if (compare == 0) {
            datavalida.setText("*selecione datas diferentes.");
        }
        if (compare < 0) {
            datavalida.setText("*chekout menor que checkin.");
        }

        if (compare > 0) {
            datavalida.setText("");
        }
        int k = 0;
        if (mess < 6 && anoo == 1) {
            validadedadata.setText("*mês inválido");
            k = 1;
        } else {
            if (anoo == 1) {
                anoo = 2018;
            } else if (anoo == 2) {
                anoo = 2019;
            } else if (anoo == 3) {
                anoo = 2020;
            } else if (anoo == 4) {
                anoo = 2021;
            } else if (anoo == 5) {
                anoo = 2022;
            } else if (anoo == 6) {
                anoo = 2023;
            } else if (anoo == 7) {
                anoo = 2024;
            } else if (anoo == 8) {
                anoo = 2025;
            }

            validadedadata.setText("");
        }

        if (!cnome.getText().equals("") && !ccpf.getText().equals("") && !cendereco.getText().equals("") && !ccel.getText().equals("") && !ccredito.getText().equals("")
                && mes.getSelectedIndex() != 0 && ano.getSelectedIndex() != 0 && !nomecartao.getText().equals("") && !codseg.getText().equals("")
                && !cnascimento.getDate().equals(null) && !checkin.getDate().equals(null) && !checkout.getDate().equals(null) && compare > 0 && k == 0 && s!=1) {
        
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        String entrada = formatarData.format(checkin.getDate());
        String saida = formatarData.format(checkout.getDate());
        String nascimento = formatarData.format(cnascimento.getDate());
            
            
            menu.EditarContratos(indice, nome, end, cpf, cartao, tel, ncartao, cood, tarifacao, email, mess, anoo, emAlta, in,out, nas,tipoc);

            menu.getAberto().get(indice).getContrato().getQuarto().setValor(menu.getAberto().get(indice).getContrato().getQuarto().getValor() + valorq * l);
            menu.getAberto().get(indice).getContrato().getQuarto().setTipo(menu.getAberto().get(indice).getContrato().getQuarto().getTipo() + tipoq);

            menu.getAberto().get(indice).getAc().setValorTotal(menu.getAberto().get(indice).getAc().getValorTotal() + valorcarro * emAlta);
            menu.getAberto().get(indice).getAc().setServico(menu.getAberto().get(indice).getAc().getServico() + tipocarro);

            menu.getAberto().get(indice).getBs().setValorTotal(menu.getAberto().get(indice).getBs().getValorTotal() + valorbs * emAlta);
            menu.getAberto().get(indice).getBs().setServicoBaby(menu.getAberto().get(indice).getBs().getServicoBaby() + servicoBaby);

            menu.getAberto().get(indice).getT().setValorTotal(menu.getAberto().get(indice).getT().getValorTotal() + valortran * emAlta);
            menu.getAberto().get(indice).getT().setTransfer(menu.getAberto().get(indice).getT().getTransfer() + tipot);
            menu.getAberto().get(indice).getT().setPessoas(menu.getAberto().get(indice).getT().getPessoas() + pessoas);

            menu.getAberto().get(indice).getR().getD().setValorBebida(menu.getAberto().get(indice).getR().getD().getValorBebida() + valorD * emAlta);
            menu.getAberto().get(indice).getR().getD().setDrinks(menu.getAberto().get(indice).getR().getD().getDrinks() + tipoD);
            menu.getAberto().get(indice).getR().getLc().setValorRefeicao(menu.getAberto().get(indice).getR().getLc().getValorRefeicao() + valorLC * emAlta);
            menu.getAberto().get(indice).getR().getLc().setLaCarte(menu.getAberto().get(indice).getR().getLc().getLaCarte() + tipoLc);
            menu.getAberto().get(indice).getR().getS().setValorSobremesa(menu.getAberto().get(indice).getR().getS().getValorSobremesa() + valorS);
            menu.getAberto().get(indice).getR().getS().setSobremesas(menu.getAberto().get(indice).getR().getS().getSobremesas() + tipoS);
            menu.getAberto().get(indice).getR().getSs().setValorService(menu.getAberto().get(indice).getR().getSs().getValorService() + valors * emAlta);
            menu.getAberto().get(indice).getR().getSs().setKg(menu.getAberto().get(indice).getR().getSs().getKg() + tipoSs);
            menu.getAberto().get(indice).getR().setValorTotal();
            menu.getAberto().get(indice).setValorTotalHotel(menu.getAberto().get(indice).getValorTotalHotel() + vTH);
            
            menu.getAberto().get(indice).getContrato().getHospede().setFormataIn(entrada);
            menu.getAberto().get(indice).getContrato().getHospede().setFormataNas(nascimento);
            menu.getAberto().get(indice).getContrato().getHospede().setFormataOut(saida);

            menu.getAberto().get(indice).getContrato().getHospede().getTipoCartao();
            preencherTabela();
            zerarDados();
            entrada = "";
            saida = "";

            desabilitarCampos();
            desabilitarBotoes();

            abrir.setEnabled(true);
            editar.setEnabled(true);

            editarquarto.setEnabled(false);
            detalhees.setEnabled(false);
            visa.setEnabled(false);
            master.setEnabled(false);
            hipercard.setEnabled(false);
            elo.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os dados corrretamente");
        }

    }//GEN-LAST:event_editarActionPerformed

    private void detalheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalheesActionPerformed

        int j = tabelacadastro.getSelectedRow();

        new TabelaDetalhes(j, menu.getAberto()).setVisible(true);

        detalhees.setEnabled(false);


    }//GEN-LAST:event_detalheesActionPerformed


    private void editarquartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarquartoActionPerformed
        int j = tabelacadastro.getSelectedRow();
        menu.getAberto().get(j).getContrato().getQuarto().setValor(0);
        menu.getAberto().get(j).getContrato().getQuarto().setTipo("");
        new TelaQuartos().setVisible(true);
        editarquarto.setEnabled(false);

    }//GEN-LAST:event_editarquartoActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed

        habilitarCampos();
        habilitarBotoes();

        Cadrastar.setEnabled(true);

        abrir.setEnabled(false);

    }//GEN-LAST:event_abrirActionPerformed

    private void ccreditoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccreditoKeyReleased
        if (totalDigitosCampo() == 0) {

            master.setEnabled(false);
            visa.setEnabled(false);

            hipercard.setEnabled(false);
            elo.setEnabled(false);
            numvalido.setText(""); s=1;

        } else {

            if (totalDigitosCampo() == 1) {
                if (campo().substring(0, 1).equals("4")) {

                    tipoc="Visa";
                    visa.setEnabled(true);
                    elo.setEnabled(false);
                    numvalido.setText(""); s=0;
                }
                else if(campo().substring(0, 1).equals("0") || campo().substring(0, 1).equals("1") || campo().substring(0, 1).equals("2") ||campo().substring(0, 1).equals("3") ||campo().substring(0, 1).equals("5") ||  campo().substring(0, 1).equals("6") || campo().substring(0, 1).equals("7") || campo().substring(0, 1).equals("8") || campo().substring(0, 1).equals("9")) 
                {
                master.setEnabled(false);
                visa.setEnabled(false);
                

                hipercard.setEnabled(false);
                elo.setEnabled(false);
                numvalido.setText("*número de cartão inválido"); s=1;
                }
            } else if (totalDigitosCampo() == 2) {
                if (campo().substring(0, 2).equals("51") || campo().substring(0, 2).equals("52") || campo().substring(0, 2).equals("53") || campo().substring(0, 2).equals("54") || campo().substring(0, 2).equals("55") || campo().substring(0, 2).equals("58")) {
                    master.setEnabled(true);
                    tipoc="MasterCard";
                    numvalido.setText(""); s=0;
                }
              
                if (campo().substring(0, 2).equals("50") || campo().substring(0, 2).equals("45") || campo().substring(0, 2).equals("63") || campo().substring(0, 2).equals("43") ) {
                    elo.setEnabled(true);
                    visa.setEnabled(false);
                    numvalido.setText(""); s=0;
                    tipoc="Elo";
                }
            
            }
            else if (totalDigitosCampo() == 4) {
                if (campo().substring(0, 4).equals("6062")) {
                    hipercard.setEnabled(true);
                    s=0;
                    tipoc="Hipercard";
                    numvalido.setText(""); 
                }
            } 
                
             
             else if(campo().substring(0, 1).equals("0") || campo().substring(0, 1).equals("1") || campo().substring(0, 1).equals("2") || campo().substring(0, 1).equals("3") || campo().substring(0, 1).equals("7") || campo().substring(0, 1).equals("7") || campo().substring(0, 1).equals("8") || campo().substring(0, 1).equals("9") ) 
                {
                
                numvalido.setText("*número de cartão inválido"); s=1;
                }

        }

    }//GEN-LAST:event_ccreditoKeyReleased

    public int totalDigitosCampo() { // Removo todos os espaços do campo pra poder tratar
        String aux = ccredito.getText().trim().replace("  ", "").replace(" ", "");
        return aux.length();
    }

    public String campo() {
        return ccredito.getText();
    }

    public void Auxiliar(Auxiliar a) {
        this.vTH = a.getValorTotalHotel();

    }

    public void Hospede(Hospede h) {
        this.status = h.getStatus();
        this.tipoc= h.getTipoCartao();
    }

    public void Quarto(Quarto q) {
        this.valorq = q.getValor();
        this.tipoq = q.getTipo();
    }

    public void Aluguel(AluguelDeCarro alc) {
        this.valorcarro = alc.getValorTotal();
        this.tipocarro = alc.getServico();

    }

    public void Babysitter(Babysitter bs) {
        this.valorbs = bs.getValorTotal();
        this.diurno = bs.getDiurno();
        this.noturno = bs.getNoturno();
        this.tempo = bs.getTempo();
        this.servicoBaby = bs.getServicoBaby();

    }

    public void Restaurante(Restaurante res) {
        this.valorres = res.getValorTotal();

    }

    public void Transfer(Transfer tran) {
        this.valortran = tran.getValorTotal();
        this.tipot = tran.getTransfer();
        this.pessoas = tran.getPessoas();

    }

    void Self_service(Self_service SS) {
        this.valors = SS.getValorService();
        this.tipoSs = SS.getKg();
    }

    void LaCarte(LaCarte LC) {
        this.valorLC = LC.getValorRefeicao();
        this.tipoLc = LC.getLaCarte();

    }

    void Sobremesas(Sobremesas S) {
        this.valorS = S.getValorSobremesa();
        this.tipoS = S.getSobremesas();

    }

    void Drinks(Drinks D) {
        this.valorD = D.getValorBebida();
        this.tipoD = D.getDrinks();

    }

    public static ArrayList<Auxiliar> getTodos() {
        return todos;
    }

    public static void setTodos(ArrayList<Auxiliar> Todos) {
        todos = Todos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCarro;
    private javax.swing.JButton AddQuarto;
    private javax.swing.JButton AddRestaurante;
    private javax.swing.JButton Baby;
    private javax.swing.JButton Cadrastar;
    private javax.swing.JLabel Nascimento;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton abrir;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JLabel c;
    private javax.swing.JFormattedTextField ccel;
    private javax.swing.JFormattedTextField ccpf;
    private javax.swing.JFormattedTextField ccredito;
    private javax.swing.JTextField cemail;
    private javax.swing.JTextField cendereco;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private com.toedter.calendar.JDateChooser cnascimento;
    private javax.swing.JTextField cnome;
    private javax.swing.JFormattedTextField codseg;
    private javax.swing.JLabel datavalida;
    private javax.swing.JButton detalhees;
    private javax.swing.JButton editar;
    private javax.swing.JButton editarquarto;
    private javax.swing.JButton elo;
    private javax.swing.JButton fechados;
    private javax.swing.JButton fechar;
    private javax.swing.ButtonGroup grupoDeBotao;
    private javax.swing.JButton hipercard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton master;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nomecartao;
    private javax.swing.JLabel numvalido;
    private javax.swing.JTable tabelacadastro;
    private javax.swing.JButton todoos;
    private javax.swing.JLabel validadedadata;
    private javax.swing.JLabel validadedadata1;
    private javax.swing.JButton visa;
    // End of variables declaration//GEN-END:variables

}
