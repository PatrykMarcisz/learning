package demo;

import shape.EShapeType;
import shape.IShape;
import shape.ShapeFactory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		IShape shape = factory.getShape(EShapeType.CIRCLE);
		shape.draw();
	}

}
