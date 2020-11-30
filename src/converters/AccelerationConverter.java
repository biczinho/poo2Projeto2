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
public class AccelerationConverter extends AbstractConverter {
	MeasureType type = MeasureType.ACCELERATION;
//	base type is METER/S^2
	final String title = "Acceleration (m/s^2)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public AccelerationConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public AccelerationConverter() {
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
