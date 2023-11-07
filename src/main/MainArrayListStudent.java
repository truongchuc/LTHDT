package main;

import lop.Student;
import lop.ArrayListStudent;
import java.util.*;

public class MainArrayListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListStudent ar = new ArrayListStudent();
		ar.nhap();
		ar.xeploai();
		ar.hienthi();
		
		
		// Chèn sinh viên
		ar.chen();
		ar.xeploai();
		ar.hienthi();
		
		// Xóa sinh viên theo ID
		ar.xoaSinhVientheoID();
		ar.xeploai();
		ar.hienthi();
		
		// Chỉnh sửa sinh viên theo ID
		ar.suaSinhVienTheoID();
		ar.xeploai();
		ar.hienthi();
	}

}
