package factory;


import color.EColor;
import color.IColor;
import shape.EShapeType;
import shape.IShape;

public class AbstractFactoryPatternDemo {
	public static void main(String args[]){
		IAbstractFactory shapeFactory = FactoryProducer.getFactory(EFactory.SHAPE_FACTORY);
		IShape shape = shapeFactory.getShape(EShapeType.CIRCLE);
		shape.draw();
		
		IAbstractFactory colorFactory = FactoryProducer.getFactory(EFactory.COLOR_FACTORY);
		IColor color = colorFactory.getColor(EColor.RED);
		color.fill();
	}
}
