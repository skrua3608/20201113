
public class Circle {

	
	private double rad=0;
	final double PI=3.14;
	
	public Circle(double r) {
		SetRad(r);
	}
public void SetRad(double r) {
	if(r<0) {
		rad =0;
		return;
	}
		rad=r;
}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return (rad * rad) * PI;
	}
}
class InfoHideCircle{
public static void main(String args[]) {
	Circle c = new Circle(1.5);
	System.out.println("반지름 : "+c.getRad());
	System.out.println("넓이 : "+c.getArea()+"\n");
	
	c.SetRad(3.4);
	System.out.println("반지름 : "+c.getRad());
	System.out.println("넓이 : "+c.getArea());
	
}
}