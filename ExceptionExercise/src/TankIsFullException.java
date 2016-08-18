
public class TankIsFullException extends Exception{

	public TankIsFullException() {
		super("Error: Tank is full");
	}
	
	public TankIsFullException(String s) {
		super(s);
	}
}
