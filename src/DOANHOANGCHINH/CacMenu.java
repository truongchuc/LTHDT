package DOANHOANGCHINH;

import java.util.Scanner;
import DOANHOANGCHINH.QuanLyNguoiDoc;
import DOANHOANGCHINH.QuanLySach;

public class CacMenu {
    QuanLySach obj = new QuanLySach();
    QuanLyNguoiDoc ndobj = new QuanLyNguoiDoc();
    Scanner sc = new Scanner(System.in);

    public void menuNd() {
        int c1;
        do {
            System.out.println("<=== Quản lý Người Đọc ===========================>");
            System.out.println("|1. Nhập Người Đọc :                            |");
            System.out.println("|2. Hiển thị Người Đọc :                        |");
            System.out.println("|3. Nhập tên Người Đọc cần tìm :                |");
            System.out.println("|4. Chèn Người Đọc :                            |");
            System.out.println("|5. Xóa Người Đọc :                             |");
            System.out.println("|6. Sửa thông tin Người Đọc :                   |");
            System.out.println("|7. Thoát menu Người Đọc :                      |");
            System.out.println("<===================================================>");
            System.out.print("Chọn Chức năng :");
            c1 = sc.nextInt();
            sc.nextLine();
            switch (c1) {
                case 1:
                    ndobj.KhoiTao();
                    break;
                case 2:
                    ndobj.hienthi();
                    break;
                case 3:
                    System.out.println("Nhập tên người đọc cần tìm :");
                    String tencantim = sc.nextLine();
                    ndobj.timNguoiDocTheoTen(tencantim);
                    break;
                case 4:
                    ndobj.chen();
                    ndobj.hienthi();
                    break;
                case 5:
                    ndobj.remove();
                    ndobj.hienthi();
                    break;
                case 6:
                    System.out.println("Nhập mã người đọc cần sửa thông tin:");
                    int idcantim = sc.nextInt();
                    ndobj.suaThongTinNguoiDoc(idcantim);
                    ndobj.hienthi();
                    break;
                default:
                    break;
            }
        } while (c1 < 7);
    }

    public void menuSach() {
        int c2;
        do {
            System.out.println("<=== Quản lý Sách ============================>");
            System.out.println("|1. Nhập Sách :                              |");
            System.out.println("|2. Hiển thị Sách :                          |");
            System.out.println("|3. Nhập tên Sách cần tìm :                  |");
            System.out.println("|4. Chèn Sách :                              |");
            System.out.println("|5. Xóa Sách :                               |");
            System.out.println("|6. Sửa thông tin Sách :                     |");
            System.out.println("|7. Thoát menu Sách :                        |");
            System.out.println("<=============================================>");
            System.out.print("Chọn Chức năng :");
            c2 = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (c2) {
                case 1:
                    obj.KhoiTao();
                    break;
                case 2:
                    obj.hienthi();
                    break;
                case 3:
                    System.out.println("Nhập tên sách cần tìm :");
                    String tencantim = sc.nextLine();
                    obj.timSachTheoTen(tencantim);
                    break;
                case 4:
                    obj.chen();
                    obj.hienthi();
                    break;
                case 5:
                    obj.remove();
                    obj.hienthi();
                    break;
                case 6:
                    System.out.println("Nhập mã sách cần sửa thông tin :");
                    String masachcantim = sc.nextLine();
                    obj.suaThongTinSach(masachcantim);
                    obj.hienthi();
                    break;
                default:
                    break;
            }
        } while (c2 < 7);

    }
}
