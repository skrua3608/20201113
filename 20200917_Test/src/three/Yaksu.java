package three;

import java.util.Scanner;

public class Yaksu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{
			System.out.println("숫자 입력 : ");
			int input = sc.nextInt();

			for (int i = 1; i <= input; i++) {
				if (input % i == 0) {
					System.out.println(i);

				}

			}

		}
	}

}
