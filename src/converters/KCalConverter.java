/**
 * 
 */
package converters;

/**
 * @author Gabriel
 * @version 1.0
 * @since November 14th
 * @see AbstractConverter
 */
public class KCalConverter extends AbstractConverter {
	MeasureType type = MeasureType.ENERGY;
//	base type is JOULE
	final String title = "Kilo Calory (kcal)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public KCalConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public KCalConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary KCal to Joule}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 4186.8;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Joule to KCal}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 4186.8;
		return super.fromBaseUnit(n);
	}
}
