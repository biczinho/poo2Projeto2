/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class InchConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	final String title = "Inch (in)";

	/**
	 * @param type
	 */
	public InchConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public InchConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n / 39.37;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n * 39.37;
		return super.fromBaseUnit(n);
	}
}
