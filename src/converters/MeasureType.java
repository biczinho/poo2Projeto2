package converters;

/**
 * @author André de Angelis
 */
public enum MeasureType {
	DISTANCE("distance", "meter (m)"), AREA("area", "square meter (m²"), VOLUME("volume", "liter (L)"),
	MASS("mass", "kilogram (kg)"), TIME("time", "second (s)"), SPEED("speed", "m/s"),
	ACCELERATION("accelerations", "m/s²"), FORCE("force", "newton (N)"), PRESSURE("pressure", "pascal (Pa)"),
	ENERGY("energy", "joule (J)"), POWER("power", "watt (W)"), VISCOSITY("viscosity", "Pa·s");

	private String type;
	private String basicUnit;

	private MeasureType(String type, String basicUnit) {
		this.type = type;
		this.basicUnit = basicUnit;
	}

	public final String getBasicUnit() {
		return basicUnit;
	}

	public String getTypeString() {
		return (type);
	}
}
