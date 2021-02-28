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

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}