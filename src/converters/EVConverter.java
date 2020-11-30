/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class EVConverter extends AbstractConverter {
	MeasureType type = MeasureType.ENERGY;
//	base type is JOULE
	final String title = "Eletro-Volt (EV)";

	/**
	 * @param type
	 */
	public EVConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public EVConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		double r = n / 6.2415E18;
		return super.toBaseUnit(r);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n * 6.2415E18;
		return super.fromBaseUnit(n);
	}
}
