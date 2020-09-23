package djordje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import services.FactoryService;
import services.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		/*
		 * ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		 * ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		 */
	    
	    FactoryService factoryService = new FactoryService();
	    ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
	    
	    
	    shapeService.getCircle();
	  

	}

}
