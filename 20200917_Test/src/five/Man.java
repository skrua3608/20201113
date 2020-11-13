package five;

public class Man extends Mammalia {

	private int arms;

	public void Man() {
		super.head = 1;
		super.legs = 2;
		this.arms = 2;

	}

	@Override
	public void cry() {
		System.out.println("엉엉");

	}
	@Override
	public String toString() {
		return "Man [arms=" + arms + ", head=" + head + ", legs=" + legs + "]";
	}
}
