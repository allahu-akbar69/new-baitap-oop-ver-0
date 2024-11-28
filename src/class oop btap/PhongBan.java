package gui;

import java.util.*;

public class PhongBan {
    static Scanner sc = new Scanner(System.in); //biến scanner để nhập giữ liệu từ bàn phím.
    static int cnt = 1; //Biến đếm tĩnh, dùng để tạo mã phòng ban (MaPhongBan) tự động tăng dần.
    private List<NhanVien> DSNhanVien = new ArrayList<>();// dùng arraylist để lưu (quản lí) nhân viên
    private String MaPhongBan, TenPhongBan;// thuộc tính mã phòng ban, tên phòng ban.
    // Constructor không tham số: khởi tạo các thuộc tính bán đầu là rỗng.
    public PhongBan() {
        this.MaPhongBan = null;
        this.TenPhongBan = null;
    }

    //Constructor có tham số, khởi tạo mã phòng ban tăng dần theo mẫu, tên phòng ban.
    PhongBan(String TenPhongBan) {
        this.MaPhongBan = "PB" + String.format("%02d", cnt++);
        this.TenPhongBan = chuanHoaTenPhongBan(TenPhongBan);
    }

    // phương thức thêm nhân viên vào phòng ban.
    public void addNhanVien(NhanVien x) {
        DSNhanVien.add(x);
    }

    // phương thức trả về mã phòng ban
    public String getMaPhongBan() {
        return this.MaPhongBan;
    }

    // phương thức trả về tên phòng ban
    public String getTenPhongBan() {
        return this.TenPhongBan;
    }

    public String chuanHoaTenPhongBan(String s){
        s="";
        String[] tmp= this.TenPhongBan.split("\\s+");
        for(String x:tmp){
            s+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return s.trim();
    }
    // phương thức thiết lập tên phòng ban
    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    // phương thức trả về danh sách nhân viên thuộc phòng ban cần tìm
    public List<NhanVien> searchNhanVienPhongBan() {
        DSNhanVien.sort(Comparator.comparing(NhanVien::getMaNV)); // sắp xếp theo thứ tự từ điển của mã nhân viên
        return DSNhanVien;
    }
    // phương thức trả thông tin phòng ban theo dạng chuỗi
    @Override
    public String toString() {
        return MaPhongBan + " " + TenPhongBan;
    }
}
