/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class MinuteConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
//	base type is SECONDS
	final String title = "Minute (min)";

	/**
	 * @param type
	 */
	public MinuteConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public MinuteConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n * 60;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n / 60;
		return super.fromBaseUnit(n);
	}
}
