/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class PsiConverter extends AbstractConverter {
	MeasureType type = MeasureType.PRESSURE;
//	base type is PASCAL
	final String title = "Psi (lbf/in^2)";

	/**
	 * @param type
	 */
	public PsiConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public PsiConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		n = n * 6894.76;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		n = n / 6894.76;
		return super.fromBaseUnit(n);
	}

}
