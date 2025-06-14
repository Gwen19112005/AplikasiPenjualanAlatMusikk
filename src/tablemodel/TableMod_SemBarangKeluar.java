/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_semBarangkeluar;

/**
 *
 * @author MSI GAMING
 */
public class TableMod_SemBarangKeluar extends AbstractTableModel {
    
     private List<Model_semBarangkeluar> list = new ArrayList<>();
    
    public void tambahData(Model_semBarangkeluar mod_keluar){
      list.add(mod_keluar);
      fireTableRowsInserted(list.size() -1, list.size() -1);
      JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_semBarangkeluar mod_keluar ){
      list.add(row, mod_keluar);
      fireTableDataChanged();
      JOptionPane.showMessageDialog(null, "Data berhasil diperbarui");
    }
    public void hapusData (int index) {
      list.remove(index);
      fireTableRowsDeleted(index, index);
      JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
    } 
    public void clear(){
      list.clear();
      fireTableDataChanged();
    }
    
    public void setData(List<Model_semBarangkeluar> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    public void setData (int index, Model_semBarangkeluar mod_keluar) {
        list.set(index, mod_keluar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_semBarangkeluar getData (int index){
        return list.get(index);
    }
    
    
    @Override
    public int getRowCount() {
       
    return list.size();
       
    }

    @Override
    public int getColumnCount() {       
        return 6;   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {      
        switch (columnIndex){
            
          case 0: return list.get(rowIndex).getMod_barang().getKode_Barang();
          case 1: return list.get(rowIndex).getMod_barang().getNama_barang();
          case 2: return list.get(rowIndex).getMod_barang().getHarga();
          case 3: return list.get(rowIndex).getMod_detkeluar().getJml_keluar();
          case 4: return list.get(rowIndex).getMod_detkeluar().getSubtotal_keluar();
     
          
          
             
          default: return null;
        }       
     }   
    public String getColumnName(int column) {
        switch (column){
            case 0: return "Kode Alat Musik"; 
            case 1: return "Nama Alat Musik"; 
            case 2: return "Harga "; 
            case 3: return "Jumlah Keluar"; 
            case 4: return "Subtotal Keluar";
            
            
                        
            
            default: return null;
    }
    
    }
}

    


