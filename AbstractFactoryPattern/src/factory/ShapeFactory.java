package factory;

import color.IColor;
import color.EColor;
import shape.Circle;
import shape.EShapeType;
import shape.Rectangle;
import shape.IShape;
import shape.Square;

public class ShapeFactory implements IAbstractFactory {

	@Override
	public IColor getColor(EColor color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IShape getShape(EShapeType shape) {
		switch (shape) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			return null;
		}
	}

}
