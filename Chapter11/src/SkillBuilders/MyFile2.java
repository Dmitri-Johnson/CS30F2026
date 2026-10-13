package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 {

	public static void main(String[] args) 
	{
		// no scanner to access file
		
		File textFile;
		String response;
		Scanner input = new Scanner(System.in);
		
		//create the file
		
		textFile = new File("C:\\Users\\79129001\\git\\CS30F2026\\Chapter11\\src\\SkillBuilders\\cs311.txt");
		//Check if file exists
		if(textFile.exists())
		{
			System.out.println("cs311.txt file exists.");
		}
		else 
		{
			try 
			{
				textFile.createNewFile();
				System.out.println("cs311.txt has been created.");
			}
			catch(IOException e)
			{
				System.out.println("File could not be created.");
				System.err.println("IOException "+ e.getMessage());
			}
		}
		
		System.out.println("Would you like to (K)eep or (D)elete?");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
		{
			if(textFile.delete())
			{
				System.out.println("File is deleted");
			}
		}
		else
		{
			System.out.println("File is kept and stays the same.");
		}
		
		
		
	}

}
