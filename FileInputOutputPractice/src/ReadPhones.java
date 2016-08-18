import java.io.*;

public class ReadPhones {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cellphoneobjects.dat"));
		
		int i = 0;
		while (i < 4) {
			CellPhone obj1 = (CellPhone)ois.readObject();
			obj1.printPhone();
			i ++;
		}
		
		int n = 5;
		int sum = 0;
		for (int k = 0, j = 0; k < n; k++, j += 2) {
			sum += j;
		}
		System.out.println(sum);
		
	}

}
