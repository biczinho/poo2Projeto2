/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class JouleConverter extends AbstractConverter {
	MeasureType type = MeasureType.ENERGY;
//	base type is JOULE
	final String title = "Joule (J)";

	/**
	 * @param type
	 */
	public JouleConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public JouleConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		return super.fromBaseUnit(n);
	}
}
