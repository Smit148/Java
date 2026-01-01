class  Bank 
{
    private double balance;

    public Bank(double balance)
    { this.balance = balance; }

    public void withdraw(double amount)
    {
        if (amount > balance)
        {
            throw new IllegalArgumentException(
                "Insufficient Balance! You have only "+balance+" Rs"
            );
        }
        balance -= amount;
        System.out.println("Withdraw of "+amount+" Successfull, Your Remaining Balance is "+balance);
    }

    public static void main(String[] args) 
    {
        Bank account = new Bank(5000);

        account.withdraw(6000);
        account.withdraw(3000);
    }    
}
