/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package convert;

import connection.MainClass;
import connection.koneksiDB;
import java.awt.HeadlessException;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.ComboBoxModel;
//import javax.swing.JComboBox;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class BeliTiket extends javax.swing.JFrame {

    private long ID;
    MainClass mainClass;

    /**
     * Creates new form BeliTiket
     */
    public BeliTiket() {
        initComponents();
        ViewData("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDbeli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKursi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbJurusan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBeliTiket = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 196, 222));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-back-40.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Pembelian Tiket");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Id Pembelian");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("No Kursi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Lokasi");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Jurusan");

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jakarta", "Bandung", "Karawang", "Bogor" }));
        cbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJurusanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Jumlah");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tanggal");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Total Harga");

        tblBeliTiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tblBeliTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBeliTiketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBeliTiket);

        btnSimpan.setText("Simpan");
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIDbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(142, 142, 142)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                            .addComponent(txtLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJurusanActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeUser().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:

        try {
            String nama = txtNama.getText();
            String NoKursi = txtKursi.getText();
            String Tanggal = txtTanggal.getText();
            String Lokasi = txtLokasi.getText();
            String Jurusan = cbJurusan.getSelectedItem().toString();
            String Jumlah = txtJumlah.getText();
            String TotalHarga = txtTotalHarga.getText();

            if (nama.isEmpty() || NoKursi.isEmpty() || Tanggal.isEmpty() || Lokasi.isEmpty() || Jurusan.isEmpty() || Jumlah.isEmpty() || TotalHarga.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lengkapi Data Terlebih Dahulu!");
            } else {
                //siapkan query
                // Persiapkan query
                String sql = "INSERT INTO belitiket "
                        + "(nama, no_kursi, tanggal, lokasi, jurusan,jumlah, total_harga)"
                        + "VALUES "
                        + "("
                        + "'" + nama + "',"
                        + "'" + NoKursi + "',"
                        + "'" + Tanggal + "',"
                        + "'" + Lokasi + "',"
                        + "'" + Jurusan + "',"
                        + "'" + Jumlah + "',"
                        + "'" + TotalHarga + "'"
                        + ")";
                System.out.println(sql);

                Connection c = koneksiDB.BukaKoneksi();
                Statement st = c.createStatement();

                st.executeUpdate(sql);

                ViewData("");
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Data GAGAL disimpan\n"
                    + "" + e.getMessage());
        }


    }//GEN-LAST:event_btnSimpanMouseClicked

    private void tblBeliTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBeliTiketMouseClicked
        // TODO add your handling code here:
        int index = tblBeliTiket.getSelectedRow();
        if (index != -1) {
            String id = tblBeliTiket.getValueAt(index, 0).toString();
            long TheID = Long.parseLong(id);
            ID = TheID;

            String nama = tblBeliTiket.getValueAt(index, 1).toString();
            String no_kursi = tblBeliTiket.getValueAt(index, 2).toString(); // Ganti tblData menjadi tblBeliTiket
            String tanggal = tblBeliTiket.getValueAt(index, 3).toString(); // Ganti tblData menjadi tblBeliTiket
            String lokasi = tblBeliTiket.getValueAt(index, 4).toString(); // Ganti tblData menjadi tblBeliTiket
            String jurusan = tblBeliTiket.getValueAt(index, 5).toString(); // Ganti tblData menjadi tblBeliTiket
            String jumlah = tblBeliTiket.getValueAt(index, 6).toString(); // Ganti tblData menjadi tblBeliTiket
            String total_harga = tblBeliTiket.getValueAt(index, 7).toString(); // Ganti tblData menjadi tblBeliTiket

            mainClass = new MainClass();
            mainClass.setId_pembelian(id);
            mainClass.setNama(nama);
            mainClass.setNo_kursi(no_kursi); // Ganti setNip menjadi setNo_kursi
            mainClass.setTanggal(tanggal); // Ganti setJabatan menjadi setTanggal
            mainClass.setLokasi(lokasi); // Ganti setJk menjadi setLokasi
            mainClass.setJurusan(jurusan); // Ganti setShift_piket menjadi setJurusan
            mainClass.setJumlah(jumlah);
            mainClass.setTotal_harga(total_harga); // Ganti setTanggal_masuk menjadi setTotalHarga
        }

    }//GEN-LAST:event_tblBeliTiketMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
        if (ID > 0) {
            try {
                Object[] tombol = {"YA", "Tidak"};
                int option = JOptionPane.showOptionDialog(this,
                        "Apakah anda ingin menghapus data?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, tombol, 0);
                if (option == 0) {
                    // Hapus data dari tabel utama
                    Connection c = koneksiDB.BukaKoneksi();
                    Statement st = c.createStatement();
                    String sql = "DELETE FROM belitiket WHERE id_pembelian='" + ID + "'";
                    // Eksekusi query
                    st.executeUpdate(sql);
                    
                    ViewData("");
                }
            } catch (HeadlessException | SQLException e) {
                System.err.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih Data");
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        try {
            int idPembelian = Integer.parseInt(txtIDbeli.getText());
            String nama = txtNama.getText();
            String nokursi = txtKursi.getText();
            String tanggal = txtTanggal.getText();
            String lokasi = txtLokasi.getText();
            String jurusan = cbJurusan.getSelectedItem().toString(); // Tanpa konversi ke int
            String jumlah = txtJumlah.getText();
            String total_harga = txtTotalHarga.getText();

            // Persiapkan query update
            String sql = "UPDATE belitiket SET  "
                    + "nama = '" + nama + "', "
                    + "no_kursi = '" + nokursi + "', "
                    + "tanggal = '" + tanggal + "', "
                    + "lokasi = '" + lokasi + "', "
                    + "jurusan = '" + jurusan + "', "
                    + "jumlah = '" + jumlah + "', "
                    + "total_harga = '" + total_harga + "' "
                    + "WHERE id_pembelian = " + idPembelian;

            Connection c = koneksiDB.BukaKoneksi();
            Statement st = c.createStatement();

            st.executeUpdate(sql);

            ViewData(""); // Refresh tampilan setelah update
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");

            // Kosongkan nilai pada panel update setelah update berhasil
            txtIDbeli.setText("");
            txtNama.setText("");
            txtKursi.setText("");
            txtTanggal.setText("");
            txtLokasi.setText("");
            cbJurusan.setSelectedIndex(0);
            txtJumlah.setText("");
            txtTotalHarga.setText("");
         
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Data GAGAL diupdate\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        try {
            // Mendapatkan nilai dari baris yang dipilih pada tabel
            int selectedRow = tblBeliTiket.getSelectedRow();
            String idPembelian = tblBeliTiket.getValueAt(selectedRow, 0).toString();
            String nama = tblBeliTiket.getValueAt(selectedRow, 1).toString();
            String nokursi = tblBeliTiket.getValueAt(selectedRow, 2).toString();
            String tanggal = tblBeliTiket.getValueAt(selectedRow, 3).toString();
            String lokasi = tblBeliTiket.getValueAt(selectedRow, 4).toString();
            String jurusan = tblBeliTiket.getValueAt(selectedRow, 5).toString();
            String jumlah = tblBeliTiket.getValueAt(selectedRow, 6).toString();
            String kuota = tblBeliTiket.getValueAt(selectedRow, 7).toString();

            // Mengisi nilai ke dalam JTextField dan JComboBox pada pnUpdate
            txtIDbeli.setText(idPembelian);
            txtNama.setText(nama);
            txtKursi.setText(nokursi);
            txtTanggal.setText(tanggal);
            txtLokasi.setText(lokasi);
            cbJurusan.setSelectedItem(jurusan);
            txtJumlah.setText(jumlah);
            txtTotalHarga.setText(kuota);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengisi data pada panel update\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnEditMouseClicked

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
            java.util.logging.Logger.getLogger(BeliTiket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeliTiket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeliTiket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeliTiket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeliTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblBeliTiket;
    private javax.swing.JTextField txtIDbeli;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKursi;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables

    public static void ViewData(String where) {
        Object[] kolom = {"ID Pembelian", "Nama", "No Kursi", "Tanggal", "Lokasi", "Jurusan", "Jumlah", "Total Harga"};
        DefaultTableModel model = new DefaultTableModel(null, kolom);
        tblBeliTiket.setModel(model);

        // Deklarasikan variabel Connection di luar blok try
        Connection c = null;

        try {
            // Gunakan variabel c yang sudah dideklarasikan di luar blok try
            c = koneksiDB.BukaKoneksi();
            Statement st = c.createStatement();
            String sql = "SELECT * FROM belitiket " + where;
            ResultSet rs = st.executeQuery(sql);

            //dan tambahkan data ke dalam tabel
            while (rs.next()) {
                String IdPembelian = rs.getString("id_pembelian");
                String Nama = rs.getString("nama");
                String NoKursi = rs.getString("no_kursi");
                String Tanggal = rs.getString("tanggal");
                String Lokasi = rs.getString("lokasi");
                String Jurusan = rs.getString("jurusan");
                String Jumlah = rs.getString("jumlah");
                String TotalHarga = rs.getString("total_harga");
                Object[] data = {IdPembelian, Nama, NoKursi, Tanggal, Lokasi, Jurusan, Jumlah, TotalHarga};
                model.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Jangan biarkan exception tanpa tindakan
        } finally {
            // Tutup koneksi di blok finally agar pastikan koneksi ditutup, bahkan jika terjadi exception
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void HapusData() {
        if (ID > 0) {
            try {
                Object[] tombol = {"YA", "Tidak"};
                int option = JOptionPane.showOptionDialog(this,
                        "Apakah anda ingin menghapus data?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, tombol, 0);
                if (option == 0) {
                    // Hapus data dari tabel utama
                    Connection c = koneksiDB.BukaKoneksi();
                    Statement st = c.createStatement();
                    String sql = "DELETE FROM belitiket WHERE id_pembelian='" + ID + "'";
                    // Eksekusi query
                    st.executeUpdate(sql);
                    
                    ViewData("");
                }
            } catch (HeadlessException | SQLException e) {
                System.err.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih Data");
        }
    }
}