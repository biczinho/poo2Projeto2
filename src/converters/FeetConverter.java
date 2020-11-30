/**
 * 
 */
package converters;

/**
 * @author Gabriel
 *
 */
public class FeetConverter extends AbstractConverter {
	MeasureType type = MeasureType.DISTANCE;
//	base type is METER
	final String title = "Feet (ft)";

	/**
	 * @param type
	 */
	public FeetConverter(MeasureType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public FeetConverter() {
		super();
		super.type = type;
		super.title = title;
	}

	@Override
	public double toBaseUnit(double n) {
		// TODO Auto-generated method stub
		n = n / 3.28084;
		return super.toBaseUnit(n);
	}

	@Override
	public double fromBaseUnit(double n) {
		// TODO Auto-generated method stub
		n = n * 3.28084;
		return super.fromBaseUnit(n);
	}
}
