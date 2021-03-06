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
public class InchConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	final String title = "Inch (in)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public InchConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public InchConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Inch to Meter}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n / 39.37;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Meter to Inch}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n * 39.37;
		return super.fromBaseUnit(n);
	}
}
