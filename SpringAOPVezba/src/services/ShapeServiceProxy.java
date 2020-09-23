package services;

import aspect.LoggingAspect;
import model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
	    new LoggingAspect().LoggingAdvice();	
		return super.getCircle();
	
	}
}
