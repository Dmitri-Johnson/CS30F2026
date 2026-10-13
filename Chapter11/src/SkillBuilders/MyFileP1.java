package SkillBuilders;

import java.io.File;
import java.util.Scanner;

public class MyFileP1 {

	public static void main(String[] args) {
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);

		//Obtain file name from user
		System.out.println("Enter file name: ");
		fileName = input.next();
		
		//Create a new file
		textFile = new File(fileName);
		
		//Check if file exists
		if(textFile.exists()) 
		{
			System.out.println("File Exists.");
		}
		else 
		{
			System.out.println("File Does Not Exist.");
		}
	}

}
