package tyss.bank;

public class ICICIBankAccount {
    private String accountHolderName;
	private long accNo;
	private String ifsc;
	private String branchAddress;
	private double balance;
	private long phoneNo;
	private int pwd;
	
	// getter //
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public long getAccountNumber()
	{
		return accNo;
	}
	
	public String getIfsc()
	{
		return ifsc;
	}
	
	public String getBranchAddress()
	{
		return branchAddress;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public long getPhoneNo()
	{
		return phoneNo;
	}
	
	public int getPwd()
	{
		return pwd;
	}
	
	// SETTER METHODS //
	
	public void setBranchAddress(String branchAddress)
	{
		this.branchAddress=branchAddress;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	
	public void setPwd(int pwd)
	{
		this.pwd=pwd;
	}
	
	public ICICIBankAccount()
	{
		this.accountHolderName="Katappa";
		this.accNo=34567325378491l;
		this.ifsc="ICIC40457";
		this.branchAddress="Marahtalli-Old-Airport-Road";
		this.balance=67500.5;
		this.phoneNo=7026228873l;
		this.pwd=2321;
	}
			

}
