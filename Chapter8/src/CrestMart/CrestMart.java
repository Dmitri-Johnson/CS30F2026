package CrestMart;

import java.text.NumberFormat;
import java.util.Scanner;

public class CrestMart 
{
	
	public static void payEmployee(Employee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		double pay;
		
		System.out.println(emp); //Printing an employee object
		
		pay = emp.pay(payArg);
		
		System.out.println(money.format(pay));
	}
	public static void main(String[] args)
	{
		Manager emp1 = new Manager("Kaleb", "Sue", 70000);
		
		Associate emp2 = new Associate("Taj", "Evan", 30.0);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		Employee emp = emp1;
		
		do 
		{
			System.out.println("/n (E)mployee \\ (P)lay \\ (Q)uit");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			if (!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter Employee number (1 or 2): ");
				empNum = input.nextInt();
				
				switch(empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
				}
				
				if(action.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if(action.equalsIgnoreCase("P"))
				{
					System.out.println("Enter the hours for Associate OR pay period for manaker: ");
					payArg = input.nextDouble();
					
					payEmployee(emp, payArg);
				}
			}
			
		}while(action.equalsIgnoreCase("Q"));
	}
}
