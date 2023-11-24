public class BankAccount {
    int balance;
    public BankAccount(int startingBalance){
        balance = startingBalance;
    }

    public BankAccount(int transferredBalance, int amountExpected){
        int newBalance = transferredBalance;
        int amountOnReceival = amountExpected;
        newBalance = amountOnReceival + balance;

    }
    
    public void checkBalance(){
        System.out.println("Welcome. Your balance is " +balance);
    }
    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited " +amountToDeposit);
        System.out.println("Your new balance is " +balance);
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " +amountToWithdraw
        );
        System.out.println("Your new balance is " +balance);
        return amountToWithdraw;
    }

    public String toString(){
        return "The account balance is now " +balance+ ". Do have yourself a wonderful day!";
    }

    public static void main(String[] args){
        BankAccount savings = new BankAccount(30000);
        BankAccount checkings = new BankAccount(3000, 3000);
        savings.checkBalance();
        savings.deposit(5000);
        savings.withdraw(23000);
        System.out.println(savings);
    }
}
