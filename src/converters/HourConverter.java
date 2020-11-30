/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class HourConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
//	base type is SECONDS
	final String title = "Hour (h)";

	/**
	 * @param type
	 */
	public HourConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public HourConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n * 3600;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n / 3600;
		return super.fromBaseUnit(n);
	}
}
