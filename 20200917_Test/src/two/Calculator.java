package two;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); {
	
	Calculation calculation = new Calculation(); {
			
	System.out.println("연산자 입력 +,-,*,/ : ");
	String input=sc.next();
		
	
	switch(input){
	
	case "+" :
		System.out.println(calculation.add(num1, num2));
		break;
		
	case "-" :
		System.out.println(calculation.subtrack(num1, num2));
		break;
		
	case "*" :
		System.out.println(calculation.multiply(num1, num2));
		break;
		
	
	case "/" :
		System.out.println(calculation.divide(num1, num2));
		break;
			
	default:
		System.out.println("잘못 입력하였습니다");
		break;
	}
	}	
