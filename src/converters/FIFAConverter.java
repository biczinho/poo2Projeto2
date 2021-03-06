/**
 * 
 */
package converters;

/**
 * @author Cleyvesson
 * @version 1.0
 * @since November 28th
 * @see AbstractConverter
 */
public class FIFAConverter extends AbstractConverter {
	MeasureType type = MeasureType.AREA;
//	base type is METER^2
	final String title = "Soccer Field (FIFA)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public FIFAConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public FIFAConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary FIFA to m^2}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 7140;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary m^2 to FIFA}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 7140;
		return super.fromBaseUnit(n);
	}

}
