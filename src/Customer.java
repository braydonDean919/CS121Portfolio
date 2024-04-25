import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private int pin;
    ArrayList<Account> customerAccounts = new ArrayList<>();
    public Customer(String firstName, String lastName, int pin){
        this.firstName =firstName;
        this.lastName = lastName;
        this.pin = pin;
    }
    public void addAccount(Account account){
        customerAccounts.add(account);
    }
    public void removeAccount(Account account){
        customerAccounts.remove(account);
    }
    public Account getAccount(int accountNum){
        Account placeAccount = null;
        for(Account account: customerAccounts){
            if(account.getAccNum() == accountNum){
                placeAccount = account;
                break;
            }
        }
        return placeAccount;
    }
    public ArrayList<Account> getCustomerAccounts(){
        return customerAccounts;
    }

    public int getPin() {
        return pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString(){
        return String.format("Name: %s %s \nPin: %d",firstName, lastName,pin);
    }
}
