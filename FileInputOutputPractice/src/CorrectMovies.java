import java.io.*;

public class CorrectMovies {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("movies (1).dat", "rw");
		while(raf.getFilePointer() < raf.length()) {
			System.out.print(raf.readUTF());
			System.out.println(raf.readInt());
		}
		System.out.println();
		raf.seek(22);
		raf.writeInt(29);
		raf.seek((22 + 4) * 5 + 22);
		raf.writeInt(92);
		raf.seek(0);
		
		while(raf.getFilePointer() < raf.length()) {
			System.out.print(raf.readUTF());
			System.out.println(raf.readInt());
		}
	}
}
