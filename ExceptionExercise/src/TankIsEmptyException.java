
public class TankIsEmptyException extends Exception {

	public TankIsEmptyException() {
		super("Error: Tank is empty");
	}
	
	public TankIsEmptyException(String s) {
		super(s);
	}
}
