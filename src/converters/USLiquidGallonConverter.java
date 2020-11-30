/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class USLiquidGallonConverter extends AbstractConverter {
	MeasureType type = MeasureType.VOLUME;
	final String title = "US Liquid Gallon (gal)";
//	base type is LITER

	/**
	 * @param type
	 */
	public USLiquidGallonConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public USLiquidGallonConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n * 3.7854118;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n / 3.7854118;
		return super.fromBaseUnit(n);
	}

}
