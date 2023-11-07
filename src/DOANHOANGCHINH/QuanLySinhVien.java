package DOANHOANGCHINH;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	public ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();

	public void KhoiTao() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhập mã SV :");
			int maSV = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập tên SV :");
			String tenSV = sc.nextLine();
			System.out.println("Nhập Tuổi :");
			int tuoi = sc.nextInt();
			System.out.println("Nhập điểm trung bình :");
			float dtb = sc.nextFloat();
			SinhVien sv = new SinhVien(tenSV, tuoi, maSV, dtb);
			dssv.add(sv);
		}
	}

	public void hienthi() {
		for (SinhVien dssv : dssv) {
			String formattedOutput = String.format(
					"Mã sinh viên: %d\tTên sinh viên: %-30sTuổi: %d\tĐiểm trung bình: %.1f\tXếp loại: %-10sKết quả: %-10s",
					dssv.getMaSV(), dssv.getHoTen(), dssv.getTuoi(), dssv.getDtb(), dssv.getXepLoai(),
					dssv.getKetQua());
			System.out.println(formattedOutput);
		}
	}

	public void kq() {
		for (SinhVien sv : dssv) {
			if (sv.getDtb() >= 5)
				sv.setKetQua("Đậu");
			else
				sv.setKetQua("Rớt");
		}
	}

	public void xepLoai() {
		for (SinhVien sv : dssv) {
			float dtb = sv.getDtb();
			if (dtb >= 8) {
				sv.setXepLoai("Giỏi");
			} else if (dtb >= 7) {
				sv.setXepLoai("Khá");
			} else if (dtb >= 5) {
				sv.setXepLoai("Trung bình");
			} else {
				sv.setXepLoai("Kém");
			}
		}
	}

	public void chen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã SV :");
		int maSVmoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập tên SV :");
		String tenSVmoi = sc.nextLine();
		System.out.println("Nhập Tuổi :");
		int tuoimoi = sc.nextInt();
		System.out.println("Nhập điểm trung bình :");
		float dtbmoi = sc.nextFloat();

		// Tạo một đối tượng Student từ dữ liệu người dùng nhập
		SinhVien sv = new SinhVien(tenSVmoi, tuoimoi, maSVmoi, dtbmoi);

		System.out.print("Nhập vị trí cần chèn: ");
		int vt = sc.nextInt();
		vt = vt - 1;
		// Kiểm tra xem vị trí (vt) có hợp lệ hay không
		if (vt >= 0 && vt <= dssv.size()) {
			dssv.add(vt, sv);
			System.out.println("Sinh viên đã được chèn vào vị trí " + vt + " trong danh sách.");
		} else {
			System.out.println("Vị trí không hợp lệ. Sinh viên không được chèn.");
		}
	}

	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên Sinh Viên cần xóa: ");
		String ht = sc.nextLine();
		for (int i = 0; i < dssv.size(); i++) {
			if (dssv.get(i).getHoTen().equals(ht) == true)
				dssv.remove(i);
		}
		System.out.println("Danh Sách sau khi xóa HP!!!");
	}

	public void suaThongTinSinhVien(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sửa thông tin cho học phần có ID " + id);
		for (SinhVien dssv : dssv) {
			if (dssv.getMaSV() == id) {
				System.out.println("Nhập mã SV :");
				int maSVmoi = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập tên SV :");
				String tenSVmoi = sc.nextLine();
				System.out.println("Nhập Tuổi :");
				int tuoimoi = sc.nextInt();
				System.out.println("Nhập điểm trung bình :");
				float dtbmoi = sc.nextFloat();

				// Cập nhật thông tin của sinh viên
				dssv.setMaSV(maSVmoi);
				dssv.setHoTen(tenSVmoi);
				dssv.setTuoi(tuoimoi);
				dssv.setDtb(dtbmoi);

				System.out.println("Thông tin của Sinh Viên đã được cập nhật.");
				return; // Kết thúc khi tìm thấy sinh viên và cập nhật thông tin
			}
		}
		System.out.println("Không tìm thấy Sinh Viên với ID " + id);
	}

	public SinhVien timSinhVienTheoTen(String tenCanTim) {

		for (SinhVien dssv : dssv) {
			if (dssv.getHoTen().equals(tenCanTim)) {
				String formattedOutput = String.format(
						"Mã sinh viên: %d\tTên sinh viên: %-30sTuổi: %d\tĐiểm trung bình: %.1f\tXếp loại: %-10sKết quả: %-10s",
						dssv.getMaSV(), dssv.getHoTen(), dssv.getTuoi(), dssv.getDtb(), dssv.getXepLoai(),
						dssv.getKetQua());
				System.out.println(formattedOutput);
				return dssv; // Trả về sinh viên nếu tên phù hợp
			}
		}
		System.out.println("Không tìm thấy sinh viên ");
		return null; // Trả về null nếu không tìm thấy sinh viên
	}
}
