package DOANHOANGCHINH2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLyGiangVien {
	public ArrayList<GiangVien> dsgv = new ArrayList<GiangVien>();

	public void KhoiTao() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			try {
				System.out.print("Nhập tên Giảng Viên :");
				String tenGV = sc.nextLine();

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

				System.out.print("Nhập Khoa của Giảng Viên :");
				String khoa = sc.nextLine();

				int soTietDay = 0;
				while (true) {
					try {
						System.out.print("Nhập Số tiết dạy :");
						soTietDay = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Số tiết dạy không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				String trinhdo = null;
				int choose;
				do {
					System.out.print("Nhập trình độ (1 - cử nhân, 2 - thạc sĩ, 3 -tiến sĩ): ");
					choose = sc.nextInt();
					switch (choose) {
					case 1:
						trinhdo = "cử nhân";
						break;
					case 2:
						trinhdo = "thạc sĩ";
						break;
					case 3:
						trinhdo = "tiến sĩ";
					default:
						System.out.println("Chọn không đúng!");
						break;
					}
				} while (choose < 1 || choose > 3);
				System.out.print("Số tiết dạy: ");
				soTietDay = sc.nextInt();
				sc.nextLine();

				GiangVien gv = new GiangVien(tenGV, tuoi, khoa, trinhdo, soTietDay);
				dsgv.add(gv);
			} catch (Exception e) {
				System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
				sc.nextLine();
				i--;
			}
		}
	}

	public void hienthi() {
		for (GiangVien gv : dsgv) {
			String formattedOutput = String.format(
					"Tên giảng viên: %-30sTuổi: %d\tKhoa: %-20sTrình độ: %-15sSố tiết dạy: %d", gv.getHoTen(),
					gv.getTuoi(), gv.getKhoa(), gv.getTrinhDo(), gv.getSoTietDay());
			System.out.println(formattedOutput);
		}
	}

	public void chen() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhập tên Giảng Viên :");
			String tenGV = sc.nextLine();

			// Kiểm tra xem mã giảng viên đã có chưa
			boolean trungTenGV = false;
			for (GiangVien gv : dsgv) {
				if (gv.getHoTen() == tenGV) {
					trungTenGV = true;
					break;
				}
			}

			if (trungTenGV) {
				System.out.println("Tên giảng viên đã tồn tại. Vui lòng nhập lại.");
			} else {

				int tuoiMoi = 0;
				while (true) {
					try {
						System.out.print("Nhập Tuổi: ");
						tuoiMoi = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				System.out.print("Nhập Khoa của Giảng Viên: ");
				String khoaMoi = sc.nextLine();

				int soTietDayMoi = 0;
				while (true) {
					try {
						System.out.print("Nhập Số tiết dạy: ");
						soTietDayMoi = sc.nextInt();
						sc.nextLine();
						break;
					} catch (Exception e) {
						System.out.println("Số tiết dạy không hợp lệ. Vui lòng nhập lại.");
						sc.nextLine();
					}
				}

				String trinhDoMoi = null;
				int choose;
				do {
					System.out.print("Nhập trình độ (1 - cử nhân, 2 - thạc sĩ, 3 - tiến sĩ): ");
					choose = sc.nextInt();
					switch (choose) {
					case 1:
						trinhDoMoi = "cử nhân";
						break;
					case 2:
						trinhDoMoi = "thạc sĩ";
						break;
					case 3:
						trinhDoMoi = "tiến sĩ";
						break;
					default:
						System.out.println("Chọn không đúng!");
						break;
					}
				} while (choose < 1 || choose > 3);

				GiangVien gvMoi = new GiangVien(tenGV, tuoiMoi, khoaMoi, trinhDoMoi, soTietDayMoi);
				dsgv.add(gvMoi);
				System.out.println("Giảng viên đã được chèn vào danh sách.");
			}
		} catch (Exception e) {
			System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
			sc.nextLine();
		}
	}

	public void xoaGiangVienTheoTen(String tenCanXoa) {
	    Iterator<GiangVien> iterator = dsgv.iterator();
	    while (iterator.hasNext()) {
	        GiangVien gv = iterator.next();
	        if (gv.getHoTen().equalsIgnoreCase(tenCanXoa)) {
	            iterator.remove();
	            System.out.println("Đã xóa giảng viên " + tenCanXoa);
	            return;
	        }
	    }
	    System.out.println("Không tìm thấy giảng viên có tên " + tenCanXoa);
	}


	public void suaThongTinGiangVien(String tenGVCanTim) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sửa thông tin cho giảng viên có tên " + tenGVCanTim);

		for (GiangVien gv : dsgv) {
			if (gv.getHoTen().equals(tenGVCanTim)) {
				try {
					System.out.print("Nhập tên Giảng Viên mới:");
					String tenGVmoi = sc.nextLine();

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

					System.out.print("Nhập Khoa của Giảng Viên mới:");
					String khoaMoi = sc.nextLine();

					int soTietDayMoi = 0;
					while (true) {
						try {
							System.out.print("Nhập Số tiết dạy mới:");
							soTietDayMoi = sc.nextInt();
							sc.nextLine();
							break;
						} catch (Exception e) {
							System.out.println("Số tiết dạy không hợp lệ. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}

					String trinhdoMoi = null;
					int choose;
					do {
						System.out.print("Nhập trình độ mới (1 - cử nhân, 2 - thạc sĩ, 3 -tiến sĩ): ");
						choose = sc.nextInt();
						switch (choose) {
						case 1:
							trinhdoMoi = "cử nhân";
							break;
						case 2:
							trinhdoMoi = "thạc sĩ";
							break;
						case 3:
							trinhdoMoi = "tiến sĩ";
						default:
							System.out.println("Chọn không đúng!");
							break;
						}
					} while (choose < 1 || choose > 3);
					sc.nextLine();

					gv.setHoTen(tenGVmoi);
					gv.setTuoi(tuoimoi);
					gv.setKhoa(khoaMoi);
					gv.setSoTietDay(soTietDayMoi);
					gv.setTrinhDo(trinhdoMoi);
				} catch (Exception e) {
					System.out.println("Lỗi khi nhập liệu. Vui lòng thử lại.");
					sc.nextLine();
				}

				System.out.println("Thông tin của Giảng Viên đã được cập nhật.");
				return; //
			}
		}
		System.out.println("Không tìm thấy Giảng Viên với tên " + tenGVCanTim);
	}
	
	public GiangVien timGiangVienTheoTen(String tenCanTim) {
	    for (GiangVien gv : dsgv) {
	        if (gv.getHoTen().equals(tenCanTim)) {
	            String formattedOutput = String.format(
	                    "Tên giảng viên: %-30sTuổi: %d\tKhoa: %-20sTrình độ: %-15sSố tiết dạy: %d", gv.getHoTen(),
	                    gv.getTuoi(), gv.getKhoa(), gv.getTrinhDo(), gv.getSoTietDay());
	            System.out.println(formattedOutput);
	            return gv; // Trả về giảng viên nếu tìm thấy
	        }
	    }
	    System.out.println("Không tìm thấy giảng viên có tên " + tenCanTim);
	    return null; // Trả về null nếu không tìm thấy giảng viên
	}


	public void sapXepTheoSoTiecDayGiamDan() {
		Collections.sort(dsgv, new Comparator<GiangVien>() {
			@Override
			public int compare(GiangVien gv1, GiangVien gv2) {
				return Float.compare(gv2.getSoTietDay(), gv1.getSoTietDay());
			}
		});

		System.out.println("Danh sách Giáo Viên sau khi sắp xếp theo Điểm trung bình tăng dần:");
	}
	
}
