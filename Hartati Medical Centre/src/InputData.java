/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapasienexit;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class InputData extends javax.swing.JFrame {

    /**
     * Creates new form InputData
     */
    public InputData() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        FieldNomorRM = new javax.swing.JTextField();
        Nama1 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        FieldNomor = new javax.swing.JTextField();
        NomorRM = new javax.swing.JLabel();
        Nomor = new javax.swing.JLabel();
        FieldNama = new javax.swing.JTextField();
        FieldTanggal1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FieldAlamat = new javax.swing.JTextArea();
        Nama3 = new javax.swing.JLabel();
        FieldDokter = new javax.swing.JTextField();
        Nama2 = new javax.swing.JLabel();
        FieldPenyebab = new javax.swing.JTextField();
        Button = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Nama4 = new javax.swing.JLabel();
        Nama5 = new javax.swing.JLabel();
        FieldUmur = new javax.swing.JTextField();
        Pilihan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Data Pasien Exit");

        Nama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nama.setText("Nama Pasien");

        FieldNomorRM.setToolTipText("Nama Pasien");
        FieldNomorRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNomorRMActionPerformed(evt);
            }
        });

        Nama1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nama1.setText("Penyebab");

        Tanggal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tanggal.setText("Tanggal Kematian");

        FieldNomor.setToolTipText("Nama Pasien");
        FieldNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNomorActionPerformed(evt);
            }
        });

        NomorRM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NomorRM.setText("Nomor Rekam Medis");

        Nomor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nomor.setText("Nomor Kematian");

        FieldNama.setToolTipText("Nama Pasien");
        FieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNamaActionPerformed(evt);
            }
        });

        FieldTanggal1.setToolTipText("Nama Pasien");
        FieldTanggal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTanggal1ActionPerformed(evt);
            }
        });

        FieldAlamat.setColumns(20);
        FieldAlamat.setRows(5);
        jScrollPane1.setViewportView(FieldAlamat);

        Nama3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nama3.setText("Jenis Kelamin");

        FieldDokter.setToolTipText("Nama Pasien");
        FieldDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDokterActionPerformed(evt);
            }
        });

        Nama2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nama2.setText("Dokter");

        FieldPenyebab.setToolTipText("Nama Pasien");
        FieldPenyebab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPenyebabActionPerformed(evt);
            }
        });

        Button.setText("Simpan");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        Button2.setText("Hapus");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Nama4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nama4.setText("Alamat");

        Nama5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nama5.setText("Umur");

        FieldUmur.setToolTipText("Nama Pasien");
        FieldUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUmurActionPerformed(evt);
            }
        });

        Pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilihan ---", "Laki-laki", "Perempuan" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Button, org.jdesktop.beansbinding.ObjectProperty.create(), Pilihan, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(Button2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FieldNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nomor)
                                    .addComponent(NomorRM)
                                    .addComponent(Nama)
                                    .addComponent(Tanggal)
                                    .addComponent(Nama3)
                                    .addComponent(Nama5))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(FieldNomorRM)
                                    .addComponent(FieldTanggal1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(FieldUmur, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(Pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nama2)
                            .addComponent(Nama1)
                            .addComponent(Nama4))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(FieldDokter)
                    .addComponent(FieldPenyebab))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldNomor)
                            .addComponent(Nomor)
                            .addComponent(Nama4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldNomorRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomorRM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nama)
                            .addComponent(FieldNama)
                            .addComponent(Nama2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tanggal)
                            .addComponent(FieldTanggal1)
                            .addComponent(Nama1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(FieldDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldPenyebab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama3)
                    .addComponent(Pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama5)
                    .addComponent(FieldUmur))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button)
                    .addComponent(Button2))
                .addGap(269, 269, 269))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldNomorRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNomorRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNomorRMActionPerformed

    private void FieldNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNomorActionPerformed

    private void FieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNamaActionPerformed

    private void FieldTanggal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTanggal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTanggal1ActionPerformed

    private void FieldDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDokterActionPerformed

    private void FieldPenyebabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPenyebabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPenyebabActionPerformed

    private void FieldUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUmurActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="INSERT INTO data_pasien VALUES ('"+FieldNomorRM.getText()+"','"+FieldNomor.getText()+"','"+FieldTanggal1.getText()+"','"+FieldAlamat.getText()+"','"+FieldNama.getText()+"','"+Pilihan.getSelectedItem()+"','"+FieldUmur.getText()+"','"+FieldDokter.getText()+"','"+FieldPenyebab.getText()+"')";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_ButtonActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
       	FieldNomorRM.setText("");
        FieldNomor.setText("");
        FieldAlamat.setText("");
        Tanggal.setText("");
        FieldTanggal1.setText("");
        FieldDokter.setText("");
        FieldPenyebab.setText("");
        Pilihan.setSelectedItem("--- Pilihan ---");
        FieldUmur.setText("");
        FieldNama.setText("");
    }//GEN-LAST:event_Button2ActionPerformed

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
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JButton Button2;
    private javax.swing.JTextArea FieldAlamat;
    private javax.swing.JTextField FieldDokter;
    private javax.swing.JTextField FieldNama;
    private javax.swing.JTextField FieldNomor;
    private javax.swing.JTextField FieldNomorRM;
    private javax.swing.JTextField FieldPenyebab;
    private javax.swing.JTextField FieldTanggal1;
    private javax.swing.JTextField FieldUmur;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Nama1;
    private javax.swing.JLabel Nama2;
    private javax.swing.JLabel Nama3;
    private javax.swing.JLabel Nama4;
    private javax.swing.JLabel Nama5;
    private javax.swing.JLabel Nomor;
    private javax.swing.JLabel NomorRM;
    private javax.swing.JComboBox<String> Pilihan;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}