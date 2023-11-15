package DOANHOANGCHINH;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNguoiDoc {
    public ArrayList<NguoiDoc> dsNguoiDoc = new ArrayList<NguoiDoc>();

    public void KhoiTao() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            try {
                int maNguoiDoc = 0;
                while (true) {
                    try {
                        System.out.print("Nhập mã Người Đọc:");
                        maNguoiDoc = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Mã người đọc không hợp lệ. Vui lòng nhập lại.");
                        sc.nextLine();
                    }
                }

                System.out.print("Nhập tên Người Đọc:");
                String tenNguoiDoc = sc.nextLine();

                int tuoi = 0;
                while (true) {
                    try {
                        System.out.print("Nhập Tuổi :");
                        tuoi = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
                        sc.nextLine();
                    }
                }

                NguoiDoc nguoiDoc = new NguoiDoc(tenNguoiDoc, tuoi, maNguoiDoc);
                dsNguoiDoc.add(nguoiDoc);
                System.out.println("=================");
            } catch (Exception e) {
                System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
                sc.nextLine();
                i--;
                sc.close();
            }
        }
    }

    public void hienthi() {
        for (NguoiDoc nguoiDoc : dsNguoiDoc) {
            String formattedOutput = String.format("Mã người đọc: %d\tTên người đọc: %-30sTuổi: %d",
                    nguoiDoc.getMaNguoiDoc(), nguoiDoc.getHoTen(), nguoiDoc.getTuoi());
            System.out.println(formattedOutput);
        }
    }

    public void chen() {
        Scanner sc = new Scanner(System.in);
        try {
            int maNguoiDocMoi = 0;
            while (true) {
                try {
                    System.out.print("Nhập mã Người Đọc:");
                    maNguoiDocMoi = sc.nextInt();
                    sc.nextLine();

                    boolean trungMaNguoiDoc = false;
                    for (NguoiDoc nguoiDoc : dsNguoiDoc) {
                        if (nguoiDoc.getMaNguoiDoc() == maNguoiDocMoi) {
                            trungMaNguoiDoc = true;
                            break;
                        }
                    }

                    if (trungMaNguoiDoc) {
                        System.out.println("Mã người đọc đã tồn tại. Vui lòng nhập lại.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Mã người đọc không hợp lệ. Vui lòng nhập lại.");
                    sc.nextLine();
                    sc.close();
                }
            }

            System.out.print("Nhập tên Người Đọc:");
            String tenNguoiDocMoi = sc.nextLine();

            int tuoiMoi = 0;
            while (true) {
                try {
                    System.out.print("Nhập Tuổi :");
                    tuoiMoi = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
                    sc.nextLine();
                }
            }

            int vt = 0;
            while (true) {
                try {
                    System.out.print("Nhập vị trí cần chèn: ");
                    vt = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Vị trí không hợp lệ. Vui lòng nhập lại.");
                    sc.nextLine();
                }
            }

            NguoiDoc nguoiDocMoi = new NguoiDoc(tenNguoiDocMoi, tuoiMoi, maNguoiDocMoi);
            vt = vt - 1;

            if (vt >= 0 && vt <= dsNguoiDoc.size()) {
                dsNguoiDoc.add(vt, nguoiDocMoi);
                System.out.println("Người Đọc đã được chèn vào vị trí " + vt + " trong danh sách.");
            } else {
                System.out.println("Vị trí không hợp lệ. Người Đọc không được chèn.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
            sc.nextLine();
        }
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã Người Đọc cần xóa: ");
        int id = sc.nextInt();
        for (int i = 0; i < dsNguoiDoc.size(); i++) {
            if (dsNguoiDoc.get(i).getMaNguoiDoc() == id)
                dsNguoiDoc.remove(i);
        }
        System.out.println("Danh Sách sau khi xóa Người Đọc!!!");
        
    }
    public NguoiDoc timNguoiDocTheoTen(String tenCanTim) {
        for (NguoiDoc dsNguoiDoc : dsNguoiDoc) {
            if (dsNguoiDoc.getHoTen().equals(tenCanTim)) {
                String formattedOutput = String.format(
                    "Mã người đọc: %d\tTên người đọc: %-30sTuổi: %d",
                    dsNguoiDoc.getMaNguoiDoc(), dsNguoiDoc.getHoTen(), dsNguoiDoc.getTuoi());
                System.out.println(formattedOutput);
                return dsNguoiDoc; // Trả về người đọc nếu tên phù hợp
            }
        }
        System.out.println("Không tìm thấy người đọc ");
        return null; // Trả về null nếu không tìm thấy người đọc
    }
    public void suaThongTinNguoiDoc(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sửa thông tin cho người đọc có ID " + id);
        for (NguoiDoc nguoiDoc : dsNguoiDoc) {
            if (nguoiDoc.getMaNguoiDoc() == id) {
                try {
                    int maNguoiDocmoi = 0;
                    while (true) {
                        try {
                            System.out.print("Nhập mã Người Đọc:");
                            maNguoiDocmoi = sc.nextInt();
                            sc.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("Mã Người đọc không hợp lệ. Vui lòng nhập lại.");
                            sc.nextLine();
                        }
                    }

                    System.out.print("Nhập tên Người Đọc:");
                    String tenNguoiDocmoi = sc.nextLine();

                    int tuoimoi = 0;
                    while (true) {
                        try {
                            System.out.print("Nhập Tuổi :");
                            tuoimoi = sc.nextInt();
                            sc.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
                            sc.nextLine();
                        }
                    }

                    nguoiDoc.setMaNguoiDoc(maNguoiDocmoi);
                    nguoiDoc.setHoTen(tenNguoiDocmoi);
                    nguoiDoc.setTuoi(tuoimoi);
                } catch (Exception e) {
                    System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
                    sc.nextLine();
                }

                // Cập nhật thông tin của người đọc

                System.out.println("Thông tin của Người Đọc đã được cập nhật.");
                return; // Kết thúc khi tìm thấy người đọc và cập nhật thông tin
            }
        }
        System.out.println("Không tìm thấy Người Đọc với ID " + id);
    }
  
    }
