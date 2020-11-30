/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class LiterConverter extends AbstractConverter {
	MeasureType type = MeasureType.VOLUME;
//	base type is LITER
	final String title = "Liter (L)";

	/**
	 * @param type
	 */
	public LiterConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public LiterConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		return super.fromBaseUnit(n);
	}

}
