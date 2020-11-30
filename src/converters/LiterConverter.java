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
public class LiterConverter extends AbstractConverter {
	MeasureType type = MeasureType.VOLUME;
//	base type is LITER
	final String title = "Liter (L)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public LiterConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public LiterConverter() {
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
