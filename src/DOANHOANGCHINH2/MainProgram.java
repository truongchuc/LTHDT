package DOANHOANGCHINH2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		CacMenu menu = new CacMenu();
		Scanner sc = new Scanner(System.in);
		int chon = 0;

		do {
		    try {
		        System.out.println("<===Menu=================>");
		        System.out.println("|1. Quản lý Sinh Viên	|");
		        System.out.println("|2. Quản lý Học Phần	|");
		        System.out.println("|3. Thoát		|");
		        System.out.println("<========================>");
		        System.out.print("Chọn chức năng: ");
		        chon = sc.nextInt();
		        sc.nextLine();

		        switch (chon) {
		            case 1:
		                menu.menuSv();
		                break;
		            case 2:
		                menu.menuHp();
		                break;
		            case 3:
		                System.out.println("Kết thúc chương trình.");
		                break;
		            default:
		                System.out.println("Chọn chức năng không hợp lệ.");
		                break;
		        }
		    } catch (InputMismatchException e) {
		        System.out.println("Lỗi: Vui lòng nhập số nguyên cho chức năng.");
		        sc.nextLine(); // Đọc và loại bỏ dữ liệu không hợp lệ
		    }
		} while (chon != 3);
}
}
