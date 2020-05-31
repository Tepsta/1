
public class Flag {
	private double height;
	private double width;
	private String countryName;

	public static Flag factorySquareFlag(String a, double c) throws FlagException {
		return new Flag(a, c, c);
	}

	public static Flag factoryRectangleFlag1(String a, double c) throws FlagException {
		return new Flag(a, c, c * 1.5);
	}

	public static Flag factoryRectangleFlag2(String a, double c) throws FlagException {
		return new Flag(a, c, c * 2);
	}
	
	public static Flag factoryRectangleFlag3(String a, double c) throws FlagException {
		return new Flag(a, c, c * 1.6);
	}

	private Flag(String countryName, double height, double width) throws FlagException {
		if (height <= 0 || width <= 0) {
			throw new FlagException();
		} else {
			this.height = height;
			this.width = width;
			this.countryName = countryName;
		}
	}

	@Override
	public String toString() {
		return "Flag [height=" + height + ", width=" + width + ", countryName=" + countryName + "]";
	}

}
