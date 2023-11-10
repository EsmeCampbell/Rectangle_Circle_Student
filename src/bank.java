public class bank {

    public int AccountNumber;
    public int balance;

    public bank(int pAccountNumber, int pBalance) {
        AccountNumber = pAccountNumber;
        balance = pBalance;
    }
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("The new balance is: " + balance);
    }
    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("The new balance is: " + balance);
    }
    public void getBalance(){
        System.out.println("The balance is: " + balance);
    }
    public void transfer(int amount){
        balance = balance +amount;
        System.out.println("After bank account 9574 transferred $" + amount + " to bank account " + AccountNumber + " is left with $" + balance);
    }
}