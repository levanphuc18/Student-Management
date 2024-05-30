
package DAO;
import connectionSQL.connectSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.sinhvien;

public class SinhVienDAO {
    
    public List<sinhvien> getAllSV() throws Exception {
        List<sinhvien> lstSinhvien = new ArrayList<>();
        String sql = "select * from SinhVien";
        try (
            Connection con = connectSQL.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
                while (rs.next()) {
                sinhvien sv = new sinhvien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoten(rs.getString("Hoten"));
                sv.setMalop(rs.getString("Malop"));
                sv.setTenlop(rs.getString("Tenlop"));
                sv.setEmail(rs.getString("Email"));
                sv.setSoDT(rs.getString("SoDT"));
                sv.setDiachi(rs.getString("Diachi"));
                lstSinhvien.add(sv);
            }
            return lstSinhvien;
        }
    }
    
        public boolean Insert(sinhvien sv)throws Exception{
        String sql= "insert into SinhVien(MaSV,Hoten,Malop,Tenlop,Email,SoDT,Diachi) values (?,?,?,?,?,?,?)";
        try (Connection con = connectSQL.openConnection();
            PreparedStatement stmt= con.prepareStatement(sql);)
        {
            stmt.setString(1, sv.getMaSV());
            stmt.setString(2, sv.getHoten());
            stmt.setString(3, sv.getMalop());
            stmt.setString(4, sv.getTenlop());
            stmt.setString(5, sv.getEmail());
            stmt.setString(6, sv.getSoDT());
            stmt.setString(7, sv.getDiachi());
            
            return stmt.executeUpdate() >0;
        }
        
    }
        
        public boolean Update(sinhvien sv)throws Exception{
            String sql= "Update SinhVien set Hoten =?, Malop = ? ,Tenlop =? ,Email=?,SoDT=?,Diachi=? where MaSV=?";
        try (Connection con = connectSQL.openConnection();
            PreparedStatement stmt= con.prepareStatement(sql);)
        {
            stmt.setString(7, sv.getMaSV());
            stmt.setString(1, sv.getHoten());
            stmt.setString(2, sv.getMalop());
            stmt.setString(3, sv.getTenlop());
            stmt.setString(4, sv.getEmail());
            stmt.setString(5, sv.getSoDT());
            stmt.setString(6, sv.getDiachi());
            
            return stmt.executeUpdate() >0;
        } 
    }
   
        public sinhvien Find(String MaSV)throws Exception{

            String sql= "select * from sinhvien where masv=?";
        try (Connection con = connectSQL.openConnection();
            PreparedStatement stmt= con.prepareStatement(sql);)
        {
            stmt.setString(1, MaSV);
            ResultSet rs = stmt.executeQuery();
             if (rs.next()) {
                sinhvien sv = new sinhvien();
                
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoten(rs.getString("Hoten"));
                sv.setMalop(rs.getString("Malop"));
                sv.setTenlop(rs.getString("Tenlop"));
                sv.setEmail(rs.getString("Email"));
                sv.setSoDT(rs.getString("SoDT"));
                sv.setDiachi(rs.getString("Diachi"));
            return sv;
            }
             return null;
        }
    }
        
        public boolean Delete(String maSV) throws Exception {
            String sql = "delete from SinhVien where MaSV= ?";
        try (
            Connection con = connectSQL.openConnection();  
            PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, maSV);
            return pstm.executeUpdate() > 0;
        }
    }
}
