
public class TankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank waterTank = new Tank();
		try {
			waterTank.drainTank(5);
			waterTank.fillTank(19);
			waterTank.fillTank(2);
		}
		catch(TankIsFullException e) {
			System.out.println("Tank is full");
		}
		catch(TankIsEmptyException e) {
			System.out.println("Tank is empty");
		}
	}

}
