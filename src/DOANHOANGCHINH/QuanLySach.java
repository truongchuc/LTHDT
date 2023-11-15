package DOANHOANGCHINH;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    public ArrayList<Sach> dsSach = new ArrayList<Sach>();
    SachDao obj = new SachDao();
   static Scanner sc = new Scanner(System.in);

    public void KhoiTao() {

        for (int i = 0; i < 2; i++) {
            try {
                System.out.print("Nhập mã Sách:");
                String maSach = sc.nextLine();

                System.out.print("Nhập tên Sách:");
                String tenSach = sc.nextLine();

                Sach sach = new Sach(maSach, tenSach);
                dsSach.add(sach);
            } catch (Exception e) {
                System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
                sc.nextLine();
                i--;
            }
            System.out.println("=================");
        }

//        obj.ghiFile(dsSach);
//        sc.close();
    }

    public void docfile() {
        SachDao obj = new SachDao();
        dsSach = obj.docFile("D:\\BT PhuXuan\\BT LTHDT\\dssach1.bin");
    }

    public void hienthi() {
        for (Sach sach : dsSach) {
            String formattedOutput = String.format("Mã Sách: %2s  Tên Sách: %-25s%n", sach.getMaSach(),
                    sach.getTenSach());
            System.out.print(formattedOutput);
        }
    }

    public void chen() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập mã Sách :");
            String maSach = sc.nextLine();

            // Kiểm tra xem mã Sách đã tồn tại hay chưa
            if (kiemTraTonTaiMaSach(maSach)) {
                System.out.println("Mã sách đã tồn tại. Sách không được chèn.");
                return;
            }

            System.out.print("Nhập tên Sách :");
            String tenSach = sc.nextLine();

            Sach sach = new Sach(maSach, tenSach);
            dsSach.add(sach);
            System.out.println("Sách đã được chèn vào danh sách.");
        } catch (Exception e) {
            System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
            sc.nextLine();
        }
    }

    // Hàm kiểm tra mã sách đã tồn tại hay chưa
    private boolean kiemTraTonTaiMaSach(String maSach) {
        for (Sach sach : dsSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return true; // Mã sách đã tồn tại
            }
        }
        return false; // Mã sách chưa tồn tại
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên Sách cần xóa: ");
        String tenSach = sc.nextLine();
        for (int i = 0; i < dsSach.size(); i++) {
            if (dsSach.get(i).getTenSach().equals(tenSach)) {
                dsSach.remove(i);
            }
        }
        System.out.println("Danh Sách sau khi xóa Sách!!!");
    }

    public void suaThongTinSach(String id) {
        Scanner sc = new Scanner(System.in);
        boolean timThay = false;

        try {
            System.out.println("Sửa thông tin cho Sách có ID " + id);
            for (Sach sach : dsSach) {
                if (sach.getMaSach().equals(id)) {
                    timThay = true;
                    System.out.print("Nhập mã Sách:");
                    String maSachMoi = sc.nextLine();
                    System.out.print("Nhập tên Sách:");
                    String tenSachMoi = sc.nextLine();

                    // Cập nhật thông tin của Sách
                    sach.setMaSach(maSachMoi);
                    sach.setTenSach(tenSachMoi);

                    System.out.println("Thông tin của Sách đã được cập nhật.");
                    break;
                }
            }

            if (!timThay) {
                System.out.println("Không tìm thấy Sách với ID " + id);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
            sc.nextLine();
        }
    }

    public Sach timSachTheoTen(String tenCanTim) {
        for (Sach sach : dsSach) {
            if (sach.getTenSach().equalsIgnoreCase(tenCanTim)) {
                String formattedOutput = String.format("Mã Sách: %2s  Tên Sách: %-25s%n", sach.getMaSach(),
                        sach.getTenSach());
                System.out.print(formattedOutput);
                return sach; // Trả về Sách nếu tên phù hợp
            }
        }
        System.out.println("Không tìm thấy Sách ");
        return null; // Trả về null nếu không tìm thấy Sách
    }
}
