package DOANHOANGCHINH;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        CacMenu menu = new CacMenu();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("Menu:");
            System.out.println("1. Quản lý Sinh Viên");
            System.out.println("2. Quản lý Học Phần");
            System.out.println("3. Thoát");
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
        } while (chon != 3);

        sc.close(); // Đóng Scanner sau khi hoàn thành
    }
}

