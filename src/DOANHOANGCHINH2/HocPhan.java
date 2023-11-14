package DOANHOANGCHINH2;

import java.io.Serializable;

public class HocPhan implements Serializable {
	private String maHp;
	private String tenHp;
	private int soTc;
	private int hk;
	public String getMaHp() {
		return maHp;
	}
	public void setMaHp(String maHp) {
		this.maHp = maHp;
	}
	public String getTenHp() {
		return tenHp;
	}
	public void setTenHp(String tenHp) {
		this.tenHp = tenHp;
	}
	public int getSoTc() {
		return soTc;
	}
	public void setSoTc(int soTc) {
		this.soTc = soTc;
	}
	public int getHk() {
		return hk;
	}
	public void setHk(int hk) {
		this.hk = hk;
	}
	public HocPhan(String maHp, String tenHp, int soTc, int hk) {
		super();
		this.maHp = maHp;
		this.tenHp = tenHp;
		this.soTc = soTc;
		this.hk = hk;
	}
	public HocPhan() {
		super();
	}
	
	

}
