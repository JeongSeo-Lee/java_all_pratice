import java.util.Scanner;

abstract class Player {
 	void play(int pos) {System.out.println("��ӹ��� Ŭ�������� �� �޼ҵ带 �ۼ��ϰ� �����ϸ� ���� �� �޼ҵ�� ���� ��������.");}
 	abstract void stop ();
}

class AudioPlayer extends Player {
//	void play(int pos) {
//		System.out.println(pos + "�� ��ġ���� �����մϴ�.");
//	}
	void stop() {
		System.out.println("stop!");
	}
}	

public class PlayerTest {
	public static void main(String[] args) {
		AudioPlayer ap  = new AudioPlayer();
		ap.play(100);
		ap.play(100);
		ap.stop();
		
		//������ 
		Player ap2 = new AudioPlayer();
		ap2.play(101);
		ap2.stop();
		Scanner sc = new Scanner(System.in);
		
	}
}
