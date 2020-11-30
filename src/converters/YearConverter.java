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
public class YearConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
	final String title = "Year (yr)";
//	base type is SECONDS

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public YearConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public YearConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Year to Seconds}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 365 * 86400;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Seconds to Year}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 365 / 86400;
		return super.fromBaseUnit(n);
	}

}
