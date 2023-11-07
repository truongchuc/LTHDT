package mainkethua;

import kethua.KeThuaDonGian1;

public class MainKeThuaDonGian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeThuaDonGian1 p = new KeThuaDonGian1(1000000, 5000000);
		System.out.println("Luong la:" + p.getSalary());
		System.out.println("Thuong la:" + p.getBonus());
		System.out.println("Thuc nhan là:" + p.tinhthucnhan());

	}

}
