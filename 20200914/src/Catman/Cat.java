package Catman;

public class Cat extends Mammalia{//첫번째
	
	public Cat() {//상속받은거 
		super.head=1; //상위클래스에서 호출
		super.legs=4;
		
	}

	
	
	
	@Override
	public void cry() {//cry메소드 오버라이드 상속받은거 재정의
		System.out.println("냥~~");
	}
}
