class Ex7_7 {
	public static void main(String args[]) {
		Car c = null;
		FireEngine f = new FireEngine();
		c = f;
		boolean t = (c instanceof FireEngine);
		System.out.println(t);
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}