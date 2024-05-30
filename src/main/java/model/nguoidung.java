
package model;

public class nguoidung {
    private String Taikhoan;
    private String Matkhau;

    public nguoidung() {
    }

    public nguoidung(String Taikhoan, String Matkhau) {
        this.Taikhoan = Taikhoan;
        this.Matkhau = Matkhau;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }
    
}
