/**
 * 
 */
package converters;

/**
 * @author Gabriel
 * @version 1.0
 * @since November 14th
 */
public abstract class AbstractConverter {
	MeasureType type = null;

	public AbstractConverter(MeasureType type) {
		this.type = type;
	}

	public AbstractConverter() {
		// TODO Auto-generated constructor stub
	}
	
	public double toBaseUnit(double n) {
		return n;
	}

	public double fromBaseUnit(double n) {
		return n;
	}

	public String getTypeString() {
		return type.getTypeString();
	}
	
	public String getBasicUnit() {
		return type.getBasicUnit();
	}
}
