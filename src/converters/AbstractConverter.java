/**
 * 
 */
package converters;

/**
 * {@summary abstract Class defines Converter structure}
 * 
 * @author Gabriel
 * @version 1.0
 * @since November 14th
 */
public abstract class AbstractConverter {
	MeasureType type = null;
	public String title = "";

	/**
	 * Overloaded Constructor
	 * 
	 * @param type : measurement category
	 */
	public AbstractConverter(MeasureType type) {
		this.type = type;
	}

	/**
	 * Default Constructor
	 */
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

	public String getTitle() {
		return this.title;
	}

	@Override
	public String toString() {
		return this.getTitle() + " (" + this.getBasicUnit() + ") [" + this.getTypeString() + "]";
	}
}
