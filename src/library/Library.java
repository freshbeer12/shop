package library;

import java.util.Scanner;

public class Library {
	private Book[] items;
	private Magazine[] magazines;

	public void addItems(int count) {
		items = new Book[count];
		for (int i = 0; i < count; i++) {
			Book kniha = new Book();
			items[i] = kniha;
		}

	}

	public void addMagazines(int count) {
		magazines= new Magazine[count];
		for (int i = 0; i < count; i++) {
			Magazine magazine = new Magazine();
			magazines[i] = magazine;
		}

	}

	public void printInfo(){
		System.out.println("-----INFO O KNIHOVNE-----");
		for (Book kniha : items)
			kniha.printInfo();
		for (Magazine magazine : magazines)
			magazine.printInfo();
		System.out.println("-----");
	}
}
