package main;

import java.util.*;
import lop.ArrayListInt;

public class MainArrayListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListInt ar = new ArrayListInt();
		ar.input();
		System.out.print("Danh sách có giá trí là :");
		ar.display();
		ar.DL();

		System.out.print("Danh sách có giá trí >= 5 là :");
		ar.displayIf();
		ar.DL();

		System.out.print("Danh sách sau khi xóa phần tử:");
		ar.delete(10);
		ar.display();
		ar.DL();

		System.out.print("Danh sách sau khi sắp xếp :");
		ar.sort();
		ar.display();
		ar.DL();
		
		ar.max();
	}

}
