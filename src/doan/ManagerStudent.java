package doan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ManagerStudent {
	public ArrayList<Student> studentList = new ArrayList<Student>();

	public void docfile() {
		StudentDao obj = new StudentDao();

		studentList = obj.docDiemThi("D:\\BT PhuXuan\\BT LTHDT\\thi1.bin");

	}

	public void hienthi() {
		for (Student st : studentList) {
			System.out.println("Họ Tên là :" + st.getHoTen() + "\t" + "Điểm Trung Bình là :" + st.getDiemTrungBinh()
					+ "\t" + "Kết quả :" + st.getKq() + "\t" + "Kết quả :" + st.getXl());
		}
	}

	public void hienthiif() {
		for (Student st : studentList) {
			if (st.getDiemTrungBinh() >= 5) {
				System.out
						.println("Họ Tên là :" + st.getHoTen() + "\t" + "Điểm Trung Bình là :" + st.getDiemTrungBinh());
			}
		}
	}

	public float max() {
		float max = 0;
		for (Student st : studentList) {
			if (max < st.getDiemTrungBinh())
				max = st.getDiemTrungBinh();
		}
		System.out.println("Sinh Viên Có điểm lớn nhất là:" + max);
		return max;
	}

	public void kq() {
		for (Student st : studentList) {
			if (st.getDiemTrungBinh() >= 5)
				st.setKq("Đậu");
			else
				st.setKq("Rớt");
		}
	}

	public void xepLoai() {
	    for (Student st : studentList) {
	        float dtb = st.getDiemTrungBinh();
	        if (dtb >= 8) {
	            st.setXl("Giỏi");
	        } else if (dtb >= 7) {
	            st.setXl("Khá");
	        } else if (dtb >= 5) {
	            st.setXl("Trung bình");
	        } else {
	        	st.setXl("Kém");
	        }
	    }
	}

	public void chen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên cần chèn: ");
		String ht = sc.nextLine();
		System.out.print("Nhập điểm cần chèn: ");
		float diem = sc.nextFloat();

		// Tạo một đối tượng Student từ dữ liệu người dùng nhập
		Student std = new Student(ht, diem);

		System.out.print("Nhập vị trí cần chèn: ");
		int vt = sc.nextInt();
		studentList.add(vt, std);

		/*
		 * // Kiểm tra xem vị trí (vt) có hợp lệ hay không if (vt >= 0 && vt <=
		 * studentList.size()) { studentList.add(vt, std);
		 * System.out.println("Sinh viên đã được chèn vào vị trí " + vt +
		 * " trong danh sách."); } else {
		 * System.out.println("Vị trí không hợp lệ. Sinh viên không được chèn."); }
		 */

		System.out.println("Sinh viên đã được chèn vào vị trí " + vt + " trong danh sách.");
	}

	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên cần xóa: ");
		String ht = sc.nextLine();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getHoTen().equals(ht) == true)
				studentList.remove(i);
		}
		System.out.println("Danh Sách sau khi xóa sinh viên!!!");
	}

	public void suaThongTinSinhVien(String hoten) {
	    Scanner sc = new Scanner(System.in);

	    for (Student st : studentList) {
	        if (st.getHoTen().equals(hoten) == true) {
	            System.out.println("Sửa thông tin cho sinh viên có Họ Tên " + hoten);
	            System.out.print("Nhập tên mới: ");
	            String tenMoi = sc.nextLine();
	            System.out.print("Nhập điểm mới: ");
	            float diemMoi = sc.nextFloat();

	            // Cập nhật thông tin của sinh viên
	            st.setHoTen(tenMoi);
	            st.setDiemTrungBinh(diemMoi);

	            System.out.println("Thông tin của sinh viên đã được cập nhật.");
	            return; // Kết thúc khi tìm thấy sinh viên và cập nhật thông tin
	        }
	    }
	    System.out.println("Không tìm thấy sinh viên với Họ Tên " + hoten);
	}

	
	public Student timSinhVienTheoTen(String tenCanTim) {
	    for (Student st : studentList) {
	        if (st.getHoTen().equalsIgnoreCase(tenCanTim)) {
	        	System.out.println("Họ Tên là :" + st.getHoTen() + "\t" + "Điểm Trung Bình là :" + st.getDiemTrungBinh()
				+ "\t" + "Kết quả :" + st.getKq() + "\t" + "Kết quả :" + st.getXl());
	            return st; // Trả về sinh viên nếu tên phù hợp
	        }
	    }
	    System.out.println("Không tìm thấy sinh viên ");
	    return null; // Trả về null nếu không tìm thấy sinh viên
	}
}
