package lop;

import java.util.*;
import java.util.ArrayList;

public class ArrayListInt {
	public static ArrayList<Integer> list = new ArrayList();

	// Input danh sách
	public static void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Input list :");
			int n = sc.nextInt();
			list.add(n);
		}
	}

	// Output danh sách
	public static void display() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	}

	// Output danh sách có phần tử >= 5
	public static void displayIf() {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 5) {
				System.out.print(list.get(i) + "\t");
			}
		}
	}

	// Tìm kiếm và xóa number ra khỏi danh sách List
	public static void delete(int number) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(number)) {
				list.remove(i);
			}
		}
	}

	// Sắp xếp List
	public static void sort() {
		list.sort(Comparator.naturalOrder());
	}

	// Tìm số lớn nhất
	public static void max() {
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.print("Giá trị lớn nhất trong danh sách là :" + max);
	}

	// Tìm số lớn nhất trả về
	public static int maxReturn() {
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.print("Giá trị lớn nhất trong danh sách là :" + max);
		return max; // <===== khác nhau mỗi cái này
	}

	// Xuồng dòng
	public static void DL() {
		System.out.println();
	}
}
