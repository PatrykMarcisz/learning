package factory;

import color.Blue;
import color.IColor;
import color.EColor;
import color.Green;
import color.Red;
import shape.EShapeType;
import shape.IShape;

public class ColorFactory implements IAbstractFactory {

	@Override
	public IColor getColor(EColor color) {
		switch(color){
		case RED:
			return new Red();
		case BLUE:
			return new Blue();
		case GREEN:
			return new Green();
			default: 
				return null;
		}
	}

	@Override
	public IShape getShape(EShapeType shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
