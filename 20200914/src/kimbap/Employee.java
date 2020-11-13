package kimbap;

public class Employee {
	
	private int number;//사원번호,   멤버변수
	private String name;
	private int age;
	private int year;
	private String code;//근무지 코드
	private String work;//업무숙련도
	//생성자는 멤버변수 바로밑에 
	
	public Employee(String name, int age, String code, int number,int year) {//생성자
		this.age=age;
		this.code=code;
		this.name=name;
		this.number=number;
		this.year=year;
		
	
	if(year>=0 && year<=3) {
		this.work="하";
	}else if(year>=4 && year<=10) {
		this.work="중";
	}else {
		this.work="상";
	}
	}
	
	
	public void makeKimbap() {//메소드
		System.out.println("김밥을 만드는 중입니다. ");
	}
	
	public void sayHello() {
		System.out.println("어서오세요. ");
	}
	public void calculate() {
		System.out.println("계산해드리겠오 ");
	}
}

	

