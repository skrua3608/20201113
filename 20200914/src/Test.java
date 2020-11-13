
public class Test {

	public static void main(String[] args) {//a메인메소드 선언

		//1,정수형 변수 num1을 선언하고 12로 초기화
		int num1=12;
		//2.정수형 변수 num2를 선언하고 18로 초기화
		int num2=18;
		//3. 정수형 변수 big을 선언하고 num1과 num2 중 큰수 저장
		int big;
		//4.정수형 변수 small을 선언하고 num1과 num2 중 작은수 저장
		int small;
		
		if(num1>num2) {
			big=num1;
			small=num2;
		}else {
			big=num2;
			small=num1;
	
	}/*5.반복-big % small=0이 될때까지
		-namugi=big % small
		-0이 아니라면 big=small, small=namugi
	*/
		while(true) {//통째로 메소드를 만들자
			int rest =big %small;
			if(rest==0) {
				break;
			}else {
				big=small;
				small=rest;
			}
		
		}
		//6,최대공약수 출력 : 작은 수
		System.out.println("최대공약수 : "+small);
		System.out.println("최소공배수 : "+(num1*num2/small));
	}

}
