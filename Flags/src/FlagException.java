
public class FlagException extends Exception {
	public FlagException() {
		System.err.println("Flag dimension must be bigger than 0");
	}
}
