package DOANHOANGCHINH2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLySinhVien {
	public ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();

	/*
	 * public void KhoiTao() { Scanner sc = new Scanner(System.in); for (int i = 0;
	 * i < 2; i++) { System.out.print("Nhập mã SV :"); int maSV = sc.nextInt();
	 * sc.nextLine(); System.out.print("Nhập tên SV :"); String tenSV =
	 * sc.nextLine(); System.out.print("Nhập Tuổi :"); int tuoi = sc.nextInt();
	 * System.out.print("Nhập điểm trung bình :"); float dtb = sc.nextFloat();
	 * SinhVien sv = new SinhVien(tenSV, tuoi, maSV, dtb); dssv.add(sv);
	 * System.out.println("================="); } }
	 */

	public void KhoiTao() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			try {

				int maSV = 0;
				while (true) {
					try {
						System.out.print("Nhập mã SV :");
						maSV = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						// TODO: handle
						System.out.println("Mã sinh viên không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				System.out.print("Nhập tên SV :");
				String tenSV = sc.nextLine();

				int tuoi = 0;
				while (true) {
					try {
						System.out.print("Nhập Tuổi :");
						tuoi = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				float dToan = 0;
				while (true) {
					try {
						System.out.print("Nhập Điểm Toán :");
						dToan = sc.nextFloat();
						sc.nextLine();
						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				float dVan = 0;
				while (true) {
					try {
						System.out.print("Nhập Điểm Văn :");
						dVan = sc.nextFloat();
						sc.nextLine();
						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				float dAnh = 0;
				while (true) {
					try {
						System.out.print("Nhập Điểm Anh :");
						dAnh = sc.nextFloat();
						sc.nextLine();
						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				float dtb = (dToan + dVan + dAnh) / 3;
				SinhVien sv = new SinhVien(tenSV, tuoi, maSV, dToan, dVan, dAnh, dtb);
				dssv.add(sv);
				System.out.println("=================");
			} catch (Exception e) {
				System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
				sc.nextLine();
				i--;
			}
		}
	}

	public void hienthi() {
		for (SinhVien dssv : dssv) {
			String formattedOutput = String.format(
					"Mã sinh viên: %d\tTên sinh viên: %-30sTuổi: %d\tĐiểm Toán: %.1f\tĐiểm Văn: %.1f\tĐiểm Anh: %.1f\tĐiểm trung bình: %.1f\tXếp loại: %-15sKết quả: %-10s",
					dssv.getMaSV(), dssv.getHoTen(), dssv.getTuoi(), dssv.getdToan(), dssv.getdVan(), dssv.getdAnh(),
					dssv.getDtb(), dssv.getXepLoai(), dssv.getKetQua());
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
		try {

			int maSVmoi = 0;
			while (true) {
				try {
					System.out.print("Nhập mã SV :");
					maSVmoi = sc.nextInt();
					sc.nextLine();

					// Kiểm tra xem mã sinh viên đã có chưa
					boolean trungMaSV = false;
					for (SinhVien sv : dssv) {
						if (sv.getMaSV() == maSVmoi) {
							trungMaSV = true;
							break;
						}
					}

					if (trungMaSV) {
						System.out.println("Mã sinh viên đã tồn tại. Vui lòng nhập lại.");
					} else {
						break;
					}
				} catch (Exception e) {
					// TODO: handle
					System.out.println("Mã sinh viên không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			System.out.print("Nhập tên SV :");
			String tenSVmoi = sc.nextLine();

			int tuoimoi = 0;
			while (true) {
				try {
					System.out.print("Nhập Tuổi :");
					tuoimoi = sc.nextInt();
					sc.nextLine();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			float dToan = 0;
			while (true) {
				try {
					System.out.print("Nhập Điểm Toán :");
					dToan = sc.nextFloat();
					sc.nextLine();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			float dVan = 0;
			while (true) {
				try {
					System.out.print("Nhập Điểm Văn :");
					dVan = sc.nextFloat();
					sc.nextLine();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			float dAnh = 0;
			while (true) {
				try {
					System.out.print("Nhập Điểm Anh :");
					dAnh = sc.nextFloat();
					sc.nextLine();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			float dtb = (dToan + dVan + dAnh) / 3;
			
			int vt = 0;
			while (true) {
				try {
					System.out.print("Nhập vị trí cần chèn: ");
					vt = sc.nextInt();
					sc.nextLine();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Vị trí không hợp lệ. Vui lòng nhập lại.");
					sc.nextLine();
				}
			}

			SinhVien sv = new SinhVien(tenSVmoi, tuoimoi, maSVmoi, dToan, dVan, dAnh, dtb);
			vt = vt - 1;
			// Kiểm tra xem vị trí (vt) có hợp lệ hay không
			if (vt >= 0 && vt <= dssv.size()) {
				dssv.add(vt, sv);
				System.out.println("Sinh viên đã được chèn vào vị trí " + vt + " trong danh sách.");
			} else {
				System.out.println("Vị trí không hợp lệ. Sinh viên không được chèn.");
			}
		} catch (Exception e) {
			System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
			sc.nextLine();
		}

	}

	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Mã Sinh Viên cần xóa: ");
		int id = sc.nextInt();
		for (int i = 0; i < dssv.size(); i++) {
			if (dssv.get(i).getMaSV() == id)
				dssv.remove(i);
		}
		System.out.println("Danh Sách sau khi xóa Sinh Viên!!!");
	}

	public void suaThongTinSinhVien(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sửa thông tin cho học phần có ID " + id);
		for (SinhVien dssv : dssv) {
			if (dssv.getMaSV() == id) {
				try {

					int maSVmoi = 0;
					while (true) {
						try {
							System.out.print("Nhập mã SV :");
							maSVmoi = sc.nextInt();
							sc.nextLine();
							break;
						} catch (Exception e) {
							// TODO: handle
							System.out.println("Mã sinh viên không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					System.out.print("Nhập tên SV :");
					String tenSVmoi = sc.nextLine();

					int tuoimoi = 0;
					while (true) {
						try {
							System.out.print("Nhập Tuổi :");
							tuoimoi = sc.nextInt();
							sc.nextLine();
							break;
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					float dToan = 0;
					while (true) {
						try {
							System.out.print("Nhập Điểm Toán :");
							dToan = sc.nextFloat();
							sc.nextLine();
							break;
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					float dVan = 0;
					while (true) {
						try {
							System.out.print("Nhập Điểm Văn :");
							dVan = sc.nextFloat();
							sc.nextLine();
							break;
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					float dAnh = 0;
					while (true) {
						try {
							System.out.print("Nhập Điểm Anh :");
							dAnh = sc.nextFloat();
							sc.nextLine();
							break;
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					float dtb = (dToan + dVan + dAnh) / 3;

					dssv.setMaSV(maSVmoi);
					dssv.setHoTen(tenSVmoi);
					dssv.setTuoi(tuoimoi);
					dssv.setdToan(dToan);
					dssv.setdVan(dVan);
					dssv.setdAnh(dAnh);
					dssv.setDtb(dtb);
				} catch (Exception e) {
					System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
					sc.nextLine();
				}

				// Cập nhật thông tin của sinh viên

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
						"Mã sinh viên: %d\tTên sinh viên: %-30sTuổi: %d\tĐiểm Toán: %.1f\tĐiểm Văn: %.1f\tĐiểm Anh: %.1f\tĐiểm trung bình: %.1f\tXếp loại: %-15sKết quả: %-10s",
						dssv.getMaSV(), dssv.getHoTen(), dssv.getTuoi(), dssv.getdToan(), dssv.getdVan(), dssv.getdAnh(),
						dssv.getDtb(), dssv.getXepLoai(), dssv.getKetQua());
				System.out.println(formattedOutput);
				return dssv; // Trả về sinh viên nếu tên phù hợp
			}
		}
		System.out.println("Không tìm thấy sinh viên ");
		return null; // Trả về null nếu không tìm thấy sinh viên
	}

	public void sapXepTheoDTBGiamDan() {
		Collections.sort(dssv, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return Float.compare(sv2.getDtb(), sv1.getDtb());
			}
		});

		System.out.println("Danh sách sinh viên sau khi sắp xếp theo Điểm trung bình tăng dần:");
	}

	public void hienthilonnhat() {
		float max = 0;
		for (SinhVien sv : dssv) {
			if (max < sv.getDtb())
				max = sv.getDtb();
		}
		for (SinhVien dssv : dssv) {
			if (dssv.getDtb() == max) {
				String formattedOutput = String.format(
						"Mã sinh viên: %d\tTên sinh viên: %-30sTuổi: %d\tĐiểm Toán: %.1f\tĐiểm Văn: %.1f\tĐiểm Anh: %.1f\tĐiểm trung bình: %.1f\tXếp loại: %-15sKết quả: %-10s",
						dssv.getMaSV(), dssv.getHoTen(), dssv.getTuoi(), dssv.getdToan(), dssv.getdVan(), dssv.getdAnh(),
						dssv.getDtb(), dssv.getXepLoai(), dssv.getKetQua());
				System.out.println(formattedOutput);
			}
		}
	}
}
