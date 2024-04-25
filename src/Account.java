public class Account {
    protected double balance;
    protected int accNum;

    private static int numAccounts = 1000;
    public Account(double balance, int accNum){
        this.balance = balance;
        this.accNum = accNum;
        numAccounts++;
    }
    public void deposit(double amount){
        balance+= amount;
        System.out.println("You deposited $" + amount);

    }
    public void withdraw(double amount){
        if(amount < balance) {
            balance -= amount;
            System.out.println("You withdrew $" + amount);
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString(){
        return String.format("Account Number: %d\nBalance: %.2f", accNum, balance);
    }

}
