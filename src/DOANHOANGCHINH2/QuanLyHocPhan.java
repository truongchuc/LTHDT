package DOANHOANGCHINH2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLyHocPhan {
	public ArrayList<HocPhan> dshp = new ArrayList<HocPhan>();

	HocPhanDao obj = new HocPhanDao();

	/*
	 * public void KhoiTao() { Scanner sc = new Scanner(System.in); for (int i = 0;
	 * i < 2; i++) { try { System.out.println("Nhập mã Học Phần:"); String maHp =
	 * sc.nextLine(); System.out.println("Nhập tên Học Phần:"); String tenHp =
	 * sc.nextLine(); System.out.println("Nhập số tín chỉ:"); int soTc =
	 * sc.nextInt(); sc.nextLine(); System.out.println("Nhập học kỳ:"); int hk =
	 * sc.nextInt(); sc.nextLine(); HocPhan hp = new HocPhan(maHp, tenHp, soTc, hk);
	 * dshp.add(hp); } catch (InputMismatchException e) { System.out.
	 * println("Lỗi: Bạn đã nhập sai định dạng dữ liệu. Vui lòng nhập lại");
	 * sc.nextLine(); // Đọc ký tự không hợp lệ để tránh việc lặp vô hạn trong
	 * trường hợp lỗi. i--; // Để nhập lại thông tin cho học phần không thành công.
	 * } }
	 * 
	 * obj.ghiFile(dshp); }
	 */

	public void KhoiTao() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			try {
				System.out.print("Nhập mã HP:");
				String maHp = sc.nextLine();

				System.out.print("Nhập tên HP:");
				String tenHp = sc.nextLine();

				int soTc = 0;
				while (true) {
					try {
						System.out.print("Nhập số tín chỉ:");
						soTc = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						System.out.println("Số tín chỉ không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				int hk = 0;
				while (true) {
					try {
						System.out.print("Nhập học kỳ:");
						hk = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						System.out.println("Học kỳ không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				HocPhan hp = new HocPhan(maHp, tenHp, soTc, hk);
				dshp.add(hp);
				System.out.println("=================");
			} catch (Exception e) {
				System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
				sc.nextLine();
				i--;
			}
			System.out.println("=================");
		}

		obj.ghiFile(dshp);
	}

	public void docfile() {
		HocPhanDao obj = new HocPhanDao();

		dshp = obj.docFile("D:\\BT PhuXuan\\BT LTHDT\\dshp1.bin");

	}

	public void hienthi() {
		System.out.println("============================================================================================================");
		for (HocPhan dshp : dshp) {
			String formattedOutput = String.format("Mã HP: %-10s  Tên HP: %-25s  Số tín chỉ: %2d  Học kỳ: %d%n",
					dshp.getMaHp(), dshp.getTenHp(), dshp.getSoTc(), dshp.getHk());
			System.out.print(formattedOutput);
			System.out.println("============================================================================================================");
		}
	}

	/*
	 * public void hienthihk(int hk) { boolean found = false; // biến này để kiểm
	 * tra xem có học phần nào được tìm thấy không.
	 * 
	 * for (HocPhan dshp : dshp) { if (dshp.getHk() == hk) { String formattedOutput
	 * = String.format("Mã HP: %2s  Tên HP: %-25s  Số tín chỉ: %2d  Học kỳ: %d%n",
	 * dshp.getMaHp(), dshp.getTenHp(), dshp.getSoTc(), dshp.getHk());
	 * System.out.println(formattedOutput); found = true; // Đánh dấu là đã tìm thấy
	 * ít nhất một học phần. } }
	 * 
	 * if (!found) { System.out.println("Không tìm thấy học phần nào trong học kỳ "
	 * + hk); } }
	 */

	/*
	 * public void chen() { Scanner sc = new Scanner(System.in);
	 * System.out.println("Nhập mã HP :"); String maHp = sc.nextLine();
	 * System.out.println("Nhập tên HP :"); String tenHp = sc.nextLine();
	 * System.out.println("Nhập số tín chỉ"); int soTc = sc.nextInt();
	 * sc.nextLine(); System.out.println("Nhập học kỳ :"); int hk = sc.nextInt();
	 * sc.nextLine();
	 * 
	 * // Tạo một đối tượng Học Phần từ dữ liệu người dùng nhập HocPhan hp = new
	 * HocPhan(tenHp, tenHp, soTc, hk);
	 * 
	 * System.out.print("Nhập vị trí cần chèn: "); int vt = sc.nextInt(); vt = vt -
	 * 1; // Kiểm tra xem vị trí (vt) có hợp lệ hay không if (vt >= 0 && vt <=
	 * dshp.size()) { dshp.add(vt, hp);
	 * System.out.println("Học phần đã được chèn vào vị trí " + vt +
	 * " trong danh sách."); obj.ghiFile(dshp); } else {
	 * System.out.println("Vị trí không hợp lệ Học phần không được chèn."); } }
	 */

	public void chen() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Nhập mã HP :");
			String maHp = sc.nextLine();

			// Kiểm tra xem mã HP đã tồn tại hay chưa
			if (kiemTraTonTaiMaHp(maHp)) {
				System.out.println("Mã học phần đã tồn tại. Học phần không được chèn.");
				return;
			}

			System.out.print("Nhập tên HP :");
			String tenHp = sc.nextLine();

			int soTc = 0;
			while (true) {
				try {
					System.out.print("Nhập số tín chỉ:");
					soTc = sc.nextInt();
					sc.nextLine();
					break;
				} catch (Exception e) {
					System.out.println("Số tín chỉ không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			int hk = 0;
			while (true) {
				try {
					System.out.print("Nhập học kỳ:");
					hk = sc.nextInt();
					sc.nextLine();
					break;
				} catch (Exception e) {
					System.out.println("Học kỳ không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			System.out.print("Nhập vị trí cần chèn: ");
			int vt = sc.nextInt();
			sc.nextLine();

			vt = vt - 1; // Để phù hợp với vị trí của mảng (trừ 1)

			// Kiểm tra xem vị trí (vt) có hợp lệ hay không
			if (vt >= 0 && vt <= dshp.size()) {
				HocPhan hp = new HocPhan(maHp, tenHp, soTc, hk);
				dshp.add(vt, hp);
				System.out.println("Học phần đã được chèn vào vị trí " + vt + " trong danh sách.");
			} else {
				System.out.println("Vị trí không hợp lệ. Học phần không được chèn.");
			}
		} catch (Exception e) {
			System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
			sc.nextLine();
		}
	}

	// Hàm kiểm tra mã học phần đã tồn tại hay chưa
	private boolean kiemTraTonTaiMaHp(String maHp) {
		for (HocPhan hp : dshp) {
			if (hp.getMaHp().equalsIgnoreCase(maHp)) {
				return true; // Mã học phần đã tồn tại
			}
		}
		return false; // Mã học phần chưa tồn tại
	}

	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên HP cần xóa: ");
		String ht = sc.nextLine();
		for (int i = 0; i < dshp.size(); i++) {
			if (dshp.get(i).getMaHp().equals(ht) == true)
				dshp.remove(i);
		}
		System.out.println("Danh Sách sau khi xóa HP!!!");
		/* obj.ghiFile(dshp); */  
	}

	public void suaThongTinHocPhan(String id) {
		Scanner sc = new Scanner(System.in);
		boolean timThay = false;

		try {
			System.out.println("Sửa thông tin cho học phần có ID " + id);
			for (HocPhan hp : dshp) {
				if (hp.getMaHp().equals(id)) {
					timThay = true;
					System.out.print("Nhập mã HP:");
					String maHpMoi = sc.nextLine();
					System.out.print("Nhập tên HP:");
					String tenHpMoi = sc.nextLine();

					int soTcMoi = 0;
					while (true) {
						try {
							System.out.print("Nhập số tín chỉ:");
							soTcMoi = sc.nextInt();
							sc.nextLine();
							break;
						} catch (Exception e) {
							System.out.println("Số tín chỉ không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					int hk = 0;
					while (true) {
						try {
							System.out.print("Nhập học kỳ:");
							hk = sc.nextInt();
							sc.nextLine();
							break;
						} catch (Exception e) {
							System.out.println("Học kỳ không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					// Cập nhật thông tin của học phần
					hp.setMaHp(maHpMoi);
					hp.setTenHp(tenHpMoi);
					hp.setSoTc(soTcMoi);
					hp.setHk(hk);

					System.out.println("Thông tin của học phần đã được cập nhật.");
					break;
				}
			}

			if (!timThay) {
				System.out.println("Không tìm thấy học phần với ID " + id);
			}
		} catch (Exception e) {
			System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
			sc.nextLine();
		}
	}

	public HocPhan timHocPhanTheoTen(String tenCanTim) {
		for (HocPhan dshp : dshp) {
			if (dshp.getTenHp().equalsIgnoreCase(tenCanTim)) {
				String formattedOutput = String.format("Mã HP: %-10s  Tên HP: %-25s  Số tín chỉ: %2d  Học kỳ: %d%n",
						dshp.getMaHp(), dshp.getTenHp(), dshp.getSoTc(), dshp.getHk());
				System.out.print(formattedOutput);
				return dshp; // Trả về Học phần nếu tên phù hợp
			}
		}
		System.out.println("Không tìm thấy HP ");
		return null; // Trả về null nếu không tìm thấy học phần
	}

	public void timHocPhanTheoHocKy(int hocKyCanTim) {
		for (HocPhan dshp : dshp) {
			if (dshp.getHk() == hocKyCanTim) {
				String formattedOutput = String.format("Mã HP: %-10s  Tên HP: %-25s  Số tín chỉ: %2d  Học kỳ: %d%n",
						dshp.getMaHp(), dshp.getTenHp(), dshp.getSoTc(), dshp.getHk());
				System.out.print(formattedOutput);
			} else {
				System.out.println("Không tìm thấy HP !!!!");
			}

		}

	}

	public void sapXepTheoSoTinChiTangDan() {
		Collections.sort(dshp, new Comparator<HocPhan>() {
			@Override
			public int compare(HocPhan hp1, HocPhan hp2) {
				return hp1.getSoTc() - hp2.getSoTc();
			}
		});

		System.out.println("Danh sách học phần sau khi sắp xếp theo số tín chỉ tăng dần:");
	}
}
