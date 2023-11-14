package DOANHOANGCHINH2;

import java.util.Scanner;

public class CacMenu {
	QuanLyHocPhan obj = new QuanLyHocPhan();
	QuanLySinhVien svobj = new QuanLySinhVien();
	Scanner sc = new Scanner(System.in);

	public void menuSv() {
		int c1;
		do {
			System.out.println("<=== Quản lý Sinh Viên ==========================>");
			System.out.println("|1. Nhập Sinh Viên :				|");
			System.out.println("|2. Hiển thị Sinh Viên :			|");
			System.out.println("|3. Nhập tên Sinh Viên cần tìm :		|");
			System.out.println("|4. Chèn Sinh Viên :				|");
			System.out.println("|5. Xóa Sinh Viên :				|");
			System.out.println("|6. Sửa thông tin Sinh Viên :			|");
			System.out.println("|7. Sắp Xếp Sinh Viên theo DTB :		|");
			System.out.println("|8. Tìm Sinh Viên có DTB lớn nhất :		|");
			System.out.println("|9. Thoát menu Sinh Viên :			|");
			System.out.println("<================================================>");
			System.out.print("Chọn Chức năng :");
			c1 = sc.nextInt();
			sc.nextLine();
			switch (c1) {
			case 1:
				svobj.KhoiTao();
				break;
			case 2:
				svobj.xepLoai();
				svobj.kq();
				svobj.hienthi();
				break;
			case 3:
				System.out.println("Nhập tên sinh viên cần tìm :");
				String tencantim = sc.nextLine();
				svobj.timSinhVienTheoTen(tencantim);
				break;
			case 4:
				svobj.chen();
				svobj.xepLoai();
				svobj.kq();
				svobj.hienthi();
				break;
			case 5:
				svobj.remove();
				svobj.hienthi();
				break;
			case 6:
				System.out.println("Nhập mã mã sinh viên cần sửa thông tin:");
				int idcantim = sc.nextInt();
				svobj.suaThongTinSinhVien(idcantim);
				svobj.xepLoai();
				svobj.kq();
				svobj.hienthi();
				break;
			case 7:			
				svobj.sapXepTheoDTBGiamDan();
				svobj.xepLoai();
				svobj.kq();
				svobj.hienthi();
				break;
			case 8:		
				svobj.xepLoai();
				svobj.kq();
				svobj.hienthilonnhat();
				break;
			default:
				break;
			}
		} while (c1 < 9);
	}

	public void menuHp() {
		int c2;
		do {
	        System.out.println("<=== Quản lý Học Phần ==================>");
			System.out.println("|1. Đọc file :				|");
			System.out.println("|2. Hiển thị Học Phần :			|");
			System.out.println("|3. chèn Học Phần :			|");
			System.out.println("|4. xóa Học Phần :			|");
			System.out.println("|5. Sửa thông tin Học Phần :		|");
			System.out.println("|6. Tìm Học Phần bằng tên :		|");
			System.out.println("|7. Tìm Học Phần theo học kỳ :		|");
			System.out.println("|8. Sắp xếp Học Phần theo số tín chỉ :	|");
			System.out.println("|9. Thoát menu Học Phần :		|");
			System.out.println("<=======================================>");
			System.out.print("Chọn Chức năng :");
			c2 = sc.nextInt();
			sc.nextLine();
			switch (c2) {
			case 1:
				obj.KhoiTao();
				obj.docfile();
				break;
			case 2:
				obj.docfile();
				obj.hienthi();
				break;
			case 3:
				obj.chen();
				obj.hienthi();
				break;
			case 4:
				obj.remove();
				obj.hienthi();
				break;
			case 5:
				System.out.println("Nhập mã Học Phần cần sửa thông tin :");
				String mahpcantim = sc.nextLine();
				obj.suaThongTinHocPhan(mahpcantim);
				obj.hienthi();
				break;
			case 6:
				System.out.println("Nhập tên học phần cần tìm :");
				String tencantim = sc.nextLine();
				obj.timHocPhanTheoTen(tencantim);
				break;
			case 7:
				System.out.println("Nhập kỳ cho học phần cần tìm :");
				int hk = sc.nextInt();
				obj.timHocPhanTheoHocKy(hk);
				break;
			case 8:
				obj.sapXepTheoSoTinChiTangDan();
				obj.hienthi();
				break;
			default:
				break;
			}
		} while (c2 < 9);
	}
}
