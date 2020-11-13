package Catman;

public class Man extends Mammalia {

	private int arms;
	
			
		
	
	
	public Man(){
		super.head=1;
		super.legs=2;
		this.arms=2; //클래스내에서 호출
	}

	@Override
	public void cry() {
		System.out.println("ㅠㅠ,");
	}

	@Override
	public String toString() {
		return "Man [arms=" + arms + ", head=" + head + ", legs=" + legs + "]";
	}
	
}
