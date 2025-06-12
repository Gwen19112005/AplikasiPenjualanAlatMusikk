/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import config.Koneksi;
import java.util.List;
import model.Model_DetPemesanan;
import model.Model_barang;
import service.Service_DetPemesanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import model.Model_distributor;
import model.Model_pemesanan;
import model.Model_pengguna;

/**
 *
 * @author RVNOLDYVX
 */
public class DAO_DetPemesanan implements Service_DetPemesanan{
    
  private Connection conn;
  
  public DAO_DetPemesanan() {
       conn = Koneksi.getConnection();
  }

    @Override
    public void tambahData(Model_DetPemesanan mod_detpesan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sumTotal(Model_DetPemesanan mod_detpesan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusSementara(Model_DetPemesanan mod_detpesan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Model_DetPemesanan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_DetPemesanan> getData(String id) {
        List<Model_DetPemesanan> list = new ArrayList<>();
         String sql = "SELECT det_psn.no_pesan, det_psn.kode_barang, brg.nama_barang, "
                   + "brg.harga, det_psn.jml_pesan, det_psn.subtotal_pesan, det_psn.status "
                   + "FROM detail_pemesanan det_psn "
                   + "INNER JOIN pemesanan psn ON psn.no_pesan = det_psn.no_pesan "
                   + "INNER JOIN barang brg ON brg.kode_barang = det_psn.kode_barang "
                   + "WHERE det_psn.no_pesan = ? ORDER BY det_psn.no_pesan ASC";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, id);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Model_pemesanan psn = new Model_pemesanan();
                    Model_barang brg = new Model_barang(); // Perbaikan nama kelas
                    Model_DetPemesanan det_psn = new Model_DetPemesanan();
                    psn.setNo_pesan(rs.getString("no_pesan"));

                    brg.setKode_Barang(rs.getString("kode_barang"));
                    brg.setNama_barang(rs.getString("nama_barang"));
                    brg.setHarga(rs.getLong("harga"));

                    det_psn.setMod_pesan(psn); // Perbaikan: setMod_pesan bukan setModel_pemesanan
                    det_psn.setMod_barang(brg); // Perbaikan: setMod_barang bukan setModel_barang
                    det_psn.setJml_pesan(rs.getLong("jml_pesan"));
                    det_psn.setSubTotal(rs.getLong("subtotal_pesan")); // Perbaikan: setSubTotal bukan setSubtotal_pesan
                    det_psn.setStatus(rs.getString("status"));

                    list.add(det_psn);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Model_DetPemesanan> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}