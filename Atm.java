
// Author: Piyush Kumar
// Date: 08-Mar-2024
// Description: This code describes about using Switch-Case, Do-While and Static methods inside a class to perform simple operations like an ATM Machine interface works.

import java.util.Scanner;
class Atm
{
	int Z;
	public static void main(String args[])
	{

	Atm f1=new Atm();	//Creating an object for the Global Variable
	f1.Z = 10500;		

	Scanner sc=new Scanner(System.in);	
	char f;
	do{
		System.out.println("Welcome To World Bank!");
		System.out.println("Choose from the available options below:");
		System.out.println("Press 1 to \'Check Balance\' ");
		System.out.println("Press 2 to \'Deposit Money\' ");
		System.out.println("Press 3 to \'Withdraw Balance\' ");
		System.out.println("Press 4 to \'EXIT\' ");

		int a=sc.nextInt();

		switch(a)
		{	case 1:
				System.out.println("The Available Balance is: "+(f1.Z));
				
				break;
			case 2: 
				System.out.println("Enter the Amount to Deosit: ");
				int a1=sc.nextInt();
				depositMoney(a1);
				break;
			case 3: 
				System.out.println("Enter the Amount to Withdraw: ");
				int c=sc.nextInt();
				withdrawAmount(c);
				break;
			case 4: 
				System.out.println("Thank You for using World Bank ATM Service.");
				break;
			default:
				System.out.println("Please Enter the Valid Choice");
		}
			System.out.print("Press Y/y to use our service again or other key to Exit:");
			f=sc.next().charAt(0);

		}while(f=='Y' || f=='y');		// Here do while loop terminates and ask for running the task again!!!

		System.out.println("Thank You!!!");
		System.out.println("\"WORLD BANK\"");
	}

	public static void depositMoney(int D)		//Static method to deposit money
	{	int sum=D;
		Atm f1=new Atm();
		f1.Z = 10500;

		if(sum>0){
			sum=sum+(f1.Z);
			System.out.println("Deposit Successful. New Balance: "+sum);}
		else{
			System.out.println("Invalid Amount. Please enter a Positive value");}
	}

	public static void withdrawAmount(int C)	//Static method to withdraw Amount
	{
		int sub=0;
		Atm f1=new Atm();
		f1.Z = 10500;

		if(C>0 && C<=(f1.Z)){			// Checks if the Amount is less than the available amount 
			sub=(f1.Z)-C;
			System.out.println("Withdrawal Successful. Remaining Balance is: "+sub);}
		else{
			System.out.println("Invalid Amount or Insufficient Balance");}
			
	
	}


}