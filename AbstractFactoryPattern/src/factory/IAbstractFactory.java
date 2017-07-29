package factory;

import color.IColor;
import color.EColor;
import shape.EShapeType;
import shape.IShape;

public interface IAbstractFactory {
	abstract IColor getColor(EColor color);
	abstract IShape getShape(EShapeType shape);
}
