package gui;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DSDuAn {
    private List<DuAn> danhSachDuAn; // Danh sách các dự án của công ty
    
    // Constructor khởi tạo danh sách dự án và danh sách nhân viên
    public DSDuAn() {
        this.danhSachDuAn = new ArrayList<>();
    }
    public List<DuAn> getDanhSachDuAn() {
        return danhSachDuAn;
    }
    
    // c.1) Thêm mới dự án vào danh sách dự án của công ty
    public void themDuAn(String tenDA, String ngayThucHien) {
        
        DuAn duAnMoi = new DuAn(tenDA, ngayThucHien);
        danhSachDuAn.add(duAnMoi);
    }

    // c.2) Xóa dự án khỏi danh sách dự án của công ty
    public void xoaDuAn(String maDA) {
        DuAn duAnXoa = timDuAn(maDA);
        if (duAnXoa != null) {
            danhSachDuAn.remove(duAnXoa);
        }
    }

    // c.3) Chỉnh sửa thông tin dự án trong danh sách dự án của công ty
    public void suaThongTinDuAn(String maDA, String tenDAMoi, String ngayThucHienMoi) {
        DuAn duAnSua = timDuAn(maDA);
        if (duAnSua != null) {
            duAnSua.setTenDA(tenDAMoi);
            duAnSua.setNgayThucHien(ngayThucHienMoi);
        }
    }

    // c.4) Thêm, xóa nhân viên trong danh sách tham gia một dự án cụ thể
    public void themNhanVienVaoDuAn(String maDA, NhanVien nhanVienMoi) {
        DuAn duAn = timDuAn(maDA);
        if (duAn != null) {
            duAn.addNhanVien(nhanVienMoi);
        }
    }
    public void docFileVaThemDuAn(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each line has data separated by commas: tenDA,ngayThucHien
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String tenDA = parts[0].trim();
                    String ngayThucHien = parts[1].trim();
                    themDuAn(tenDA, ngayThucHien);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
    // Xóa nhân viên theo mã dự án
    public void xoaNhanVienKhoiDuAn(String maDA, NhanVien nhanVienXoa) {
        DuAn duAn = timDuAn(maDA);
        if (duAn != null) {
            duAn.searchNhanVienDuAn().remove(nhanVienXoa);
        }
    }

    // Phương thức tìm dự án theo mã
    private DuAn timDuAn(String maDA) {
        for (DuAn duAn : danhSachDuAn) {
            if (duAn.getMaDA().equals(maDA)) {
                return duAn;
            }
        }
        return null;
    }

    // Hiển thị danh sách các dự án hiện có
    public void hienThiDanhSachDuAn() {
        if (danhSachDuAn.isEmpty()) {
            System.out.println("Hiện tại không có dự án nào.");
        } else {
            for (DuAn duAn : danhSachDuAn) {
                System.out.println(duAn);
            }
        }
    }
}
