
public class Rectangle extends Shap {
//Rectangle��ʾ�����࣬�����������ԣ�Width��ʾ���ȡ�height��ʾ��ȣ���дgetPer��getArea��showAll����������
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
	//����������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ���
	
}
