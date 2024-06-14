package com.run;

import com.entity.Category;

import java.util.Scanner;

public class MenuCategory {
	public static Category[] categories = new Category[0];
	public static int indexCategory = 0;
	public static void menuCategory(Scanner scanner) {
		do {
			System.out.println("**************** MENU ****************");
			System.out.println("1. Hiển thị danh sách danh mục");
			System.out.println("2. Thêm mới danh mục");
			System.out.println("3. Cập nhật danh mục");
			System.out.println("4. Xóa danh mục");
			System.out.println("**************************************");
			System.out.println("Lựa chọn đê: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
				case 1:
					showListCategory();
					break;
				case 2:
					addNewCategory(scanner);
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
	
	public static void showListCategory() {
		if (categories != null) {
			for (Category c : categories) {
				c.displayData();
			}
		}
	}
	
	public static void addNewCategory(Scanner scanner) {
		System.out.println("Nhập vào số lượng muốn thêm");
		int n = Integer.parseInt(scanner.nextLine());
		
		Category[] newCategories = new Category[categories.length + n];
		
		// [1,2,3,4,...]
		if (indexCategory == 0) {
			for (int i = categories.length; i < n; i++) {
				newCategories[i] = new Category();
				newCategories[i].setId(getNewCategoryId(newCategories));
				newCategories[i].inputData(scanner);
				categories = newCategories;
				indexCategory++;
			}
		} else {
			for (int i = 0; i < categories.length; i++) {
				newCategories[i] = categories[i];
			}
			for (int i = categories.length - 1; i < n; i++) {
				newCategories[i] = new Category();
				newCategories[i].setId(getNewCategoryId(newCategories));
				newCategories[i].inputData(scanner);
				categories = newCategories;
				indexCategory++;
			}
		}
		
		
	}
	
	public static int getNewCategoryId(Category[] categories) {
		int maxId = 0;
		for (int i = 0; i < categories.length; i++) {
			if (categories[i] != null && categories[i].getId() > maxId) {
				maxId = categories[i].getId();
			}
		}
		return maxId + 1;
	}
}
