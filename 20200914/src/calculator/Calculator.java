package calculator;

import java.util.Scanner;

public class Calculator {//메인 클래스 

	public static void main(String[] args) {//메인 만들어놓고 손떼고 calculation 부터 작성 
											//연산자에 따라 호출
	Scanner sc =new Scanner(System.in);
	
	Calculation calculation= new Calculation();//객체화
	int num1=20;//임의의 정수 
	int num2=10;
	
	
	System.out.println("연산자 +,-,*,/ : ");
	String input = sc.next();//입력받은 input에 따라 
	
	switch(input) {
	case "+":
		System.out.println(calculation.add(num1, num2));//더한값은 반환하여 출력
		break;
	case "-":
		System.out.println(calculation.subtrack(num1, num2));
		break;
	case "*":
		System.out.println(calculation.multiply(num1, num2));
		break;
	case "/":
		System.out.println(calculation.divide(num1, num2));
		break;
		default :
		System.out.println("잘못 입력하였습니다.");
	}
}
}
