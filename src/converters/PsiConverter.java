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
public class PsiConverter extends AbstractConverter {
	MeasureType type = MeasureType.PRESSURE;
//	base type is PASCAL
	final String title = "Psi (lbf/in^2)";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public PsiConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Default Constructor
	 */
	public PsiConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	/**
	 * {@summary PSI to Pascal}
	 * 
	 * @param n - number being converted to BaseUnit
	 */
	@Override
	public double toBaseUnit(double n) {
		n = n * 6894.76;
		return super.toBaseUnit(n);
	}

	/**
	 * {@summary Pascal to PSI}
	 * 
	 * @param n - number being converted from BaseUnit
	 */
	@Override
	public double fromBaseUnit(double n) {
		n = n / 6894.76;
		return super.fromBaseUnit(n);
	}

}
