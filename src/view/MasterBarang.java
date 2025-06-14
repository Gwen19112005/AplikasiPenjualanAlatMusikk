/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.List;
import dao.DAO_Barang;

import javax.swing.JOptionPane;
import model.Model_barang;
import model.Model_jenis_barang;
import service.Service_barang;
import tablemodel.TableMod_Barang;




/**
 *
 * @author RVNOLDYVX
 */
public class MasterBarang extends javax.swing.JPanel {

    private Service_barang servis = new DAO_Barang();
    private TableMod_Barang tblModel = new TableMod_Barang();
    
     
    public MasterBarang() {
        initComponents();
        
        tabel_barang.setModel(tblModel);
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("uncheckd")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        JScrollPanel = new javax.swing.JScrollPane();
        tabel_barang = new custom.Tablecustom();
        jLabel2 = new javax.swing.JLabel();
        bt_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        t_cari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tambahData = new javax.swing.JPanel();
        L_databarang2 = new javax.swing.JLabel();
        bt_tambah1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_kodeBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_kodejenisbarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_namajenisbarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbx_satuan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        t_namabarang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t_harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_stok = new javax.swing.JTextField();
        bt_jenisBarang = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabel_barang.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabel_barangAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        JScrollPanel.setViewportView(tabel_barang);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Data Barang");

        bt_tambah.setText("TAMBAH");
        bt_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        t_cari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_cari.setText("Pencarian");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_brg/pencarian 2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(bt_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2))
                    .addComponent(JScrollPanel))
                .addGap(29, 29, 29))
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addComponent(JScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        L_databarang2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        L_databarang2.setText("Data Barang");

        bt_tambah1.setText("Tambah");
        bt_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambah1ActionPerformed(evt);
            }
        });

        btn_batal1.setText("BATAL");
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Kode Alat Musik");

        t_kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_kodeBarangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Jenis Alat Musik");

        t_kodejenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_kodejenisbarangActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nama Jenis Alat Musik");

        t_namajenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namajenisbarangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Satuan");

        cbx_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Kelompok Alat Musik -", "Ansambel", "Orkes", "Tradisonal" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nama Alat Musik");

        t_namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namabarangActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Harga");

        t_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_hargaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Stok");

        t_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_stokActionPerformed(evt);
            }
        });

        bt_jenisBarang.setText("Pilih");
        bt_jenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_jenisBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_kodeBarang)
                    .addComponent(t_namajenisbarang)
                    .addComponent(t_namabarang)
                    .addComponent(cbx_satuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_harga)
                    .addComponent(t_stok)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 643, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t_kodejenisbarang)
                        .addGap(18, 18, 18)
                        .addComponent(bt_jenisBarang)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_jenisBarang)
                    .addComponent(t_kodejenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(t_namajenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(t_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(t_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_databarang2)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(L_databarang2)
                        .addGap(18, 18, 18)
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(tambahData, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
        loadData();
        
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void bt_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambah1ActionPerformed
        if (bt_tambah1.getText().equals("TAMBAH")) {
            bt_tambah1.setText("SIMPAN");
            t_kodeBarang.setText(servis.nomor());
        }
        else if (bt_tambah1.getText().equals("SIMPAN")) {
            simpanData();
        }
        else if (bt_tambah1.getText().equals("PERBARUI")) {
            perbaruiData();
        }
    }//GEN-LAST:event_bt_tambah1ActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void bt_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        bt_tambah1.setText("SIMPAN");
        bt_jenisBarang.setEnabled(true);
        t_kodeBarang.setEnabled(false);
        t_kodeBarang.setText(servis.nomor());
        
        if(bt_tambah.getText().equals("UBAH"))
        {
            dataTabel();
        }
    }//GEN-LAST:event_bt_tambahActionPerformed

    private void t_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_stokActionPerformed

    private void t_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_hargaActionPerformed

    private void t_namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namabarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namabarangActionPerformed

    private void t_namajenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namajenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namajenisbarangActionPerformed

    private void t_kodejenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_kodejenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_kodejenisbarangActionPerformed

    private void t_kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_kodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_kodeBarangActionPerformed

    private void tabel_barangAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabel_barangAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_barangAncestorAdded

    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        if(bt_tambah.getText().equals("TAMBAH")) 
        {
            bt_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tabel_barangMouseClicked

    private void bt_jenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_jenisBarangActionPerformed
        boolean closable = true;
        Datajenisbarang djb = new Datajenisbarang(null, closable);
        djb.setVisible(true);
   
        t_kodejenisbarang.setText(djb.jb.getKode_jenis());
        t_namajenisbarang.setText(djb.jb.getNama_jenis());
        
        t_kodejenisbarang.setEnabled(false);
        t_namajenisbarang.setEnabled(false);
        
        t_namabarang.requestFocus();
        aktif();
        
        
    }//GEN-LAST:event_bt_jenisBarangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        pencarian();
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPanel;
    private javax.swing.JLabel L_databarang2;
    private javax.swing.JButton bt_jenisBarang;
    private javax.swing.JButton bt_tambah;
    private javax.swing.JButton bt_tambah1;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JComboBox<String> cbx_satuan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_kodeBarang;
    private javax.swing.JTextField t_kodejenisbarang;
    private javax.swing.JTextField t_namabarang;
    private javax.swing.JTextField t_namajenisbarang;
    private javax.swing.JTextField t_stok;
    private custom.Tablecustom tabel_barang;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
    btn_hapus.setVisible(false);
    btn_batal.setVisible(false);
    List<Model_barang> list = servis.getData();
    tblModel.setData(list);

}

    private void dataTabel() {
        tampilData.setVisible(false);
        tambahData.setVisible(true);
        
        int row = tabel_barang.getSelectedRow();
        L_databarang2.setText("Perbarui data barang");
        
        t_kodeBarang.setEnabled(false);
        t_kodejenisbarang.setEnabled(true);
        t_namajenisbarang.setEnabled(true);
        
        t_kodeBarang.setText        (tabel_barang.getModel().getValueAt(row, 1).toString());
        t_kodejenisbarang.setText   (tabel_barang.getModel().getValueAt(row, 2).toString());
        t_namajenisbarang.setText   (tabel_barang.getModel().getValueAt(row, 3).toString());
        t_namabarang.setText        (tabel_barang.getModel().getValueAt(row, 4).toString());
        cbx_satuan.setSelectedItem  (tabel_barang.getModel().getValueAt(row, 5).toString());
        t_harga.setText             (tabel_barang.getModel().getValueAt(row, 6).toString());
        t_stok.setText              (tabel_barang.getModel().getValueAt(row, 7).toString());
        
        aktif();
        bt_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }

    private void hapusData() {
       int index = tabel_barang.getSelectedRow();
       if (index!=-1) {
           Model_barang brg = tblModel.getData(tabel_barang.convertRowIndexToModel(index));
           if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus", "konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
               servis.hapusData(brg);
               tblModel.hapusData(index);
               loadData();
               resetForm();
           }
       }else{
           JOptionPane.showMessageDialog(null, "Pilih dahulu yang akan di update");
       }
    }

    private void tampilPanel() {
        mainPanel.removeAll();
        mainPanel.add(new MasterBarang());
        mainPanel.repaint();
        mainPanel.revalidate();
    }

   
    
    private void aktif() {
        t_namabarang.setEnabled(true);
        t_namajenisbarang.setEnabled(true);
        cbx_satuan.setEnabled(true);
        t_harga.setEnabled(true);
        t_stok.setEnabled(true);
    }

    private void simpanData() {
          if(validasiInput()==true) {
            String kode_Barang = t_kodeBarang.getText();                                                                                         
            String kode_jenis = t_kodejenisbarang.getText();
            String nama_jenisbarang = t_namajenisbarang.getText();
            String nama_barang = t_namabarang.getText();
            String satuan = cbx_satuan.getSelectedItem().toString();
            Long  harga = Long.parseLong(t_harga.getText());
            int stok = Integer.parseInt(t_stok.getText()); 
            
            Model_barang brg = new Model_barang();
            Model_jenis_barang jbr = new Model_jenis_barang();
            
            brg.setKode_Barang(kode_Barang);
            jbr.setKode_jenis(kode_jenis);
            jbr.setNama_jenis(nama_jenisbarang);
            brg.setNama_barang(nama_barang);
            brg.setSatuan(satuan);
            brg.setHarga(harga);
            brg.setStok(stok);
            
            brg.setJns_barang(jbr);
            
            servis.tambahData(brg);
            tblModel.tambahData( brg);
            loadData();
            resetForm();
            tampilPanel();
            bt_tambah.setText("TAMBAH");
            
        }
    }
  
    
    private void perbaruiData() {
      
            int index = tabel_barang.getSelectedRow();
            if (index != -1) {
            Model_barang mobar = tblModel.getData(tabel_barang.convertRowIndexToModel(index));

        if (validasiInput() == true) {
            String kode_barang = t_kodeBarang.getText();
            String kode_jenis = t_kodejenisbarang.getText();
            //String nama_jenis = t_namajenisbarang.getText();
            String nama_barang = t_namabarang.getText();
            String satuan = cbx_satuan.getSelectedItem().toString();
            long harga = Long.parseLong(t_harga.getText());
            int stok = Integer.parseInt(t_stok.getText());

            Model_barang brg = new Model_barang();
            Model_jenis_barang jbr = new Model_jenis_barang();

            jbr.setKode_jenis(kode_jenis);
            //jbr.setNama_jenis(nama_jenis);
            brg.setKode_Barang(kode_barang);
            brg.setNama_barang(nama_barang);
            brg.setSatuan(satuan);
            brg.setHarga(harga);
            brg.setStok(stok);
            
            brg.setJns_barang(jbr);

            
            servis.perbaruiData(brg);
            tblModel.perbaruiData(index, mobar);
            loadData();
            resetForm();
            tampilPanel();
        }
    }


        
    }

    private boolean validasiInput() {
    boolean valid = false;
    if (t_kodeBarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Kode Barang tidak boleh kosong");
    } else if (t_kodejenisbarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Kode Jenis Barang tidak boleh kosong");
    } else if (t_namajenisbarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Nama Barang tidak boleh kosong");
    } else if (t_namabarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Nama Barang tidak boleh kosong");
    } else if (cbx_satuan.getSelectedItem().equals(null)) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Satuan tidak boleh kosong");
    } else if (t_harga.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Harga tidak boleh kosong");
    } else if (t_stok.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(javax.swing.JOptionPane.getRootFrame(), "Stok tidak boleh kosong");
    } else {
        valid = true;
    }
    return valid;
}


    private void resetForm() {
       bt_tambah.requestFocus();
       bt_tambah.setText("TAMBAH");
       t_kodeBarang.setText("");
       t_kodejenisbarang.setText("");
       t_namajenisbarang.setText("");
       t_namabarang.setText("");
       cbx_satuan.setSelectedItem(0);
       t_harga.setText("");
       t_stok.setText("");
    }

    private void pencarian() {
        List<Model_barang> list = servis.pencarian(t_cari.getText());
        tblModel.setData(list);
    }
}
