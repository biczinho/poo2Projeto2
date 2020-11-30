/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class PascalConverter extends AbstractConverter {
	MeasureType type = MeasureType.PRESSURE;
//	base type is PASCAL
	final String title = "Pascal (Pa)";

	/**
	 * @param type
	 */
	public PascalConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public PascalConverter() {
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
