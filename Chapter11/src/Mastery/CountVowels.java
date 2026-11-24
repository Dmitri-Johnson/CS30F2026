package Mastery;


import java.io.*;
import java.util.Scanner;

public class CountVowels 
{

	public static void main(String[] args) 
	{
		File textFile;
		FileReader in;
		BufferedReader readFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		String lineInFile, lowercaseText, letter;
		
		int vowelSum = 0;
		
		
		System.out.println("Enter the name of the file: ");
		fileName = input.next();
		
		
		try
		{
			textFile = new File(fileName);
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while((lineInFile = readFile.readLine()) != null)
			{
				lowercaseText = lineInFile.toLowerCase();
				
				for(int i=0; i < lowercaseText.length(); i++)
				{
					letter = lowercaseText.substring(i, i + 1);
					
					if(letter.equals("a") || letter.equals("e") || letter.equals("i")
							|| letter.equals("o") || letter.equals("u"))
					{
						vowelSum += 1;
					}
					
				}//ends for loop
				
			}
			
			System.out.println("Number of vowels = " + vowelSum);
			
			readFile.close();
			in.close();
			
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}

}

