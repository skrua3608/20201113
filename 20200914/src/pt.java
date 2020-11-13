
public class pt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1,정수형 변수 num1을 선언하고 12로 초기화 2.정수형 변수 num2를 선언하고 18로 초기화 3.정수형 변수 big을 선언하고
		 * num1과 num2 중 큰수 저장 4.정수형 변수 small을 선언하고 num1과 num2 중 작은수 저장 5.반복-big %
		 * small=0이 될때까지 -나머지=big % small -0이 아니라면 big=small, small=나머지 6,최대공약수 출력 : 작은
		 * 수
		 */

		int num1 = 12;
		int num2 = 18;

		int big;
		int small;

		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}

		System.out.println("최대공약수 :  " + getGcd(big, small));
		System.out.println("최소공배수 :  " + (num1 * num2 / getGcd(big,small)));

	}

	public static int getGcd(int big, int small) {
		int gcd;
		
		while (true) {
			int rest = big % small;
			
			if (rest == 0) {
				gcd = small;
				break;
			} else {
				big = small;
				small = rest;

			}
		
		}
		return gcd;		
	}
}