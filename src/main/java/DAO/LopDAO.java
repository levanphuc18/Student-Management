package DAO;

import connectionSQL.connectSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.sinhvien;

public class LopDAO {
    public List<sinhvien> getAllClass() throws Exception {
        List<sinhvien> lstSinhvien = new ArrayList<>();
        String sql= "select distinct malop,tenlop from sinhvien";
        try (
                Connection con = connectSQL.openConnection();
                Statement stmt = con.createStatement();
                ResultSet rs= stmt.executeQuery(sql);
                ){
            while(rs.next()){
                sinhvien sv= new sinhvien();
                sv.setMalop(rs.getString("Malop"));
                sv.setTenlop(rs.getString("tenlop"));
//              lstmonhoc.add(new monhoc(rs.getString(1), rs.getString(2)));
                lstSinhvien.add(sv);
            }
            return lstSinhvien;
        } 
    }
    
    public List<sinhvien> getAllStudentByClass(String classID) throws Exception {
       List<sinhvien> lstSinhvien = new ArrayList<>();
        String sql = "select * from sinhvien where malop='" + classID+"'";
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
}
