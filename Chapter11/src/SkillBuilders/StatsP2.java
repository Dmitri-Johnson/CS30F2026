package SkillBuilders;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class StatsP2 {

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		String stuName, score;
		
		int numStu;
		int numScores = 0;
		
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		
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
				System.out.println("Enter Student name: ");
				stuName = input.next();
				
				System.out.println("Enter test score: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
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
			
			while((stuName = readFile.readLine()) != null)
			{
				score = readFile.readLine();
				System.out.println(stuName + " "+ score);
				
				numScores += 1;
				
				scoreValue = Double.parseDouble(score);
				totalScore += scoreValue;
				
				if(scoreValue < lowScore)
					lowScore = scoreValue;
				
				if(scoreValue > highScore)
					highScore = scoreValue;
				
			}
			avgScore = totalScore / numScores;
			
			NumberFormat percent = NumberFormat.getPercentInstance();

			
			System.out.println("Low score = " + percent.format(lowScore/100));
			
			System.out.println("High score = " + percent.format(highScore/100));
			
			System.out.println("Average =" + percent.format(avgScore/100));
			
			readFile.close();
			in.close();	
			
		}
		catch (IOException e) 
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}
