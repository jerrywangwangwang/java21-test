
public class Shap {
//���Shape��ʾͼ�������������area�ܳ�����per��ɫ����color���������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ���
	double area;
	double per;
	String color;
	
	public Shap() {
		
	}
	public Shap(String color) {
		this.color=color;
	}
//����3�����󷽷��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ������һ������ɫ�ķ���getColor��
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
//��� 2�����ࣺ
//��main�����У���������ÿ������Ķ��󣬲�����2�������showAll������
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,10,"��ɫ");
		rec.showAll();
		Circle cir = new Circle(10,"��ɫ");
		cir.showAll();
	}
	
	
}
