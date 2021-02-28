package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TranspotationWalk transpotation = new TranspotationWalk();
//		transpotation.move();
	
		//ApplicationContext에서 만들어진 스프링 컨테이너에 접근하는 방법
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		//데이터 타입은?
		TranspotationWalk transpotationWalk =
		ctx.getBean("tWalk", TranspotationWalk.class);
		transpotationWalk.move();
		
		ctx.close();
		
	}
}