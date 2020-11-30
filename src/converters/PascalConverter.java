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
public class PascalConverter extends AbstractConverter {
	MeasureType type = MeasureType.PRESSURE;
//	base type is PASCAL
	final String title = "Pascal (Pa)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public PascalConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public PascalConverter() {
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
