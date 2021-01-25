
public class Rectangle extends Shap {
//Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，
	double width;
	double height;
	
	public Rectangle() {
		
	}
	public Rectangle(double width,double height,String color) {
		super(color);
		this.height=height;
		this.width=width;
//		super.color=color;
	}
	
	public double getPer() {
		double per = (width+height)*2;
		return per;
	}
	public double getArea() {
		double area = width*height;
		return area;
	}
	public void showAll() {
		System.out.println(getPer());
		System.out.println(getArea());
		System.out.println(super.color);
		System.out.println(this.height);
	}
	//另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
	
}
