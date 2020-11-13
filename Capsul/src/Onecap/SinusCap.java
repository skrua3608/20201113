package Onecap;


public class SinusCap {
	void sniTake() {
		System.out.println("콧물이 싹 납니다.");
	}

	void sneTake() {
		System.out.println("재채기가 멎습니다.");
	}

	void snuTake() {
		System.out.println("코가 뻥뚫립니다.");
	}

	void take() {
		sniTake();
		snuTake();
		sneTake();
	}
}

class ColdPatient {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}