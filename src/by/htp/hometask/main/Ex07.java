package by.htp.hometask.main;

public class Ex07 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		if (a > b) {
			int c = 5;
			int sum = b + c;
			System.out.println(sum);
		} else if (a == b) {
			System.out.println("Конец");
		} else if (a < b) {
			int c = 10;
			int sum = a + b + c;
			System.out.println("Сумма = " + sum);
			System.out.println("Новый год");
		}

	}

}