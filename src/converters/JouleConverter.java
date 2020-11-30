/**
 * 
 */
package converters;

/**
 * @author Gabriel
 * @version 1.0
 * @since November 14th
 * @see AbstractConverter
 */
public class JouleConverter extends AbstractConverter {
	MeasureType type = MeasureType.ENERGY;
//	base type is JOULE
	final String title = "Joule (J)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public JouleConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
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
