package by.htp.hometask.main;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int a = 0;
		double b = 0;
		int c = 0;
		int count = 0;
		int count1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество чисел N: ");

		a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			System.out.println("Введите вещественное число: ");

			while (!sc.hasNextDouble() || sc.hasNextInt()) {
				System.out.println("Это не вещественное число, попробуйте еще");
				sc.nextLine();
			}

			b = sc.nextDouble();

			c = (int) b;

			if (c % 2 == 0) {
				count++;
			}

			if (c > 15) {
				count1++;
			}

		}

		System.out.println("Количество четных чисел = " + count);
		System.out.println("Количество чисел > 15 = " + count1);

	}

}