package lop;

import java.util.*;

public class ArrayListStudent {

	public static ArrayList<Student> StudentList = new ArrayList<Student>();

	public static void nhap() {
		int i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			System.out.print("Nhập ID :");
			int id = sc.nextInt();
			System.out.print("Nhập Họ Tên :");
			String ht = sc.nextLine();
			sc.nextLine(); // Đọc dòng mới
			System.out.print("Nhập Tuổi :");
			int t = sc.nextInt();
			System.out.print("Nhập GPA :");
			float gpa = sc.nextFloat();
			Student tam = new Student(id, t, ht, gpa);
			StudentList.add(tam);
			System.out.println("***************");
		}
	}

	/*
	 * Hiển thị cách 1 public static void hienthi() {
	 * System.out.println("Danh sách sinh viên");
	 * System.out.println("ID\tTuổi\tHọ Tên\tGPA"); for (int i = 0; i <
	 * StudentList.size(); i++) { System.out.println(StudentList.get(i).getId() +
	 * "\t" + StudentList.get(i).getT() + "\t" + StudentList.get(i).getHt() + "\t" +
	 * StudentList.get(i).getGpa()); } }
	 */

	// hiển thị cách 2
	public static void hienthi() {
		System.out.println("Danh sách sinh viên");
		System.out.println("ID\tTuổi\tHọ Tên\tGPA\tXếp loại");
		for (Student st : StudentList) {
			System.out.println(
					st.getId() + "\t" + st.getT() + "\t" + st.getHt() + "\t" + st.getGpa() + "\t" + st.getXl());
		}
	}

	// Xếp loại theo GPA
	public static void xeploai() {
		for (int i = 0; i < StudentList.size(); i++) {
			float gpa = StudentList.get(i).getGpa();
			String xepLoai;
			if (gpa < 5) {
				xepLoai = "Kém";
			} else if (gpa < 7 && gpa >= 5) {
				xepLoai = "Trung bình";
			} else if (gpa < 8 && gpa >= 7) {
				xepLoai = "Khá";
			} else {
				xepLoai = "Giỏi";
			}
			StudentList.get(i).setXl(xepLoai); // Cập nhật thông tin xếp loại trong đối tượng Student
		}
	}

	
	// Chèn sinh viên mới vào danh sách arrylist
	public static void chen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID :");
		int id = sc.nextInt();
		System.out.print("Nhập Họ Tên :");
		String ht = sc.nextLine();
		sc.nextLine(); // Đọc dòng mới
		System.out.print("Nhập Tuổi :");
		int t = sc.nextInt();
		System.out.print("Nhập GPA :");
		float gpa = sc.nextFloat();
		Student tam = new Student(id, t, ht, gpa);
		StudentList.add(tam);

		System.out.println("Sinh Viên đã được chèn sao danh sách");
	}

	// Xóa sinh viên theo ID
	public static void xoaSinhVientheoID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID của sinh viên cần xóa: ");
		int idToFind = sc.nextInt();
		int xoa = -1;
		for (int i = 0; i < StudentList.size(); i++) {
			if (StudentList.get(i).getId() == idToFind) {
				xoa = i;
				break;
			}
		}

		if (xoa != -1) {
			StudentList.remove(xoa);
			System.out.println("Sinh viên có ID " + idToFind + " đã bị xóa.");
		} else {
			System.out.println("Không tìm thấy sinh viên với ID " + idToFind + " trong danh sách.");
		}
	}
	
	// Chỉnh sửa thông thin của Sinh Viên theo ID
	public static void suaSinhVienTheoID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID của sinh viên cần sửa: ");
        int idToFind = sc.nextInt();

        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).getId() == idToFind) {
                // Tìm thấy sinh viên theo ID
                System.out.println("Sinh viên có ID " + idToFind + " đã được tìm thấy.");
                
                // Nhập thông tin mới của sinh viên
                System.out.print("Nhập Tuổi mới: ");
                int newAge = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập Họ Tên mới: ");
                String newFullName = sc.nextLine();
                System.out.print("Nhập GPA mới: ");
                float newGpa = sc.nextFloat();
                
                // Cập nhật thông tin của sinh viên
                StudentList.get(i).setT(newAge);
                StudentList.get(i).setHt(newFullName);
                StudentList.get(i).setGpa(newGpa);
                System.out.println("Sinh viên có ID " + idToFind + " đã được cập nhật.");
                return;
            }
        }
        // Không tìm thấy sinh viên
        System.out.println("Không tìm thấy sinh viên với ID " + idToFind + " trong danh sách.");
    }
}
