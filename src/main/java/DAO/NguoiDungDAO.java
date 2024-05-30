package DAO;

import connectionSQL.connectSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.nguoidung;

/**
 *
 * @author lvfuc
 */
public class NguoiDungDAO {
    public nguoidung checkLogin(String taikhoan, String matkhau)throws Exception{
        String sql="select * from nguoidung where taikhoan=? and matkhau=?";
        try(
            Connection con = connectSQL.openConnection();
            PreparedStatement stmt= con.prepareStatement(sql);
                ){
            stmt.setString(1, taikhoan);
            stmt.setString(2, matkhau);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                nguoidung nd = new nguoidung();
                nd.setTaikhoan(taikhoan);
                nd.setMatkhau(matkhau);
                return nd;
            }
        } catch (Exception e) {
        }
        return null ;
    }
    
    public boolean CreateND(nguoidung nd) throws Exception{
        String sql= "insert into nguoidung (taikhoan, matkhau) values (?,?)";
        try (
                Connection con = connectSQL.openConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                ){
            stmt.setString(1, nd.getTaikhoan());
            stmt.setString(2, nd.getMatkhau());
            return stmt.executeUpdate() >0;
    }
    }
}
