
public class Circle extends Shap{
//Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶����дgetPer��getArea��showAll����������
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
	//�����������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
	public Circle() {
		
	}
	public Circle(double radious,String colo) {
		this.radious=radious;
		super.color=color;
	}
	
}
