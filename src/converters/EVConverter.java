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
public class EVConverter extends AbstractConverter {
	MeasureType type = MeasureType.ENERGY;
//	base type is JOULE
	final String title = "Eletro-Volt (EV)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public EVConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public EVConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary Electro-Volt to Joule}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 1.6E-19;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Joule to Electro-Volt}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 1.6E-19;
		return super.fromBaseUnit(n);
	}
}
