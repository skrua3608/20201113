
 class BankAccount {

	String accNumber;//계좌
	String ssNumber;//주민번호
	int balance;//잔액
	
	public BankAccount(String acc, String ss, int bal) {//생성자 계좌, 주민, 잔액
		
		accNumber=acc;//초기화 메소드
		ssNumber=ss;
		balance=bal;
}
	public int depoist(int amount) {//예금
		balance +=amount;//잔액 추가 
		return balance;
	}
	public int withdraw(int amount) {//출금
		balance -=amount;//잔액 감소
		return balance;
	}
	
	public int checkMyBalnce() {//잔액 확인
		System.out.println("계좌확인 : "+accNumber);
		System.out.println("주민번호 : "+ssNumber);
		System.out.println("잔액: "+balance+'\n');
		return balance;
	}
}
		class BankAccountConstructor{
			public static void main(String[] args) {
				BankAccount yoon = new BankAccount("12-34-89","953456-1234567",10000);
				BankAccount park = new BankAccount("22-35-99","893456-1234567",10000);
			
			yoon.depoist(5000);
			park.depoist(3000);
			yoon.withdraw(2000);
			park.withdraw(2000);
			yoon.checkMyBalnce();
			park.checkMyBalnce();
			
			
			}
		}