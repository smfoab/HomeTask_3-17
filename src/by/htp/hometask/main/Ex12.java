package by.htp.hometask.main;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; true; i++) {

			System.out.println("Введите целочисленный аргумент a: ");

			while (!sc.hasNextInt()) {
				System.out.println("Введите целое число");
				sc.nextLine();
			}

			int a = sc.nextInt();

			System.out.println("Введите целочисленный аргумент b: ");

			while (!sc.hasNextInt()) {
				System.out.println("Введите целое число");
				sc.next();
			}

			int b = sc.nextInt();

			System.out.println("Сумма = " + (a + b));
			System.out.println(" ");

		}

	}
}
