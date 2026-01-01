// UserdefineCheckedException


class  InvalidAmountException extends RuntimeException
{
    public InvalidAmountException(String message)
    {super(message);}
}

public class UserdefineChecked 
{
    double balance = 5000;

    void withdraw(double amount)
    {
        if (amount <=0 )
        {
            throw new InvalidAmountException("Amount must be greater than zero");
        }

        if (amount > balance)
        {
            throw new RuntimeException("Insufficient balance");
        }
        balance -= amount;
        
    }
}
