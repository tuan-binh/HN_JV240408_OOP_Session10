package com.run;

import com.entity.Book;

import java.util.Scanner;

public class MenuBook {
	public static Book[] books = new Book[0];
	public static int indexBooks = 0;
	public static void menuBook(Scanner scanner) {
		do {
			System.out.println("**************** MENU ****************");
			System.out.println("1. Hiển thị danh sách book");
			System.out.println("2. Thêm mới book");
			System.out.println("3. Cập nhật book");
			System.out.println("4. Xóa book");
			System.out.println("**************************************");
			System.out.println("Lựa chọn đê: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					System.err.println("Vui lòng nhập lại từ 1 -> 3");
			}
		} while (true);
	}
	
	public static void showListBook() {
	
	}
	
}
