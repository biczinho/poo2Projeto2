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
public class HourConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
//	base type is SECONDS
	final String title = "Hour (h)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public HourConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public HourConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Hour to Seconds}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 3600;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Seconds to Hour}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 3600;
		return super.fromBaseUnit(n);
	}
}
