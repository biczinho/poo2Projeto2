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
public class CentimeterSquaredConverter extends AbstractConverter {
	MeasureType type = MeasureType.AREA;
//	base type is METER^2
	final String title = "Square Centimeter (cm^2)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public CentimeterSquaredConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public CentimeterSquaredConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary cm^2 to m^2}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n / 10000;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary m^2 to cm^2}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n * 10000;
		return super.fromBaseUnit(n);
	}

}
