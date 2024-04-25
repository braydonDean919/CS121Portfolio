public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(double balance, int accNum,double interestRate){
        super(balance, accNum);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public String toString(){
        return String.format("Account Number: %d\nBalance: %.2f\nInterest Rate: %% %.2f", accNum, balance,interestRate);
    }
}
