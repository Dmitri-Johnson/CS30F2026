package SkillBuilders;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		String firstName, lastName;
		
		int numStu;
		
		
		
		//Write data to file
		System.out.println("Enter the file name: ");
		fileName = input.next();
		
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		
		
		try  //This is for writing to a file
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i=0; i < numStu; i++)
			{
				System.out.println("Enter student first name: ");
				firstName = input.next();
				
				System.out.println("Enter student last name: ");
				lastName = input.next();
				
				writeFile.write(firstName + " " + lastName);
				writeFile.newLine();
				
			}//ends for loop
			
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
			
		}
		catch (IOException e) 
		{
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		try  //This is for reading from a file
		{
			
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			
			readFile.close();
			in.close();	
			
		}
		catch (IOException e) 
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		

	}

	private static File File(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
