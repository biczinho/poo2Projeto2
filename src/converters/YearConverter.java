/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class YearConverter extends AbstractConverter {
	MeasureType type = MeasureType.TIME;
	final String title = "Year (yr)";
//	base type is SECONDS

	/**
	 * @param type
	 */
	public YearConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public YearConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n * 365 * 86400;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n / 365 / 86400;
		return super.fromBaseUnit(n);
	}

}
