class A {
	public void method(I i) {
		i.method();
	}
}


// B class ����� ������ ����;�и�
interface I{
	public void method() ;
}

class B implements I {
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("�������̽� �׽�Ʈ");
	}
}

class C implements I {
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("�������̽� �׽�Ʈ");
	}
}

public class InterfaceTest {
	public static void main(String[] args){
		A a = new A();
		a.method(new C());
	}
	
}