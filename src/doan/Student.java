package doan;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private String hoTen;
	private float diemTrungBinh;
	private String Kq,Xl;

	public String getXl() {
		return Xl;
	}

	public void setXl(String xl) {
		Xl = xl;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		diemTrungBinh = diemTrungBinh;
	}

	public Student() {

	}
	
	public Student(String hoTen, float diemTrungBinh) {
		this.hoTen = hoTen;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getKq() {
		return Kq;
	}

	public void setKq(String kq) {
		Kq = kq;
	}

	
}
