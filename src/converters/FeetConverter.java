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
public class FeetConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	final String title = "Feet (ft)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public FeetConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public FeetConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Feet to Meter}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		// TODO Auto-generated method stub
		n = n / 3.28084;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Meter to Feet}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		// TODO Auto-generated method stub
		n = n * 3.28084;
		return super.fromBaseUnit(n);
	}
}
