/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class KCalConverter extends AbstractConverter {
	MeasureType type = MeasureType.ENERGY;
//	base type is JOULE
	final String title = "Kilo Calory (kcal)";

	/**
	 * @param type
	 */
	public KCalConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public KCalConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n * 4186.7999;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n / 4184;
		return super.fromBaseUnit(n);
	}
}
