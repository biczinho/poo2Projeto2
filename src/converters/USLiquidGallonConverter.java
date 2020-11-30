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
public class USLiquidGallonConverter extends AbstractConverter {
	MeasureType type = MeasureType.VOLUME;
	final String title = "US Liquid Gallon (gal)";
//	base type is LITER

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public USLiquidGallonConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public USLiquidGallonConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary USGallon to Liter}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 3.7854118;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Liter to USGallon}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 3.7854118;
		return super.fromBaseUnit(n);
	}

}
