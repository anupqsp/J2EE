package tyss.bank;

import java.util.Scanner;

public class ICICIBankDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("********WELCOME TO ICICI NET BANKING********");
		System.out.println("Create Your Account************************************");
		
		
		
		ICICIBuinessLogicInterface icici=new ICICIBusinessLogicsClass();
		
		while(true)
		{
			System.out.println("Enter Your Options: ");
			System.out.println("1.Withdraw Funds");
			System.out.println("2.Deposit Funds");
			System.out.println("3.Check Balance");
			System.out.println("4.Display Account");
			System.out.println("5.Exit");
			int options=sc.nextInt();
			
			switch(options)
			{
				case 1:
				{
					icici.withdrawAmt();
				}
				break;
				
				case 2:
				{
					icici.depositAmt();
				}
				break;
				
				case 3:
				{
					icici.checkBalance();
				}
				break;
				
				case 4:
				{
					icici.displayAccount();
				}
				break;
				
				case 5:
				{
					System.out.println("Thank You For Visiting ICICI Net Banking");
					System.exit(0);
				}
				break;
				
				default:
				{
					System.out.println("Invalid Options");
				}
			}
		}
		}

}

