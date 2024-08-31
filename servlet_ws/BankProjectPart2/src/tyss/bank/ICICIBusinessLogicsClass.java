package tyss.bank;

import java.util.Scanner;

public class ICICIBusinessLogicsClass implements ICICIBuinessLogicInterface{
	ICICIBankAccount account=new ICICIBankAccount();
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void withdrawAmt() {
		System.out.println("Enter The Password To Withdraw Funds: ");
		int userInputtedPwd=sc.nextInt();
		
		if(userInputtedPwd==account.getPwd())
		{
			System.out.println("Password Matches");
			System.out.println("Enter The Money To Withdraw Funds: ");
			int userInputtedWithdrawAmt=sc.nextInt();
			
			if(userInputtedWithdrawAmt>account.getBalance())
			{
				System.out.println("Insufficent Funds");
			}
			else
			{
				account.setBalance(account.getBalance()-userInputtedWithdrawAmt);
				System.out.println("Successfully Withdrawn "+userInputtedWithdrawAmt+" Rupees");
			}
			
			
		}
		else
		{
			System.out.println("Password Mismatch! Try Later");
		}
	}

	@Override
	public void depositAmt() {
		System.out.println("Enter The Password To Deposit Funds: ");
		int userInputtedPwd=sc.nextInt();
		
		if(userInputtedPwd==account.getPwd())
		{
			System.out.println("Password Matches");
			System.out.println("Enter The Money To Deposit: ");
			int userInputtedDepositAmt=sc.nextInt();
			
			if(userInputtedDepositAmt>50000.0)
			{
				System.out.println("Transaction Limit Exceeded. Per Day Limit:- 50000.0");
			}
			else
			{
				account.setBalance(account.getBalance()+userInputtedDepositAmt);
				System.out.println("Successfully Deposited "+userInputtedDepositAmt+" Rupees");
			}
			
		}
		else
		{
			System.out.println("Password Mismatch! Try Later");
		}
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Enter The Password To Check Balance");
		int userInputtedPwd=sc.nextInt();
		
		if(userInputtedPwd==account.getPwd())
		{
			System.out.println("Password Matches");
			System.out.println("Balance: "+account.getBalance());
		}
		else
		{
			System.out.println("Password Mismatch! Try Later");
		}
	}

	@Override
	public void displayAccount() {
		System.out.println("Enter The Password To Withdraw Funds: ");
		int userInputtedPwd=sc.nextInt();
		
		if(userInputtedPwd==account.getPwd())
		{
			System.out.println("Password Matches");
			System.out.println("Account Holder Name: "+account.getAccountHolderName());
			System.out.println("Branch Address: "+account.getBranchAddress());
			System.out.println("IFSC Code: "+account.getIfsc());
			System.out.println("Account Number: "+account.getAccountNumber());
			System.out.println("Contact Number: "+account.getPhoneNo());
		}
		else
		{
			System.out.println("Password Mismatch! Try Later");
		}
		
	}

	@Override
	public void changePwd() {
		//Assignment karo //
		
	}

}
