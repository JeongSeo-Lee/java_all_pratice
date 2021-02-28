class MyPoint {
	int x;
	int y;
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	
}

class Circle extends MyPoint { // 상속
	int r;
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "zzz";
		}
	
}

//class Circle { // 포함 관계
//	MyPoint p = new MyPoint();
//	int r;
//	
//	@Override
//	public String toString() {
//		return "Circle [p=" + p  + ", r=" + r + "]";
//	}
//	
//	
//}

public class InheritanceTest {
	public static void main(String [] args) {
		Circle c= new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
//		c.p.x = 1;
//		c.p.y = 2;
//		c.r = 3;
		
		System.out.println("c.x: "+c.x);
		System.out.println("c.y: "+c.y);
		System.out.println("c.z: "+c.r);
		System.out.println(c.toString());
		
//		System.out.println("c.p.x: "+c.p.x);
//		System.out.println("c.p.y: "+c.p.y);
//		System.out.println("c.z: "+c.r);
	}
}
