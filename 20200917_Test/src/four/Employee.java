package four;

public class Employee {

	private String name;
	private int number;
	private int age;
	private String code;
	private int year;
	private String work;

	public Employee(String name, int number, int age, String code, int year) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.code = code;
		this.year = year;

		if (year >= 0 && year <= 3) {
			this.work = "하";
		} else if (year >= 4 && year <= 10) {
			this.work = "중";
		} else {
			this.work = "상";
		}

	}

	public void makeKimbab() {
		System.out.println("김밥을 만드는 중입니다.");
	}

	public void sayHello() {
		System.out.println("어서오세요");
	}

	public void count() {
		System.out.println("계산해 드리갰습니다. 이용해 주셔서 감사합니다.");

	}

}
