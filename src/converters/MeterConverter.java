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
public class MeterConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	final String title = "Meter (m)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public MeterConverter(MeasureType type) {
		super(type);
//		this is needed because the implicit super constructor is undefined.
	}

	/**
	 * Default Constructor
	 */
	public MeterConverter() {
		super();
		super.type = type;
		super.title = title;
	}

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
