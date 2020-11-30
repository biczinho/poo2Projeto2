/**
 * 
 */
package converters;

/**
 * @author Gabriel
 * @version 1.0
 * @since November 14th
 */
public class MeterConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	final String title = "Meter (m)";

	/**
	 * <h2>Constructor</h2>
	 * 
	 * @param type : measurement category
	 */
	public MeterConverter(MeasureType type) {
		super(type);
//		this is needed because the implicit super constructor is undefined.
	}

	public MeterConverter() {
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
		return super.toBaseUnit(n);
//		sending the number to the super class before returning, will be useful later.
	}

	@Override
	public double fromBaseUnit(double n) {
		return super.fromBaseUnit(n);
		//		sending the number to the super class before returning, will be useful later.
	}
}
