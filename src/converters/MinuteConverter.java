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
public class MinuteConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
//	base type is SECONDS
	final String title = "Minute (min)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public MinuteConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public MinuteConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Minute to Seconds}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 60;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Seconds to Minute}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 60;
		return super.fromBaseUnit(n);
	}
}
