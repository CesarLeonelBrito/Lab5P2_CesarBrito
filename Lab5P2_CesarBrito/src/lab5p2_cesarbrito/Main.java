/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_cesarbrito;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author cesar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_jtree = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtree = new javax.swing.JTree();
        jd_entrenador = new javax.swing.JDialog();
        js_edad_e = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        js_copas_e = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        js_contrato_e = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        agregar_entrenador = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_nombre_e = new javax.swing.JTextField();
        tf_apellido_e = new javax.swing.JTextField();
        tf_nacionalidad_e = new javax.swing.JTextField();
        jd_jugador = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nacionalidad = new javax.swing.JTextField();
        js_edad = new javax.swing.JSpinner();
        js_numero = new javax.swing.JSpinner();
        js_contrato = new javax.swing.JSpinner();
        agregar_jugador = new javax.swing.JButton();
        jd_preparadorfisico = new javax.swing.JDialog();
        jd_psicologo = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jb_jugador = new javax.swing.JButton();
        jb_entrenador = new javax.swing.JButton();
        jb_psicologo = new javax.swing.JButton();
        jb_preparadorfisico = new javax.swing.JButton();
        jb_juego = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItem_jtree = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Persona");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Jugadores");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Entrenadores");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Preparadores físicos");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Psicólogos");
        treeNode1.add(treeNode2);
        jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jtree);

        javax.swing.GroupLayout jd_jtreeLayout = new javax.swing.GroupLayout(jd_jtree.getContentPane());
        jd_jtree.getContentPane().setLayout(jd_jtreeLayout);
        jd_jtreeLayout.setHorizontalGroup(
            jd_jtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jtreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_jtreeLayout.setVerticalGroup(
            jd_jtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_jtreeLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        js_edad_e.setValue(18);

        jLabel8.setText("Nombre:");

        jLabel9.setText("Apellido:");

        jLabel10.setText("Nacionalidad:");

        agregar_entrenador.setText("Agregar");
        agregar_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_entrenadorActionPerformed(evt);
            }
        });

        jLabel11.setText("Edad:");

        jLabel12.setText("Copas Ganadas:");

        jLabel13.setText("Años del Contrato:");

        javax.swing.GroupLayout jd_entrenadorLayout = new javax.swing.GroupLayout(jd_entrenador.getContentPane());
        jd_entrenador.getContentPane().setLayout(jd_entrenadorLayout);
        jd_entrenadorLayout.setHorizontalGroup(
            jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_entrenadorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_entrenadorLayout.createSequentialGroup()
                        .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(agregar_entrenador)
                            .addComponent(tf_nombre_e)
                            .addComponent(tf_apellido_e)
                            .addComponent(tf_nacionalidad_e, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(142, Short.MAX_VALUE))
                    .addGroup(jd_entrenadorLayout.createSequentialGroup()
                        .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(js_contrato_e, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(js_edad_e, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(js_copas_e, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jd_entrenadorLayout.setVerticalGroup(
            jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_entrenadorLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombre_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_apellido_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_nacionalidad_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(js_edad_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(js_copas_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_entrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(js_contrato_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(agregar_entrenador)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nacionalidad:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Numero:");

        jLabel7.setText("Años del Contrato:");

        js_edad.setValue(18);

        agregar_jugador.setText("Agregar");
        agregar_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_jugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_jugadorLayout = new javax.swing.GroupLayout(jd_jugador.getContentPane());
        jd_jugador.getContentPane().setLayout(jd_jugadorLayout);
        jd_jugadorLayout.setHorizontalGroup(
            jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jugadorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_jugadorLayout.createSequentialGroup()
                        .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(agregar_jugador)
                            .addComponent(tf_nombre)
                            .addComponent(tf_apellido)
                            .addComponent(tf_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(jd_jugadorLayout.createSequentialGroup()
                        .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(js_contrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(js_edad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(js_numero, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jd_jugadorLayout.setVerticalGroup(
            jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jugadorLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(js_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(js_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(js_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(agregar_jugador)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_preparadorfisicoLayout = new javax.swing.GroupLayout(jd_preparadorfisico.getContentPane());
        jd_preparadorfisico.getContentPane().setLayout(jd_preparadorfisicoLayout);
        jd_preparadorfisicoLayout.setHorizontalGroup(
            jd_preparadorfisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_preparadorfisicoLayout.setVerticalGroup(
            jd_preparadorfisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_psicologoLayout = new javax.swing.GroupLayout(jd_psicologo.getContentPane());
        jd_psicologo.getContentPane().setLayout(jd_psicologoLayout);
        jd_psicologoLayout.setHorizontalGroup(
            jd_psicologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_psicologoLayout.setVerticalGroup(
            jd_psicologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("AGREGAR: ");
        jToolBar1.add(jLabel1);

        jb_jugador.setText("Jugador");
        jb_jugador.setFocusable(false);
        jb_jugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_jugador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_jugadorActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_jugador);

        jb_entrenador.setText("Entrenador");
        jb_entrenador.setFocusable(false);
        jb_entrenador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_entrenador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entrenadorActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_entrenador);

        jb_psicologo.setText("Psicólogo");
        jb_psicologo.setFocusable(false);
        jb_psicologo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_psicologo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_psicologo);

        jb_preparadorfisico.setText("Preparador Físico");
        jb_preparadorfisico.setFocusable(false);
        jb_preparadorfisico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_preparadorfisico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_preparadorfisico);

        jb_juego.setText("Juego");
        jb_juego.setFocusable(false);
        jb_juego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_juego.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_juego);

        jMenu1.setText("Jtree");

        menuItem_jtree.setText("Jtree");
        menuItem_jtree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_jtreeActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_jtree);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 277, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_jtreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_jtreeActionPerformed
        // TODO add your handling code here:
        /*DefaultTreeModel m = (DefaultTreeModel) jtree.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        raiz.removeAllChildren();
        for (int i = 0; i < personas.size(); i++) {
            for (int j = 0; j < raiz.getChildCount(); j++) {
                if (personas.get(i) instanceof Jugador && raiz.getChildAt(i).toString().equals("Jugadores")) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(personas.get(i));
                    ((DefaultMutableTreeNode) raiz.getChildAt(j)).add(p);
                }else if (personas.get(i) instanceof Entrenador && raiz.getChildAt(i).toString().equals("Entrenadores")) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(personas.get(i));
                    ((DefaultMutableTreeNode) raiz.getChildAt(j)).add(p);
                }else if (personas.get(i) instanceof PreparadorFisico && raiz.getChildAt(i).toString().equals("Preparadores físicos")) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(personas.get(i));
                    ((DefaultMutableTreeNode) raiz.getChildAt(j)).add(p);
                }else if (personas.get(i) instanceof Psicologo && raiz.getChildAt(i).toString().equals("Psicólogos")) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(personas.get(i));
                    ((DefaultMutableTreeNode) raiz.getChildAt(j)).add(p);
                }

            }
            m.reload();
        }*/
        jd_jtree.setModal(true);
        jd_jtree.pack();
        jd_jtree.setLocationRelativeTo(this);
        jd_jtree.setVisible(true);
    }//GEN-LAST:event_menuItem_jtreeActionPerformed

    private void agregar_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_jugadorActionPerformed
        // TODO add your handling code here:
        try {
            int partidosJugados = 0, copasGanadas = 0, tarjetasAmarillas = 0, tarjetasRojas = 0;
            String nombre = tf_nombre.getText();
            String apellido = tf_apellido.getText();
            String nacionalidad = tf_nacionalidad.getText();
            int edad = (Integer) js_edad.getValue();
            int numero = (Integer) js_numero.getValue();
            int contrato = (Integer) js_contrato.getValue();
            Jugador x = new Jugador(edad, numero, partidosJugados, copasGanadas, tarjetasAmarillas, tarjetasRojas, contrato, nombre, apellido, nacionalidad);
            personas.add(new Jugador(edad, numero, partidosJugados, copasGanadas, tarjetasAmarillas, tarjetasRojas, contrato, nombre, apellido, nacionalidad));
            tf_nombre.setText("");
            tf_apellido.setText("");
            tf_nacionalidad.setText("");
            js_edad.setValue(18);
            js_numero.setValue(0);
            js_contrato.setValue(0);
            DefaultTreeModel m = (DefaultTreeModel) jtree.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            for (int j = 0; j < raiz.getChildCount(); j++) {
                if (raiz.getChildAt(j).toString().equals("Jugadores")) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(x);
                    ((DefaultMutableTreeNode) raiz.getChildAt(j)).add(p);
                }
            }
            m.reload();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_jugador, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_agregar_jugadorActionPerformed

    private void jb_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_jugadorActionPerformed
        // TODO add your handling code here:
        jd_jugador.setModal(true);
        jd_jugador.pack();
        jd_jugador.setLocationRelativeTo(this);
        jd_jugador.setVisible(true);
    }//GEN-LAST:event_jb_jugadorActionPerformed

    private void agregar_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_entrenadorActionPerformed
        // TODO add your handling code here:
        try {            
            String nombre = tf_nombre_e.getText();
            String apellido = tf_apellido_e.getText();
            String nacionalidad = tf_nacionalidad_e.getText();
            int edad = (Integer) js_edad_e.getValue();
            int copas = (Integer) js_copas_e.getValue();
            int contrato = (Integer) js_contrato_e.getValue();
            Entrenador x = new Entrenador(edad, contrato, copas, nombre, apellido, nacionalidad);
            personas.add(x);
            tf_nombre_e.setText("");
            tf_apellido_e.setText("");
            tf_nacionalidad_e.setText("");
            js_edad_e.setValue(18);
            js_copas_e.setValue(0);
            js_contrato_e.setValue(0);
            DefaultTreeModel m = (DefaultTreeModel) jtree.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            for (int j = 0; j < raiz.getChildCount(); j++) {
                if (raiz.getChildAt(j).toString().equals("Entrenadores")) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(x);
                    ((DefaultMutableTreeNode) raiz.getChildAt(j)).add(p);
                }
            }
            m.reload();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_entrenador, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_agregar_entrenadorActionPerformed

    private void jb_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrenadorActionPerformed
        // TODO add your handling code here:
        jd_entrenador.setModal(true);
        jd_entrenador.pack();
        jd_entrenador.setLocationRelativeTo(this);
        jd_entrenador.setVisible(true);
    }//GEN-LAST:event_jb_entrenadorActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_entrenador;
    private javax.swing.JButton agregar_jugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_entrenador;
    private javax.swing.JButton jb_juego;
    private javax.swing.JButton jb_jugador;
    private javax.swing.JButton jb_preparadorfisico;
    private javax.swing.JButton jb_psicologo;
    private javax.swing.JDialog jd_entrenador;
    private javax.swing.JDialog jd_jtree;
    private javax.swing.JDialog jd_jugador;
    private javax.swing.JDialog jd_preparadorfisico;
    private javax.swing.JDialog jd_psicologo;
    private javax.swing.JSpinner js_contrato;
    private javax.swing.JSpinner js_contrato_e;
    private javax.swing.JSpinner js_copas_e;
    private javax.swing.JSpinner js_edad;
    private javax.swing.JSpinner js_edad_e;
    private javax.swing.JSpinner js_numero;
    private javax.swing.JTree jtree;
    private javax.swing.JMenuItem menuItem_jtree;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_apellido_e;
    private javax.swing.JTextField tf_nacionalidad;
    private javax.swing.JTextField tf_nacionalidad_e;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre_e;
    // End of variables declaration//GEN-END:variables
    ArrayList<Persona> personas = new ArrayList();
}
