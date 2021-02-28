
public class Hello2 {
	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("------------------");
		Hello3 h3 = new Hello3();
		h3.setArms(30);
		h3.setLegs(50);
		System.out.println(h3.getArms());
		System.out.println(h3.getLegs());
	}
}
class Hello3 {
	private int arms;
	private int legs;
	public int getArms() {
		return arms;
	}
	public void setArms(int arms) {
		this.arms = arms;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
}
class Hello4 { }
