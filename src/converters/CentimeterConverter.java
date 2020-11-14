/**
 * 
 */
package converters;

/**
 * @author Gabriel
 * @version 1.0
 * @since November 14th
 */
public class CentimeterConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;

	/**
	 * <h2>Constructor</h2>
	 */
	public CentimeterConverter(MeasureType type) {
		super(type);
//		this is needed because the implicit super constructor is undefined.
	}

	public CentimeterConverter() {
		super();
		super.type = type;
	}

	@Override
	public double toBaseUnit(double n) {
		double converted = n / 100;
		return super.toBaseUnit(converted);
//		sending the number to the super class before returning, will be useful later.
	}

	@Override
	public double fromBaseUnit(double n) {
		double converted = n * 100;
		return super.fromBaseUnit(converted);
		//		sending the number to the super class before returning, will be useful later.
	}
}
