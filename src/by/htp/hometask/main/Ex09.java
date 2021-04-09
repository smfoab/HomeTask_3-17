package by.htp.hometask.main;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int a = 0;
		int b;
		int count = 0;
		int sum = 0;
		int countModule = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество чисел: ");

		a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			System.out.println("Введите целое число " + (i + 1) + ":");
			b = sc.nextInt();

			if (b % 2 == 0) {
				count++;
			}

			if (b % 3 == 0) {
				sum += b;
			}

			if (Math.abs(b) < 3) {
				countModule++;
			}

		}
		System.out.println("Количество четных чисел = " + count);
		System.out.println("Сумма чисел, кратных трем = " + sum);
		System.out.println("Количество чисел, модуль которых < 3 = " + countModule);

	}
}