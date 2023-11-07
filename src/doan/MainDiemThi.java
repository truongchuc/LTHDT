package doan;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDiemThi {
	public static void main(String[] args) {
		/*
		 * ArrayList<Student> studentList = new ArrayList<Student>(); Student st = new
		 * Student("anh", 9); studentList.add(st); Student st2 = new Student("be", 8);
		 * studentList.add(st2); Student st3 = new Student("em", 4);
		 * studentList.add(st3); StudentDao ob = new StudentDao();
		 * ob.ghiDiemThi(studentList);
		 */

		Scanner sc = new Scanner(System.in);
		ManagerStudent obj = new ManagerStudent();
		obj.docfile(); // đọc file thi1.bin
		obj.xepLoai(); // xếp loại
		obj.kq();
		obj.hienthi(); // hiển thị danh sách
		// obj.hienthiif();
		obj.max(); // tìm max
		obj.chen(); // chèn
		obj.kq();
		obj.xepLoai();
		obj.hienthi();
		obj.remove(); // xóa 1 sinh trong danh sách bằng tên
		obj.xepLoai();
		obj.hienthi();

		System.out.print("Nhập ID của sinh viên cần sửa: ");
		String idCanSua = sc.next();
		obj.suaThongTinSinhVien(idCanSua);
		obj.xepLoai();
		obj.hienthi();

		System.out.print("Nhập ID của sinh viên cần tìm: ");
		String tenCanTim = sc.next();
		obj.timSinhVienTheoTen(tenCanTim);
	}
}
