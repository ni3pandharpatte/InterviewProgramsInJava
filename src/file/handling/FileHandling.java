package file.handling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "Jai Gaensh";
		File file = new File("one.txt");
		FileOutputStream fos = new FileOutputStream(file);
		byte bytes[] =  str.getBytes();
		fos.write(bytes);
	}

}
