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
public class AtmosphereConverter extends AbstractConverter {
	MeasureType type = MeasureType.PRESSURE;
//	base type is PASCAL
	final String title = "Atmosphere (atm)";
	//final Double rate = 101325;

	/**
	 * @param type : measurement category
	 */
	public AtmosphereConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public AtmosphereConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary ATM to Pascal}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 101325;
		// n = n * rate;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Pascal to ATM}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 101325;
		// n = n / rate;
		return super.fromBaseUnit(n);
	}

}
