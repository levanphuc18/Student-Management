
package model;


public class sinhvien {
    private String Malop;
    private String Tenlop;
    private String MaSV;
    private String Hoten;
    private String Email;
    private String SoDT;
    private String Diachi;

    public sinhvien() {
    }

    public sinhvien(String Malop, String Tenlop, String MaSV, String Hoten, String Email, String SoDT, String Diachi) {
        this.Malop = Malop;
        this.Tenlop = Tenlop;
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SoDT = SoDT;
        this.Diachi = Diachi;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String Tenlop) {
        this.Tenlop = Tenlop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
  
    
}
