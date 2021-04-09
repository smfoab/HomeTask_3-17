package by.htp.hometask.main;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int count = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество чисел: ");

		while (!sc.hasNextInt()) {
			System.out.println("Это не число!");
			sc.nextLine();
		}

		a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println("Введите целое число: ");

			while (!sc.hasNextInt()) {
				System.out.println("Это не целое число!");
				sc.next();

			}
			b = sc.nextInt();

			if (b > 15 || b < 2) {
				count++;
			}

			if (b % 5 == 4) {
				sum += b;
			}

		}
		System.out.println("Количество чисел > 15 или < 2 = " + count);
		System.out.println("Cумма чисел, которые делятся на 5 с остатком 4 = " + sum);

	}

}
