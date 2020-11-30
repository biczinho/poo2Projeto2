/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class SecondsConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
//	base type is SECONDS
	final String title = "Seconds (s)";

	/**
	 * @param type
	 */
	public SecondsConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
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
