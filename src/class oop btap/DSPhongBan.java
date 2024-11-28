package gui;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DSPhongBan {
    private List<PhongBan> danhSachPhongBan; // Danh sách phòng ban của công ty

    // Constructor khởi tạo danh sách phòng ban
    public DSPhongBan() {
        this.danhSachPhongBan = new ArrayList<>();
    }

    // b.1) Thêm mới phòng ban vào danh sách phòng ban của công ty
    public void themPhongBan(String tenPhongBan) {
        PhongBan phongBanMoi = new PhongBan(tenPhongBan);
        danhSachPhongBan.add(phongBanMoi);
    }

    // b.2) Xóa phòng ban khỏi danh sách phòng ban của công ty
    public void xoaPhongBan(String maPhongBan) {
        PhongBan phongBanXoa = timPhongBan(maPhongBan);
        if (phongBanXoa != null) {
            danhSachPhongBan.remove(phongBanXoa);
        }
    }

    // b.3) Chỉnh sửa thông tin phòng ban trong danh sách phòng ban của công ty
    public void suaThongTinPhongBan(String maPhongBan, String tenPhongBanMoi) {
        PhongBan phongBanSua = timPhongBan(maPhongBan);
        if (phongBanSua != null) {
            phongBanSua.setTenPhongBan(tenPhongBanMoi);
        }
    }

    // b.4) Thêm, xóa trưởng phòng khỏi một phòng ban cụ thể
    public void themTruongPhong(String maPhongBan, NhanVien truongPhong) {
        PhongBan phongBan = timPhongBan(maPhongBan);
        if (phongBan != null) {
            phongBan.addNhanVien(truongPhong);
        }
    }

    public void xoaTruongPhong(String maPhongBan, NhanVien truongPhong) {
        PhongBan phongBan = timPhongBan(maPhongBan);
        if (phongBan != null) {
            phongBan.searchNhanVienPhongBan().remove(truongPhong);
        }
    }

    // Phương thức tìm phòng ban theo mã
    private PhongBan timPhongBan(String maPhongBan) {
        for (PhongBan pb : danhSachPhongBan) {
            if (pb.getMaPhongBan().equals(maPhongBan)) {
                return pb;
            }
        }
        return null;
    }

    // Hiển thị danh sách phòng ban hiện có
    public void hienThiDanhSachPhongBan() {
        if (danhSachPhongBan.isEmpty()) {
            System.out.println("Hiện tại không có phòng ban nào.");
        } else {
            for (PhongBan pb : danhSachPhongBan) {
                System.out.println(pb);
            }
        }
    }
}
