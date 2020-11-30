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
public class SecondsConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
//	base type is SECONDS
	final String title = "Seconds (s)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public SecondsConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public SecondsConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		return super.fromBaseUnit(n);
	}

}
