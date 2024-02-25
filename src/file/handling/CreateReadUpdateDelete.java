package file.handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateReadUpdateDelete {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		//Create file
		if(file.exists()) {
			System.out.println("File already created..."+ file.getName());
		}else {
			if(file.createNewFile()) {
				System.out.println("File creted... "+ file.getName());
			}
		}
		//Write Data into file
		FileOutputStream fos = new FileOutputStream(file);
		byte[] data = "Jai Ganesh".getBytes();
		fos.write(data);
		fos.close();
		
		//Read File
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		sc.close();
		
		//Delete File
		if(file.delete()) {
			System.out.println("File deleted... " + file.getName());
		}else {
			System.out.println("File not deleted");
		}
	}
}
