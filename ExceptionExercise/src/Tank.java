import java.io.Serializable;

public class Tank implements Serializable {

	private int level;
	
	public void fillTank(int units) throws TankIsFullException {
		if (units + level > 20)
			throw new TankIsFullException();
		level += units;
	}
	
	public void drainTank(int units) throws TankIsEmptyException {
		if (level - units <= 0)
			throw new TankIsEmptyException();
		level -= units;
	}
}

