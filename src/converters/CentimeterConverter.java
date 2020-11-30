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
public class CentimeterConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	public String title = "Centimeter (cm)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public CentimeterConverter(MeasureType type) {
		super(type);
//		this is needed because the implicit super constructor is undefined.
	}

	/**
	 * Default Constructor
	 */
	public CentimeterConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Centimeter to Meter}
	 * 
	 * @param n - number being converted into BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n / 100;
		return super.toBaseUnit(n);
//		sending the number to the super class before returning, will be useful later.
	}

	/**
	 * {@summary Meter to Centimeter}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n * 100;
		return super.fromBaseUnit(n);
		//		sending the number to the super class before returning, will be useful later.
	}
}
