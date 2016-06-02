package gui;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Data;
import model.Heroe;
import model.TMHeroe;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class App extends javax.swing.JFrame {

    private Data d;

    public App() {
        try {
            initComponents();
            d = new Data();
            setLocationRelativeTo(null);
            cargarHeroes();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vTienda = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        vAtributosAvanzados = new javax.swing.JDialog();
        pnlAtrAdv = new javax.swing.JPanel();
        imgMiniHeroe = new javax.swing.JLabel();
        lblNmbAdv = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblFueAdv = new javax.swing.JLabel();
        lblAgiAdv = new javax.swing.JLabel();
        lblIntAdv = new javax.swing.JLabel();
        lblArmAdv = new javax.swing.JLabel();
        lblVelAdv = new javax.swing.JLabel();
        lblRHPAdv = new javax.swing.JLabel();
        lblRMPAdv = new javax.swing.JLabel();
        lblRngAdv = new javax.swing.JLabel();
        btnCerrarAdv = new javax.swing.JButton();
        lblTtlAdv = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgFuerza = new javax.swing.JLabel();
        lblFuerza = new javax.swing.JLabel();
        imgAgi = new javax.swing.JLabel();
        imgInt = new javax.swing.JLabel();
        lblAgilidad = new javax.swing.JLabel();
        lblInteligencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNivel = new javax.swing.JLabel();
        btnAumentarNivel = new javax.swing.JButton();
        btnDisminuirNivel = new javax.swing.JButton();
        imgVelocidad = new javax.swing.JLabel();
        imgArmadura = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        lblArmadura = new javax.swing.JLabel();
        btnAvanzados = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblMana = new javax.swing.JLabel();
        lblHeroeNombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblQuote = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabHeroes = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnMusica = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/assault.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/butterfly.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/yasha.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/heart.png"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel21.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/satanic.png"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel22.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/black_king_bar.png"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel24.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/skadi.png"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel25.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/sheepstick.png"))); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel28.setPreferredSize(new java.awt.Dimension(54, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/objetos/shivas_guard.png"))); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel29.setPreferredSize(new java.awt.Dimension(54, 40));

        jButton4.setText("Comprar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jRadioButton1)
                .addGap(97, 97, 97)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(74, 74, 74))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jRadioButton4)
                                        .addGap(97, 97, 97)
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(jRadioButton6))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jRadioButton7)
                                        .addGap(97, 97, 97)
                                        .addComponent(jRadioButton8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton9)))
                                .addGap(75, 75, 75))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jButton4)
                                .addContainerGap())))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3)))
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton6)))
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton9)))
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principales", jPanel6);

        javax.swing.GroupLayout vTiendaLayout = new javax.swing.GroupLayout(vTienda.getContentPane());
        vTienda.getContentPane().setLayout(vTiendaLayout);
        vTiendaLayout.setHorizontalGroup(
            vTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        vTiendaLayout.setVerticalGroup(
            vTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        vAtributosAvanzados.setTitle("Atributos Avanzados");
        vAtributosAvanzados.setUndecorated(true);

        pnlAtrAdv.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos Avanzados"));
        pnlAtrAdv.setFocusCycleRoot(true);

        imgMiniHeroe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMiniHeroe.setPreferredSize(new java.awt.Dimension(32, 32));

        lblNmbAdv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNmbAdv.setText("No hay héroe seleccionado");

        jLabel6.setText("Fuerza:");

        jLabel7.setText("Agilidad:");

        jLabel8.setText("Inteligencia:");

        jLabel9.setText("Armadura:");

        jLabel10.setText("Velocidad:");

        jLabel11.setText("Regen. de Vida:");

        jLabel12.setText("Regen. de Maná:");

        jLabel19.setText("Rango:");

        lblFueAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFueAdv.setText("-");

        lblAgiAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAgiAdv.setText("-");

        lblIntAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntAdv.setText("-");

        lblArmAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArmAdv.setText("-");

        lblVelAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVelAdv.setText("-");

        lblRHPAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRHPAdv.setText("-");

        lblRMPAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRMPAdv.setText("-");

        lblRngAdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRngAdv.setText("-");

        btnCerrarAdv.setText("Cerrar");
        btnCerrarAdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAdvActionPerformed(evt);
            }
        });

        lblTtlAdv.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout pnlAtrAdvLayout = new javax.swing.GroupLayout(pnlAtrAdv);
        pnlAtrAdv.setLayout(pnlAtrAdvLayout);
        pnlAtrAdvLayout.setHorizontalGroup(
            pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrAdvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(pnlAtrAdvLayout.createSequentialGroup()
                        .addComponent(imgMiniHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNmbAdv)
                            .addComponent(lblTtlAdv))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAtrAdvLayout.createSequentialGroup()
                        .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFueAdv)
                            .addComponent(lblAgiAdv)
                            .addComponent(lblIntAdv)
                            .addComponent(lblArmAdv)
                            .addComponent(lblVelAdv)
                            .addComponent(lblRHPAdv)
                            .addComponent(lblRMPAdv)
                            .addComponent(lblRngAdv))))
                .addContainerGap())
            .addGroup(pnlAtrAdvLayout.createSequentialGroup()
                .addComponent(btnCerrarAdv)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAtrAdvLayout.setVerticalGroup(
            pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrAdvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAtrAdvLayout.createSequentialGroup()
                        .addComponent(lblNmbAdv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTtlAdv))
                    .addComponent(imgMiniHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblFueAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAgiAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblIntAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblArmAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblVelAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblRHPAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblRMPAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtrAdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblRngAdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnCerrarAdv))
        );

        javax.swing.GroupLayout vAtributosAvanzadosLayout = new javax.swing.GroupLayout(vAtributosAvanzados.getContentPane());
        vAtributosAvanzados.getContentPane().setLayout(vAtributosAvanzadosLayout);
        vAtributosAvanzadosLayout.setHorizontalGroup(
            vAtributosAvanzadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAtrAdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        vAtributosAvanzadosLayout.setVerticalGroup(
            vAtributosAvanzadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAtrAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Info. de Héroe"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadísticas"));

        imgFuerza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_fue.png"))); // NOI18N
        imgFuerza.setToolTipText("Fuerza");

        lblFuerza.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFuerza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuerza.setText("0");
        lblFuerza.setToolTipText("");

        imgAgi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_agi.png"))); // NOI18N
        imgAgi.setToolTipText("Agilidad");

        imgInt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_int.png"))); // NOI18N
        imgInt.setToolTipText("Inteligencia");

        lblAgilidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAgilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgilidad.setText("0");

        lblInteligencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInteligencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInteligencia.setText("0");

        lblNivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setText("0");
        lblNivel.setToolTipText("Nivel");
        lblNivel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 0)));
        lblNivel.setPreferredSize(new java.awt.Dimension(40, 40));

        btnAumentarNivel.setText("+");
        btnAumentarNivel.setEnabled(false);
        btnAumentarNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarNivelActionPerformed(evt);
            }
        });

        btnDisminuirNivel.setText("-");
        btnDisminuirNivel.setEnabled(false);
        btnDisminuirNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisminuirNivelActionPerformed(evt);
            }
        });

        imgVelocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_vel.png"))); // NOI18N
        imgVelocidad.setToolTipText("Velocidad");

        imgArmadura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_arm.png"))); // NOI18N
        imgArmadura.setToolTipText("Armadura");

        lblVelocidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVelocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVelocidad.setText("0");
        lblVelocidad.setToolTipText("");

        lblArmadura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArmadura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArmadura.setText("0");
        lblArmadura.setToolTipText("");

        btnAvanzados.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAvanzados.setText("Atributos Avanzados");
        btnAvanzados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzadosActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_vida.png"))); // NOI18N
        jLabel13.setToolTipText("Vida");

        lblVida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVida.setForeground(new java.awt.Color(204, 0, 0));
        lblVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVida.setText("0");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/atr_mana.png"))); // NOI18N
        jLabel17.setToolTipText("Maná");

        lblMana.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMana.setForeground(new java.awt.Color(0, 102, 153));
        lblMana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMana.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAumentarNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisminuirNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addComponent(btnAvanzados, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgFuerza)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(imgVelocidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(imgArmadura)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgAgi)
                .addGap(67, 67, 67)
                .addComponent(imgInt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgFuerza)
                    .addComponent(imgAgi)
                    .addComponent(imgInt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgilidad)
                    .addComponent(lblInteligencia)
                    .addComponent(lblFuerza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgVelocidad)
                        .addComponent(imgArmadura))
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidad)
                    .addComponent(lblArmadura)
                    .addComponent(lblVida)
                    .addComponent(lblMana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAumentarNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisminuirNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAvanzados, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        lblHeroeNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHeroeNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroeNombre.setText("Héroe");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Habilidades"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        lblImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        lblImagen.setMaximumSize(new java.awt.Dimension(256, 144));
        lblImagen.setMinimumSize(new java.awt.Dimension(128, 72));
        lblImagen.setPreferredSize(new java.awt.Dimension(256, 144));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblQuote))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeroeNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblHeroeNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblQuote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabHeroes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabHeroes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabHeroes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabHeroesMouseReleased(evt);
            }
        });
        tabHeroes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabHeroesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabHeroes);

        jLabel15.setText("Tabla de Héroes");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/logo.png"))); // NOI18N

        jButton1.setText("Comprar Objetos");
        jButton1.setEnabled(false);

        jButton2.setText("Reiniciar Campos");
        jButton2.setEnabled(false);

        jButton3.setText("Iniciar Comparación");
        jButton3.setEnabled(false);

        btnMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/iconos/audio.png"))); // NOI18N
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });

        mArchivo.setText("Archivo");

        jMenu1.setText("Debug");

        jMenuItem2.setText("Tienda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mArchivo.add(jMenu1);

        miSalir.setText("Salir...");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        jMenuBar1.add(mArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(112, 112, 112)
                                    .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14))
                    .addComponent(btnMusica))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(6, 6, 6)
                .addComponent(jButton2)
                .addGap(6, 6, 6)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabHeroesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHeroesMouseReleased
        if (evt.getClickCount() == 1) {
            cargarEstadisticas();
            try {
                audioHeroe();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tabHeroesMouseReleased

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea salir?") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_miSalirActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
        InputStream musica;
        try {
            musica = new FileInputStream(new File("src\\resource\\audio\\heroselection.wav"));
            AudioStream audio = new AudioStream(musica);
            AudioPlayer.player.start(audio);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMusicaActionPerformed

    private void tabHeroesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabHeroesKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            cargarEstadisticas();
            try {
                audioHeroe();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tabHeroesKeyReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        vTienda.setVisible(true);
        vTienda.setBounds(WIDTH, WIDTH, 400, 400);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAumentarNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarNivelActionPerformed
        InputStream musica;
        try {
            musica = new FileInputStream(new File("src\\resource\\audio\\levelup.wav"));
            AudioStream audio = new AudioStream(musica);
            AudioPlayer.player.start(audio);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            int fila = tabHeroes.getSelectedRow();
            String strID = tabHeroes.getValueAt(fila, 0).toString();
            int id = Integer.parseInt(strID);
            int nivel = d.getNivel(id);
            if (nivel < 25) {
                d.subirNivel(id);
            } else {
                JOptionPane.showMessageDialog(this, "Nivel máximo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarEstadisticas();
    }//GEN-LAST:event_btnAumentarNivelActionPerformed

    private void btnAvanzadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzadosActionPerformed
        vAtributosAvanzados.setVisible(true);
        vAtributosAvanzados.setBounds(0, 0, 230, 400);
        vAtributosAvanzados.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAvanzadosActionPerformed

    private void btnDisminuirNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisminuirNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisminuirNivelActionPerformed

    private void btnCerrarAdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAdvActionPerformed
        vAtributosAvanzados.setVisible(false);
    }//GEN-LAST:event_btnCerrarAdvActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentarNivel;
    private javax.swing.JButton btnAvanzados;
    private javax.swing.JButton btnCerrarAdv;
    private javax.swing.JButton btnDisminuirNivel;
    private javax.swing.JButton btnMusica;
    private javax.swing.JLabel imgAgi;
    private javax.swing.JLabel imgArmadura;
    private javax.swing.JLabel imgFuerza;
    private javax.swing.JLabel imgInt;
    private javax.swing.JLabel imgMiniHeroe;
    private javax.swing.JLabel imgVelocidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAgiAdv;
    private javax.swing.JLabel lblAgilidad;
    private javax.swing.JLabel lblArmAdv;
    private javax.swing.JLabel lblArmadura;
    private javax.swing.JLabel lblFueAdv;
    private javax.swing.JLabel lblFuerza;
    private javax.swing.JLabel lblHeroeNombre;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIntAdv;
    private javax.swing.JLabel lblInteligencia;
    private javax.swing.JLabel lblMana;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNmbAdv;
    private javax.swing.JLabel lblQuote;
    private javax.swing.JLabel lblRHPAdv;
    private javax.swing.JLabel lblRMPAdv;
    private javax.swing.JLabel lblRngAdv;
    private javax.swing.JLabel lblTtlAdv;
    private javax.swing.JLabel lblVelAdv;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JLabel lblVida;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel pnlAtrAdv;
    private javax.swing.JTable tabHeroes;
    private javax.swing.JDialog vAtributosAvanzados;
    private javax.swing.JFrame vTienda;
    // End of variables declaration//GEN-END:variables

    private void cargarEstadisticas() {
        try {
            btnAumentarNivel.setEnabled(true);
            int fila = tabHeroes.getSelectedRow();
            String strID = tabHeroes.getValueAt(fila, 0).toString();
            int id = Integer.parseInt(strID);

            Heroe h = d.getHeroe(id);
            lblHeroeNombre.setText(
                    d.getHeroeStrings(id, d.NOMBRE)
                    + ", the "
                    + d.getHeroeStrings(id, d.TITULO));

            d.actualizarStats(id);
            cargarEstadisticasAdv(id);
            
            int fuerza = d.getEstadisticas(id, d.FUERZA);
            int agilidad = d.getEstadisticas(id, d.AGILIDAD);
            int inteligencia = d.getEstadisticas(id, d.INTELIGENCIA);
            int vida = d.getEstadisticas(id, d.VIDA);
            int mana = d.getEstadisticas(id, d.MANA);
            int velocidad = d.getEstadisticas(id, d.VELOCIDAD);            
            int nivel = d.getEstadisticas(id, d.NIVEL);
            
            
            lblFuerza.setText(String.valueOf(fuerza));
            lblAgilidad.setText(String.valueOf(agilidad));
            lblInteligencia.setText(String.valueOf(inteligencia));
            lblVelocidad.setText(String.valueOf(velocidad));
            
            lblVida.setText(String.valueOf(vida));
            lblMana.setText(String.valueOf(mana));
            lblNivel.setText(String.valueOf(nivel));
            
            lblVelAdv.setText(String.valueOf(velocidad));

            

            lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/resource/heroes/" + d.getHeroeStrings(id,d.RUTA)+".png")));

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarEstadisticasAdv(int id) throws SQLException {
        double regenHP = d.getEstadisticasDouble(id, d.REGEN_HP);
        double regenMN = d.getEstadisticasDouble(id, d.REGEN_MANA);
        double fuerzaNvl = d.getEstadisticasDouble(id, d.FUERZA_POR_NIVEL);
        double agilidadNvl = d.getEstadisticasDouble(id, d.AGILIDAD_POR_NIVEL);
        double intNvl = d.getEstadisticasDouble(id, d.INTELIGENCIA_POR_NIVEL);
        double armadura = d.getEstadisticasDouble(id, d.ARMADURA);

        lblRHPAdv.setText(String.valueOf(regenHP));
        lblRMPAdv.setText(String.valueOf(regenMN));
        lblFueAdv.setText(d.getEstadisticas(id, d.FUERZA)+" + "+ fuerzaNvl+"/nivel");
        lblAgiAdv.setText(d.getEstadisticas(id, d.AGILIDAD)+" + "+ agilidadNvl+"/nivel");
        lblIntAdv.setText(d.getEstadisticas(id, d.INTELIGENCIA)+" + "+ intNvl+"/nivel");
        
        imgMiniHeroe.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/resource/heroes/miniheroes/" + d.getHeroeStrings(id,d.RUTA)+".png")));
        lblNmbAdv.setText(d.getHeroeStrings(id, d.NOMBRE));
        lblTtlAdv.setText(d.getHeroeStrings(id, d.TITULO)
                +" de nivel "+d.getEstadisticas(id, d.NIVEL)); 
        lblArmAdv.setText(String.valueOf(armadura));
        
        lblArmadura.setText(String.valueOf(armadura));
    }

    private void cargarHeroes() throws SQLException {
        TMHeroe model = new TMHeroe(d.getListaHeroes());
        tabHeroes.setModel(model);
        tabHeroes.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabHeroes.getColumnModel().getColumn(1).setPreferredWidth(140);
        tabHeroes.setAutoResizeMode(tabHeroes.AUTO_RESIZE_LAST_COLUMN);

    }

    private void audioHeroe() throws SQLException {
        int fila = tabHeroes.getSelectedRow();
        String strID = tabHeroes.getValueAt(fila, 0).toString();
        int id = Integer.parseInt(strID);

        Heroe h = d.getHeroe(id);
        InputStream linea;
        try {
            linea = new FileInputStream(new File("src\\resource\\audio\\" + d.getHeroeStrings(id, d.RUTA)+".wav"));
            AudioStream audio = new AudioStream(linea);
            AudioPlayer.player.start(audio);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
