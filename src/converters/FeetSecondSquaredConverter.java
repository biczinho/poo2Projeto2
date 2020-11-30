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
public class FeetSecondSquaredConverter extends AbstractConverter {
	MeasureType type = MeasureType.ACCELERATION;
//	base type is METER/S^2
	final String title = "Feet/Second^2 (ft/s^2)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public FeetSecondSquaredConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public FeetSecondSquaredConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Feet/Second^2 to Meter/Second^2}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 0.304;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Meter/Second^2 to Feet/Second^2}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 0.304;
		return super.fromBaseUnit(n);
	}

}
