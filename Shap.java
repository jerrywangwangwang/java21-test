
public class Shap {
//设计Shape表示图形类有面积属性area周长属性per颜色属性color有两个构造方法（一个是默认的、一个是为颜色赋值的），
	double area;
	double per;
	String color;
	
	public Shap() {
		
	}
	public Shap(String color) {
		this.color=color;
	}
//还有3个抽象方法是：getArea计算面积、getPer计算周长、showAll输出所有信息，还有一个求颜色的方法getColor。
	public double getArea() {
		return area;
	}
	public double getPer() {
		return per;
	}
	public void showAll() {
		System.out.println(getArea());
		System.out.println(getPer());
		System.out.println(getClor());
	}
	public String getClor() {
		return color;
	}
//设计 2个子类：
//在main方法中，声明创建每个子类的对象，并调用2个子类的showAll方法。
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,10,"红色");
		rec.showAll();
		Circle cir = new Circle(10,"绿色");
		cir.showAll();
	}
	
	
}
