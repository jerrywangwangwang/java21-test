
public class Circle extends Shap{
//Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，
	double radious;
	
	public double getPer() {
		double per = 3.14*radious*2;
		return per;
	}
	public double getArea() {
		double area = 3.14*radious*radious;
		return area;
	}
	public void showAll() {
		System.out.println(getPer());
		System.out.println(getArea());
	}
	//另外又增加两个构造方法（为半径、颜色赋值的）。
	public Circle() {
		
	}
	public Circle(double radious,String colo) {
		this.radious=radious;
		super.color=color;
	}
	
}
