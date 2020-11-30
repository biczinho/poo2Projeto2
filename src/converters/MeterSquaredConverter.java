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
public class MeterSquaredConverter extends AbstractConverter {
	MeasureType type = MeasureType.AREA;
//	base type is METER^2
	final String title = "Square Meter (m^2)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public MeterSquaredConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public MeterSquaredConverter() {
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
