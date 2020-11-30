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
public class CubicMeterConverter extends AbstractConverter {
	MeasureType type = MeasureType.VOLUME;
//	base type is LITER
	final String title = "Cubic Meter (m^3)";

	/**
	 * @param type : measurement category
	 */
	public CubicMeterConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public CubicMeterConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary CubicMeter to Liter}
	 * 
	 * @param n - number being converted into BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 1000;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Liter to CubicMeter}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 1000;
		return super.fromBaseUnit(n);
	}
}
