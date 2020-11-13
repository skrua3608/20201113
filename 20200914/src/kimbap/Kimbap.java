package kimbap;

public class Kimbap {
	
	private String name;
	private int price;
	private int saleCount;
	private String developer;
	
	
	public Kimbap(String name, int price, String developer) {//생성자
		this.name=name;
		this.price=price;//인자값에 저장
		this.developer=developer;
	
	}
}
