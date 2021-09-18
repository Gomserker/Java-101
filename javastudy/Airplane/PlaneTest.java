package wiki;

public class PlaneTest {
	public static void main(String[] args) {
		
		Plane plane1 = new Plane();
		
		plane1.setMaker("airbus");
		plane1.setModel("a350");
		plane1.setMaximumPassenger(150);
		plane1.getMaker();
		plane1.getModel();
		plane1.getMaximumPassenger();
		plane1.info();
		
		Plane plane2 = new Plane("airbus");
		plane2.info();
		
		Plane plane3 = new Plane("airbus", "a380");
		plane3.info();
		
		Plane plane4 = new Plane("airbus", "a380", 200);
		plane4.info();
		
		
//		System.out.println("������: " + plane1.getMaker() + ", �𵨸�: " + plane1.getModel() + ", �ִ� ž���ο�: " + plane1.getMaximumPassenger() + ", ����� ����� ���: " + Plane.getPlanes());

		
	}
}
