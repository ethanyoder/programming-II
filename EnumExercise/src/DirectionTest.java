//Ethan Yoder
//January 21, 2016
//Practices with enums
	
public class DirectionTest
{
	enum Direction {NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
		private char abbr;
		
		private Direction(char letter){
			abbr = letter;
		}
		public String toString(){
			return "Direction is" + " " + abbr;
		}
	}
	public static void main(String[] args)
	{
		Direction myDirection = Direction.NORTH;
		Direction yourDirection = Direction.SOUTH;
		System.out.println("You are heading " + yourDirection + ", ordinal value is " + yourDirection.ordinal());
		
		if (myDirection.compareTo(yourDirection) < 0)
			System.out.println("my ordinal value is lower");
		else
			System.out.println("my ordinal value is higher/equal");
	}
	
}
