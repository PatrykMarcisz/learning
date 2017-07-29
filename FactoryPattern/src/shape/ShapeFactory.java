package shape;

public class ShapeFactory {
	public IShape getShape(EShapeType shapeType) {
		switch (shapeType) {
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
