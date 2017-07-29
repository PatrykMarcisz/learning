package factory;

public class FactoryProducer {
	public static IAbstractFactory getFactory(EFactory factoryType) {
		switch (factoryType) {
		case COLOR_FACTORY:
			return new ColorFactory();
		case SHAPE_FACTORY:
			return new ShapeFactory();
		default:
			return null;
		}
	}
}
