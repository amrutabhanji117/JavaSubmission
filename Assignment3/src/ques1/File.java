package ques1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long start = System.currentTimeMillis();
		try {
			FileReader fr=new FileReader("D:/Pictures/Blank diagram.png");
			FileWriter fw=new FileWriter("D:/Pictures/Blank diagram.png");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		
		System.out.println("file is written");
	}

	}


